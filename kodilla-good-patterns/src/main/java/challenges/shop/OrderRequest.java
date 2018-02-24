package challenges.shop;

import java.time.LocalDate;
import java.time.LocalDateTime;

//tworzy zamówienien od określonego klienta i je obsługuje
//kleinta w konstruktorze przysyłamy z klasy OrderRequestRetriever

public class OrderRequest {
    private User user;
    private Product product;
    private LocalDateTime dateOfOrder;
    private LocalDateTime dateOfDelivery;


    public OrderRequest(final User user, final Product product, final LocalDateTime dateOfOrder, final LocalDateTime dateOfDelivery) {
        this.user = user;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
        this.dateOfDelivery = dateOfDelivery;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public LocalDateTime getDateOfDelivery() {
        return dateOfDelivery;
    }
}
