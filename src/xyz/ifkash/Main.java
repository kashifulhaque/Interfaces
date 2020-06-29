package xyz.ifkash;

import xyz.ifkash.tax_example.TaxCalculator;
import xyz.ifkash.tax_example.TaxCalculator2018;
import xyz.ifkash.tax_example.TaxCalculator2019;
import xyz.ifkash.tax_example.TaxReport;

/*
* Uncomment the comments to run the code as per your liking.
* */
public class Main {

    public static void main(String[] args) {
    }

    private void pasteTheFollowingCodeInMainAndUncomment() {
        /* Poor man's dependency injection */
        // Constructor injection
        /*
        TaxCalculator calculator = new TaxCalculator2018(100_000);
        TaxReport report = new TaxReport(calculator);
        report.show();
        */

        // Setter injection
        /*
        report.setCalculator(new TaxCalculator2019());
        report.show();
        */

        // Method injection
        /*
        TaxCalculator calculator = new TaxCalculator2018(100_000);
        TaxReport report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2019());
        */
    }

}
