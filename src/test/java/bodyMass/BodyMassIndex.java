package bodyMass;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight, height;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your weight: ");
        weight = input.nextDouble();
        System.out.print("Please enter your height (in meters): ");
        height = input.nextDouble();
        input.close();

        double bodyMassIndex = weight / (height * height);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedBodyMassIndex = decimalFormat.format(bodyMassIndex);
        System.out.println("Your Body Mass Index: " + formattedBodyMassIndex);


    }
}
