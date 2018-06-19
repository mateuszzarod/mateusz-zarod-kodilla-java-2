package challenges.food2Door;

import java.util.List;
//   Pobieramy informacje o dostawcy (producent jedzenia) , oraz
//        ilości
//        rodzaju produktu

public class ShoppingCart {

    private List<Product> cart;

    public List<Product> addToShoppingCart(Product product) {
        cart.add(product);
        return cart;
    }

    public ShoppingCart(List<Product> cart) {

        this.cart = cart;
    }

    public List<Product> addToCart(Product product) {
        cart.add(product);
        return cart;
    }

    public List<Product> getCart() {

        return cart;
    }

    // przechowuje produkty w koszyku
    //lista produktów
    // każdy produkt ma producenta nazwę i ilość
    // zwraca listę co jest wkoszyku
}
