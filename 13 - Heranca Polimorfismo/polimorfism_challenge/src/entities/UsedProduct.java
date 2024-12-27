package entities;

import java.util.Date;

public class UsedProduct extends Product {

    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return System.out.printf("%s (used) $ %.2f (Manufacture date: %td/%tm/%tY) %n", name, price, manufactureDate, manufactureDate, manufactureDate).toString();
    }
}
