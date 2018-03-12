package challenges.food2door2;

import java.util.Objects;

public class Product {
    private String productName;
    private String productType;
    private int productQuantity;
    private int productID;

    public Product(String productName, String productType, int productQuantity, int productNumber) {
        this.productName = productName;
        this.productType = productType;
        this.productQuantity = productQuantity;
        this.productID = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public int getProductNumber() {
        return productID;
    }

    @Override
    public String toString() {
        return "Product: " + productName + "; Type: " + productType +
                "; Quantity: " + productQuantity +
                "; Product ID: " + productID + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return productID == product.productID &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(productType, product.productType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productName, productType, productID)*7;
    }
}

