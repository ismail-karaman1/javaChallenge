package taxAmountCalculation;
import java.util.Scanner;
public class tax {
    public static void main(String[] args) {
        double price, tax = 18.0, taxPrice, totalPriceWithTax;
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Pleas,enter the price without tax: ");
        price = inputScanner.nextDouble();

        taxPrice = price * (tax / 100.0);
        taxPrice = Math.round(taxPrice * 100.0) / 100.0;
        totalPriceWithTax = price + taxPrice;
        System.out.println("Tax-free price: " + price + "TL");
        System.out.println("Tax price: " + taxPrice + "TL");
        System.out.print("Taxable payment amount: " + totalPriceWithTax + "TL");
    }
}