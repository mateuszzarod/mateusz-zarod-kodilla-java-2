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

import java.util.ArrayList;
import java.util.List;

public class Aplication {

    public static void main(String[] args) {

        Shop shop1 = new ExtraFoodShop("ExtraFood");
        Shop shop2 = new HealthyShop("HealthyFood");
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add("carrot", 10, shop1);



        ShoppingCart shoppingCart = new ShoppingCart();
        OrderService orderService = new OrderService(null);


        OrderSummary order = orderService.makeOrder(shoppingCart);
        System.out.println(order);

    }

}
