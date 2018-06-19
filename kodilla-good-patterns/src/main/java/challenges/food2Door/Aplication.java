package challenges.food2Door;

/*
Firma “Food2Door” zajmuje się dystrybucją lokalnych i świeżych produktów z okolicznych wiosek.
        Produkty można zamawiać przez internet, a
        następnie kurier dostarcza je do naszego domu.
        W związku z jej dynamicznym rozwojem i pojawiającymi się nowymi producentami produktów,
        system musi zostać rozszerzony o podsystem podłączenia producentów.

        Proces zamawiania produktów od różnych producentów zawsze jest taki sam, jednakże nie istnieje żadna uwspólniona
        logika dla tego przypadku.

        Załóżmy, że osoba o imieniu Adam odpowiadająca za opracowywanie biznesowej strony aplikacji przedstawia nam
        zagadnienie do rozwiązania w następujący sposób:

        “Hej, słuchaj mamy taki problem - mamy już trzech producentów jedzenia:
        ExtraFoodShop,
        HealthyShop,
        GlutenFreeShop.
        Na horyzoncie pojawiają się nowe firmy, które chcą dołączyć do naszego łańcucha dostaw, niestety kodowanie procesu
        zamawiania dla każdego z dystrybutorów jest bardzo żmudne i do tego kod się wciąż powtarza.


        interfej Shop
        OrderProcess(Shop)

        1 metoda
        Pobieramy informacje o dostawcy (producent jedzenia) , oraz
        ilości
        rodzaju produktu

        String
        Int
        String

        Koszyk -> produkt -> producenta

        2 metoda
        Następnie każdy z producentów posiada metodę process().
        która pozwala na zrealizowanie tego zamówienia w danym sklepie

        Dalsza część również wygląda wszędzie tak samo, zwracane są informacje czy udało się zrealizować zamówienie

*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplication {

    public static void main(String[] args) {

        //zamawiasz produkty które są od różnych producentów
        //sklep zamia je od różnych producetnów
        //wysyła do klienta


        Shop shop1 = new ExtraFoodShop("ExtraFood");
        Shop shop2 = new HealthyShop("HealthyFood");

        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("Onion", 3, shop1.getName()));
        listOfProducts.add(new Product("Cucumber", 4, shop2.getName()));
        listOfProducts.add(new Product("BIO", 10, shop1.getName()));
        listOfProducts.add(new Product("Wheat", 5, shop1.getName()));

        ShoppingCart shoppingCart = new ShoppingCart(listOfProducts);

        OrderDetails orderDetails = new OrderDetails("ExtrafoodShop", listOfProducts);

        OrderService orderService = new OrderService(Arrays.asList(shop1, shop2));
        OrderSummary order = orderService.makeOrder(shoppingCart);
        System.out.println(order);

    }
}
