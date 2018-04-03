package challenges.food2Door;

public interface Shop {

    OrderDetails orderDetails(ShoppingCart shoppingCart);
    boolean process(OrderDetails orderDetails);
    String getName();
    //bierze OrderDeatils
    //sprawdza czy ma takie na stanie
    //zwraca boolean - czy udało się czy nie
}
