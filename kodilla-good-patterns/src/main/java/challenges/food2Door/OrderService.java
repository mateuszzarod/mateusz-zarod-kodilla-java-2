package challenges.food2Door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {

    List<Shop> shops;

    public OrderService(List<Shop> shops) {

        this.shops = shops;
    }

    public OrderSummary makeOrder(ShoppingCart shoppingCart) {
        List<OrderDetails> orderDetailsList = shops.stream()
                .map(shop -> processShopingCart(shoppingCart, shop))
                .collect(Collectors.toList());
        return new OrderSummary(orderDetailsList);
    }

    private OrderDetails processShopingCart(ShoppingCart shoppingCart, Shop shop) {
        OrderDetails orderDetails = shop.orderDetails(shoppingCart);
        boolean process = shop.process(orderDetails);
        if (process == false) {
            throw new IllegalStateException("I don't have this!!");
        }
        return orderDetails;
    }

}

