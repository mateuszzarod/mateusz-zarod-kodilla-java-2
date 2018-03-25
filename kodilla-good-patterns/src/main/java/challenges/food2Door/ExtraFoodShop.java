package challenges.food2Door;
import java.util.List;
import java.util.stream.Collectors;


public class ExtraFoodShop implements Shop {

    private String name;

    public ExtraFoodShop(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    //wyciąga elementy z kosztyka
    //wyciąga tylko te 'nasze'

    @Override
    public OrderDetails orderDetails(ShoppingCart shoppingCart) {

        filterShop(shoppingCart);
    }

    private void filterShop(ShoppingCart shoppingCart) {
        shoppingCart.getCart().stream()
                .filter(product -> product.getShop().equals(getName()));
                //nie wiem czy tutaj trzeba jakąś operację terminalną

    }

    //tutaj jeszcze nie wiem jak ta metoda ma zwrócić obiekt typu OrderDetails
    //dodałem w tej klasie getter i stream porównuje mi nazwe sklepu z koszyka
    // z nazwą implementacji klasy shop (getter) czy można tutaj użyć np. this?



    @Override
    public boolean process(OrderDetails orderDetails) {

        return true;
    }

}

