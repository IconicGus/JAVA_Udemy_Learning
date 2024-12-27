package entities;

public class OutsourceEmployee extends Employee{

    private Double additionalCharge;

    public OutsourceEmployee() {
    }

    public OutsourceEmployee(Integer hours, String name, Double valuePerHour, Double additionalCharge) {
        super(hours, name, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge*1.1;
    }
}
