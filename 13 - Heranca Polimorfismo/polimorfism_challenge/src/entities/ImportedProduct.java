package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(){
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
        this.totalPrice();
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return price += customsFee;
    }

    @Override
    public String priceTag() {
        return System.out.printf("%s $ %.2f (customs fee: $ %.2f)%n", name, price, customsFee).toString();
    }
}
