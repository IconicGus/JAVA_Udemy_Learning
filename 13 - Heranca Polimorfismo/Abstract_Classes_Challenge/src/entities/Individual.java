package entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(Double annualIncome, String name, Double healthExpenditures) {
        super(annualIncome, name);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax(){
        if (annualIncome < 20000.00) {
            return (annualIncome*0.15) - (0.5*healthExpenditures);
        }
        else {
            return (annualIncome*0.25) - (0.5*healthExpenditures);
        }
    }
}
