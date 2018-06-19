package com.kodilla.kodillapatterns22.facade.api;


import com.kodilla.kodillapatterns22.facade.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderFacade {

    @Autowired
    private ShopService shopService;

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    public void processingOrder(OrderDto order, Long userID) throws OrderProcessingException { //usuwamy słówko "final" z argumentów metody dla modułu 20.3

        boolean wasError = false;
        long orderId = shopService.openOrder(userID);
        LOGGER.info("Registering new order ID:" + orderId);

        if (orderId < 0) {
            LOGGER.error(OrderProcessingException.ERR_NOT_AUTORIZED);
            wasError = true;
            throw new OrderProcessingException(OrderProcessingException.ERR_NOT_AUTORIZED);
        }

        try {

            for (ItemDto orderItem : order.getItems()) {
                LOGGER.info("Adding item: " + orderItem.getProductId() + " " + orderItem.getQuantity() + " pcs");
                shopService.addItem(orderId, orderItem.getProductId(), orderItem.getQuantity());
            }
            BigDecimal value = shopService.calculateValue(orderId);
            LOGGER.info("Order value is: " + value + " USD");
            if (!shopService.doPayment(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_PAYMENT_REJECTED);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_PAYMENT_REJECTED);
            }
            LOGGER.info("Payment for order is done");
            if (!shopService.verifyOrder(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_VERIFICATION_ERROR);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_VERIFICATION_ERROR);
            }
            LOGGER.info("Order is ready to submit");
            if (shopService.submitOrder(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_SUBMITTING_ERROR);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_SUBMITTING_ERROR);
            }
            LOGGER.info("Order " + orderId + " submitted");

        } finally {
            if (wasError) {
                LOGGER.info("Canceling order " + orderId);
                shopService.cancelOrder(orderId);
            }
        }
    }
}