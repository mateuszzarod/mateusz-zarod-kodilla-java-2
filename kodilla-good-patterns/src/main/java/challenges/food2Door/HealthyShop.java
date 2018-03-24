package challenges.food2Door;
import java.util.List;
import java.util.stream.Collectors;


public class HealthyShop implements Shop {

    private String name;

    public HealthyShop(String name) {

        this.name = name;
    }

    @Override
    public OrderDetails orderDetails(ShoppingCart shoppingCart) {
        OrderDetails shop = shoppingCart.getCart().stream()
                .filter(product -> product.getShop())
                .collect(Collectors.toList());
        return shop;
        //jakiego koelktora użyć, na końcu, żeby zebrać te elementy należące do danego sklepu - to list jest ok?
        //nie wiem dlaczego pisze mi tutaj, że nie może przekonwertować na boolean
    }

    @Override
    public boolean process(OrderDetails orderDetails) {

        return false;
    }
}

