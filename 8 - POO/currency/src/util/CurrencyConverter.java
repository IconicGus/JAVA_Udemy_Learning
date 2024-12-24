package util;

public class CurrencyConverter {

    public static final double FEE = 0.06;

    public static double amount(double quantity, double price){

        return (quantity * price) + (quantity * price * FEE);

    }

}
