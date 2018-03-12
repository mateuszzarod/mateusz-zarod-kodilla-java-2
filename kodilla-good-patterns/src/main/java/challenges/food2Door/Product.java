package challenges.food2Door;

import java.util.Objects;

public class Product {
    private String name;
    private double quantity;
    private Shop Shop;

    //nie mogę zrozumieć, dlaczego nie mogę tutaj jako argument przesłać Shop Shop
    //intellij tworzy mi taki konstruktor domyslnie chciałem, żeby stworzyć produkt który ma pola
    //nazwa, ilość, producent (Shop)

    public Product(String name, double quantity, challenges.food2Door.Shop shop) {
        this.name = name;
        this.quantity = quantity;
        Shop = shop;
    }

    public String getName() {

        return name;
    }

    public double getQuantity() {

        return quantity;
    }

    public challenges.food2Door.Shop getShop() {

        return Shop;
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
