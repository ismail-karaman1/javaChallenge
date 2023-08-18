package activity;
import java.util.Scanner;
public class ActivityRecommendation {
    public static void main(String[] args) {
                                //Conditions:
        // -If the temperature is less than 5, recommend "Skiing".
        // -If the temperature is between 5 and 15, recommend "Going to the cinema".
        // -If the temperature is between 10 and 25, recommend "Going for a picnic".
        // -If the temperature is greater than 25, recommend "Swimming".
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        heat = input.nextInt();

        if (heat <= 5 ) {
            System.out.print("You can go skiing.");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("You can go to the cinema.");
            }
            if (heat >= 10) {
                System.out.println("You can go for a picnic.");
            }
        } else {
            System.out.println("You can go swimming.");
        }
        input.close();
    }
}








