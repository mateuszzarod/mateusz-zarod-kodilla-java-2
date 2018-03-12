package challenges.food2door2;
import java.util.List;

public class Dto {

    private List<Product> product;
    private Company company;
    private boolean isOrder;


    public Dto(List<Product> product, Company company, boolean isOrder) {
        this.product = product;
        this.company = company;
        this.isOrder = isOrder;
    }

    public List<Product> getProduct() {
        return product;
    }

    public Company getCompany() {
        return company;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
