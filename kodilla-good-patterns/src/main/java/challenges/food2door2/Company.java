package challenges.food2door2;
import java.util.List;
import java.util.Objects;

public class Company {

    private String companyName;
    private String companyAdres;
    private int companyID;

    public Company(String companyName, String companyAdres, int companyID) {
        this.companyName = companyName;
        this.companyAdres = companyAdres;

        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAdres() {
        return companyAdres;
    }

    public int getCompanyID() {
        return companyID;
    }

    @Override
    public String toString() {
        return "Company name: " + '\'' + companyName + '\'' +
                "; Adres: " + companyAdres  + "; Company ID: " + companyID + "\n" + "\n" +
                "Order list: ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return companyID == company.companyID;
    }

    @Override
    public int hashCode() {

        return Objects.hash(companyID*7);
    }
}
