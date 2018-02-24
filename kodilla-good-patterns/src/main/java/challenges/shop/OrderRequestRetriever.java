package challenges.shop;

//RentRequestRetriever klasa odpowiedzialna za przyjmowanie daych np. z controlera
//pobiera dane wejściowe do apliakacji i zwwraca nam dowy obiekt OrderRquest który przechowuje te dane


import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        User user = new User("Olka", "Machlarz");
        Product product = new Product("pudełko", "zielone", 20);
        LocalDateTime dateOfOrder = LocalDateTime.of(2018, 8, 12, 14, 5);
        LocalDateTime dateOfDelivery = LocalDateTime.of(2018, 1, 12, 14, 1);

        return new OrderRequest(user, product, dateOfOrder, dateOfDelivery);

    }
}
