package challenges.food2Door;

import java.util.Objects;

public class Product {
    private String name;
    private double quantity;
    private Shop shop;

    //nie mogę zrozumieć, dlaczego nie mogę tutaj jako argument przesłać Shop Shop
    //intellij tworzy mi taki konstruktor domyslnie chciałem, żeby stworzyć produkt który ma pola
    //nazwa, ilość, producent (Shop)


    public Product(String name, double quantity, Shop shop) {
        this.name = name;
        this.quantity = quantity;
        this.shop = shop;
    }

    public String getName() {

        return name;
    }

    public double getQuantity() {

        return quantity;
    }

    public Shop getShop() {
        return shop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getQuantity(), getQuantity()) == 0 &&
                Objects.equals(getName(), product.getName()) &&
                Objects.equals(getShop(), product.getShop());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getQuantity(), getShop());
    }
}
