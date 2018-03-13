package challenges.food2Door;
import java.util.List;


public class HealthyShop implements Shop {

    private String name;

    public HealthyShop(String name) {
        this.name = name;
    }

    @Override
    public OrderDetails orderDetails(ShoppingCart shoppingCart) {
        return shoppingCart.getCart();
    }

    @Override
    public boolean process(OrderDetails orderDetails) {
        return false;
    }
}

