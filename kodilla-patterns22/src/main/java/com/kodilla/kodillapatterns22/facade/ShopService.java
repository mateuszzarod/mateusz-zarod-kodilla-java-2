package com.kodilla.kodillapatterns22.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class ShopService {
    private final List<Order> orders = new ArrayList<>();
    @Autowired
    private Authenticator authenticator;
    @Autowired
    private ProductService productService;

    //otworzy nowe zamówienie dla użytkownika.
    // sprawdza czy użytkownik jest zautoryzowany (jeżeli nie, to zwraca -1, a jeżeli tak - zwraca identyfikator utworzonego zamówienia).
    // sprawdza jaki jest maksymalny identyfikator zamówienia w kolekcji orders.
    // tworzy jest obiekt zamówienia i umieszczany w kolekcji orders,
    // a jego identyfikator jest zwracany użytkownikowi:
    public Long openOrder(Long userId){
        if (authenticator.isAuthenticated(userId)){
            Long maxOrder =(long) orders.stream()
                    .mapToInt(o -> o.getOrderId().intValue())
                    .max()
                    .orElse(0);
            orders.add(new Order(maxOrder+1, userId, productService));
            return maxOrder+1;
        } else {
            return -1L;
        }
    }

    //Metoda ta najpierw wyszukuje zamówienie o podanym identyfikatorze (przy pomocy .filter()),
    // a następnie na     //każdym znalezionym zamówieniu
    // wywołuje jego metodę getItems().add(Item item):
    public void addItem(Long orderId, Long productId, double qty){
        orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .forEach(o -> o.getItems().add(new Item(productId, qty)));
    }

    // odszukuje zamówienie o podanym identyfikatorze (przy pomocy .filter()) i
    //tworzy Iterator na odfiltrowanej liście zamówień (powinna tu być jedna pozycja). Następnie na tym zamówieniu
    //przeszukuje pozycje i odszukuje pozycję z podanym identyfikatorem produktu.
    //Jeżeli żądany produkt został odnaleziony, jest on usuwany z listy pozycji zamówienia i zwracana jest wartość
    //true. Jeżeli zamówienie o podanym identyfikatorze nie zostało znalezione lub nie zawierało wskazanego
    //produktu, zwracana jest wartość false:
    public boolean removeItem(Long orderId, Long productId){
        Iterator<Order> orderIterator = orders.stream()
                .filter(o->o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()){
            Order theOrder = orderIterator.next();
            int orderSize = theOrder.getItems().size();
            for (int n = 0; n < theOrder.getItems().size(); n++){
                if (theOrder.getItems().get(n).getProductId().equals(orderId)){
                    theOrder.getItems().remove(n);
                    return true;
                }
            }
        }
        return false;
    }

    public BigDecimal calculateValue(Long orderId){
        Iterator<Order> orderIterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()){
            Order theOrder = orderIterator.next();
            return theOrder.calculateValue();
        }
        return BigDecimal.ZERO;
    }

    public boolean doPayment(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            if (theOrder.isPaid()) {
                return true;
            } else {
                Random random = new Random();
                theOrder.setPaid(random.nextBoolean());
                return theOrder.isPaid();
            }
        }
        return false;
    }

    public boolean verifyOrder(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            boolean result = theOrder.isPaid();
            Random random = new Random();
            if (theOrder.isVerified()) {
                theOrder.setVerified(result && random.nextBoolean());
            }
            return theOrder.isVerified();
        }
        return false;
    }

    public boolean submitOrder(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            if (theOrder.isVerified()) {
                theOrder.setSubmitted(true);
            }
            return theOrder.isSubmitted();
        }
        return false;
    }

    public void cancelOrder(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            orders.remove(theOrder);
        }

    }
}


/*
@Service
public class ShopService {
    private final List<Order> orders = new ArrayList<>();

    @Autowired
    private Authenticator authenticator;

    @Autowired
    private ProductService productService;

    public Long openOrder(Long userId) {
        if (authenticator.isAuthenticated(userId)) {
            //jeśli użytkwonik jest zautoryzowany, zwraca identyfikator zamówienia
            Long maxOrder = (long) orders.stream()
                    .mapToInt(o -> o.getOrderId().intValue())
                    .max().orElse(0);
            orders.add(new Order(maxOrder + 1, userId, productService));
            return maxOrder + 1;

        } else {
            return -1L;
        }
    }

    public void addItem(Long orderId, Long productId, double qty) {
        orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .forEach(o -> o.getItems().add(new Item(productId, qty)));
    }

    public boolean removeItem(Long orderId, Long productId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            int orderSize = theOrder.getItems().size();
            for (int n = 0; n < theOrder.getItems().size(); n++) {
                if (theOrder.getItems().get(n).getProductId().equals(productId)) {
                    theOrder.getItems().remove(n);
                    return true;
                }
            }
        }
        return false;
    }

    public BigDecimal calculateValue(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            return theOrder.calculateValue();
        }
        return BigDecimal.ZERO;
    }

    public boolean doPayment(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            if (theOrder.isPaid()) {
                return true;
            } else {
                Random random = new Random();
                theOrder.setPaid(random.nextBoolean());
                return theOrder.isPaid();
            }
        }
        return false;
    }

    public boolean verifyOrder(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            boolean result = theOrder.isPaid();
            Random random = new Random();
            if (theOrder.isVerified()) {
                theOrder.setVerified(result && random.nextBoolean());
            }
            return theOrder.isVerified();
        }
        return false;
    }

    public boolean submitOrder(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            if (theOrder.isVerified()) {
                theOrder.setSubmitted(true);
            }
            return theOrder.isSubmitted();
        }
        return false;
    }

    public void cancelOrder(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            orders.remove(theOrder);
        }
    }*/
