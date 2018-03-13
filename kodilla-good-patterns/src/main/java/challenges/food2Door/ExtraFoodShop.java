package challenges.food2Door;
import java.util.List;


public class ExtraFoodShop implements Shop {

    private String name;

    public ExtraFoodShop(String name) {
        this.name = name;
    }

    //wyciąga elementy z kosztyka
    //wyciąga tylko te 'nasze'

    @Override
    public OrderDetails orderDetails(ShoppingCart shoppingCart) {
        return shoppingCart.getCart();
    }

    @Override
    public boolean process(OrderDetails orderDetails) {
        return true;
    }

}

