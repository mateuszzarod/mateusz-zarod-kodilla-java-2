package challenges.food2Door;

import java.util.List;
import java.util.Objects;

//szczegóły zamówienia
// w sumie ta klasa zajmuje się tylko przechowywaniem danych na temat każdego zamówienia?
//bo się zastanawiam, czy nie zrezygnować z niej i po prostu nie tworzyć zamówienia w taki sposób że:
// tworzę produkt (dane produktu + Shop z którego pochodzi
//tworzę obiekt ShoppingCart w którym dodaje te produkty


public class OrderDetails {


    private String shopDetails;
    private List<Product> products;

    public OrderDetails(String shopDetails, List<Product> products) {
        this.shopDetails = shopDetails;
        this.products = products;
    }

    public String getShopDetails() {

        return shopDetails;
    }

    public List<Product> getProducts() {

        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDetails)) return false;
        OrderDetails that = (OrderDetails) o;
        return Objects.equals(getShopDetails(), that.getShopDetails()) &&
                Objects.equals(getProducts(), that.getProducts());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getShopDetails(), getProducts());
    }
}
