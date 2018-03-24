package challenges.food2Door;
import java.util.List;
import java.util.stream.Collectors;


public class ExtraFoodShop implements Shop {

    private String name;

    public ExtraFoodShop(String name) {

        this.name = name;
    }

    //wyciąga elementy z kosztyka
    //wyciąga tylko te 'nasze'

    @Override
    public OrderDetails orderDetails(ShoppingCart shoppingCart) {
        OrderDetails shop = shoppingCart.getCart().stream()
                .filter(product -> product.getShop())
                .collect(Collectors.toList());
        return shop;
    }

    @Override
    public boolean process(OrderDetails orderDetails) {

        return true;
    }

}

