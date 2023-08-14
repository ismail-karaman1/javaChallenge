package cashier;
/*Grocery Cashier Program
        Write a program in Java that prints the total amount of the products purchased from the grocery store, according to the kilogram values, to the screen.

        Fruits and KG Prices

        Pear: 2.14 TL
        Apple : 3.67 TL
        Tomatoes: 1.11 TL
        Banana: 0.95 TL
        Eggplant : 5.00 TL*/
import  java.util.Scanner;
import java.text.DecimalFormat;
public class GroceryCashierProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[] fruits = {"Apple", "Pear", "Tomato", "Banana", "Eggplant"};
        double[] prices = {2.14, 3.67, 1.11, 0.95, 5.0};
        double[] quantities = new double[5];
        for(int i = 0; i<fruits.length; i++) {
            System.out.print("How many kilograms of" + fruits[i] + "?" + ":");
            quantities[i] = input.nextDouble();
        }
        double totalAmount = 0.0;
        for(int i=0 ; i < fruits.length; i++) {
            totalAmount += prices[i] * quantities[i];

        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedTotalAmount = decimalFormat.format(totalAmount);
        System.out.println("Total Amount: " + formattedTotalAmount + " TL");
        input.close();


    }
}
