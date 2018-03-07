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


        Wszyscy z tych producentów różnią się nieco implementacją, jednakże schemat zamawiania przebiega następująco:


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

public class Aplication {

    public static void main(String[] args) {

        Product product = new Product("ogorek", 2, new ExtraFoodShop());
        Product product1 = new Product("ser", 2, new ExtraFoodShop());







    }

}