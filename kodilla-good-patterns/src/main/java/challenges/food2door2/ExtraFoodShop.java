package challenges.food2door2;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements CompanyProcess {

    private Company company;
    private List<Product> productList;

    public ExtraFoodShop(Company company, List<Product> productList) {
        this.company = company;
        this.productList = productList;
    }

    @Override
    public Company process(Company company) {
        return company;
    }

    @Override
    public List<Product> getProductList() {

        List<Product> listOfExtraFoodShop = new ArrayList<>();
        listOfExtraFoodShop.add(new Product("Shrimps","Luxury Food",46,1));
        listOfExtraFoodShop.add(new Product("Caviar","Luxury Food",7,2));
        listOfExtraFoodShop.add(new Product("Truffles","Luxury Food",15,3));
        listOfExtraFoodShop.add(new Product("Fresh tuna","Luxury Food",1,4));

        return listOfExtraFoodShop;
    }
}
