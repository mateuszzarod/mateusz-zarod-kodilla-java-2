package challenges.shop;

//produkt sklepu

public class Product {
    private final String productName;
    private final String productDescription;
    private final double price;

    public Product(String productName, String productDescription, double price) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getPrice() {
        return price;
    }
}
