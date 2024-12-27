package entities;

public abstract class TaxPayer {

    private String name;
    protected Double annualIncome;

    public TaxPayer(Double annualIncome, String name) {
        this.annualIncome = annualIncome;
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Double tax();
}
