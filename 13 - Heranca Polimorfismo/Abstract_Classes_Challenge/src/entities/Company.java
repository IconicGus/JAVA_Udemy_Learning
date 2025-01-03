package entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company(Double annualIncome, String name, Integer numberOfEmployees) {
        super(annualIncome, name);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if(numberOfEmployees <= 10) {
            return annualIncome*0.16;
        }
        else {
            return annualIncome*0.14;
        }
    }
}
