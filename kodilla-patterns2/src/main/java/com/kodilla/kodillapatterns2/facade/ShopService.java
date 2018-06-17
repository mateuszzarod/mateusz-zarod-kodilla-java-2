package com.kodilla.kodillapatterns2.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ShopService {
    private final List<Order> orders = new ArrayList<>();

    @Autowired
    private Authenticator authenticator;
    @Autowired
    private ProductService productService;

    //Metoda ta sprawdza czy użytkownik jest
    // zautoryzowany (jeżeli nie, to zwraca -1,
    // a jeżeli tak - zwraca identyfikator utworzonego zamówienia).
    // Następnie sprawdza jaki jest maksymalny identyfikator zamówienia
    // w kolekcji orders. W ostatnich krokach tworzony jest obiekt
    // zamówienia i umieszczany w kolekcji orders, a jego identyfikator
    // jest zwracany użytkownikowi:
    public Long openOrder(Long userId){
        if (authenticator.isAuthenticated(userId)){
            Long maxOrder = (long) orders.stream()
                    .mapToInt(o -> o.getOrderId().intValue())
                    .max().orElse(0);
            orders.add(new Order(maxOrder + 1, userId, productService));
            return maxOrder + 1;
        } else {
            return -1L;
        }

    }

    public void addItem(long orderId, Long productId, double qty){
        orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .forEach(o -> o.getItems().add(new Item(productId, qty)));
    }

    public boolean removeItem(Long orderId, Long productId){
        Iterator<Order> orderIterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()){
            Order theOrder = orderIterator.next();
            int orderSize = theOrder.getItems().size();
            for (int n = 0; n < theOrder.getItems().size(); n++){
                if(theOrder.getItems().get(n).getProductId().equals(productId)){
                    theOrder.getItems().remove(n);
                    return true;
                }
            }
        }
        return false;

    }

    public BigDecimal calculateValue(Long orderId){
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()){
            Order theOrder = orderIterator.next();
            return theOrder.calculateValue();
        }
        return BigDecimal.ZERO;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Authenticator getAuthenticator() {
        return authenticator;
    }

    public void setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
