package challenges.food2Door;

public interface Shop {
    OrderDetails getorderDetails (ShoppingCart shoppingCart);
    boolean process(OrderDetails orderDetails);

    //bierze OrderDeatils
    //sprawdza czy ma takie na stanie
    //zwraca boolean - czy udało się czy nie
}