package challenges.food2Door;
import java.util.List;


public class ExtraFoodShop implements Shop {


    //wyciąga elementy z kosztyka
    //wyciąga tylko te 'nasze'

    @Override
    public OrderDetails orderDetails(ShoppingCart shoppingCart) {
        return null;
    }

    @Override
    public boolean process(OrderDetails orderDetails) {
        return true;

        //zwraca czy są na stanie   return false;
    }
}

