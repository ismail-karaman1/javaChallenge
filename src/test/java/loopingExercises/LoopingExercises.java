package loopingExercises;

import java.util.Scanner;

public class LoopingExercises {
    public static void main(String[] args) {
       /* A programme that accepts inputs from the user until a single number is entered with Java loops,
          adds the numbers that are even and multiples of 4 from the entered values and prints them on the screen.*/

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);  // Tek sayı girildiği sürece döngü devam eder

        System.out.println("Sum of even and multiples of 4: " + sum);
    }
}
