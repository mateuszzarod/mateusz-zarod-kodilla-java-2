package challenges.food2Door;
import java.util.List;
import java.util.stream.Collectors;


public class HealthyShop implements Shop {

    private String name;

    public HealthyShop(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public OrderDetails orderDetails(ShoppingCart shoppingCart) {

        filterShop(shoppingCart);
    }

    //tutaj jeszcze nie wiem jak ta metoda ma zwrócić obiekt typu OrderDetails
    //dodałem w tej klasie getter i stream porównuje mi nazwe sklepu z koszyka
    // z nazwą implementacji klasy shop (getter) czy można tutaj użyć np. this?

    private void filterShop(ShoppingCart shoppingCart) {
        shoppingCart.getCart().stream()
                .filter(product -> product.getShop().equals(getName()));
    }

    @Override
    public boolean process(OrderDetails orderDetails) {

        return false;
    }
}

