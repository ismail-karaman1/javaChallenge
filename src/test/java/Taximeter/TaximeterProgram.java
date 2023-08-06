package Taximeter;
import java.util.Scanner;
import java.text.DecimalFormat;
/*
       ** Taximeter Program **
The base fare (starting fee) is 10 TL.
The fare per kilometer is 2.20 TL.
The minimum fare is 20 TL. If the calculated fare is below 20 TL, it will be set to 20 TL.
        */
public class TaximeterProgram {
    public static void main(String[] args) {
        // Variables for distance, price, price per kilometer, minimum price, and open price
        double distance, price, perKilometer = 2.20, minPrice;
        int openPrice = 10;

        // I used the Scanner class to get input from the user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance: ");
        distance = input.nextDouble();

        // Calculate the initial price based on the distance and per-kilometer rate, then add the open price
        price = (distance * perKilometer) + openPrice;

        // If the calculated price is less than 20, set the minimum price to 20, otherwise keep the calculated price
        minPrice = distance < 5 ? 20 : price;

        // Create a DecimalFormat object to format the minimum price with two decimal places
        DecimalFormat decimalFormat = new DecimalFormat("#.##");


        System.out.print("Price for the traveled distance: " + decimalFormat.format(minPrice) + " TL");
    }
}
