package xyz.ifkash.tax_example;

public class TaxReport {

    private TaxCalculator calculator;

    /*public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }*/

    public void show(TaxCalculator calculator) {
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }

    /* Setters */
    /*public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }*/

}
