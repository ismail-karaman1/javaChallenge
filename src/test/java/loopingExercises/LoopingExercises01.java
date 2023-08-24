package loopingExercises;
import java.util.Scanner;
public class LoopingExercises01 {
    public static void main(String[] args) {

        //A programme that prints the powers of 4 and 5 up to the entered number on the screen with Java loops.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        String resultFour = "";
        String resultFive = "";

        for (int i = 0; i <= number; i++) {
            int powerOfFour = (int) Math.pow(4, i);
            int powerOfFive = (int) Math.pow(5, i);

            if (powerOfFour <= number) {
                resultFour += powerOfFour + " ";
            }
            if (powerOfFive <= number) {
                resultFive += powerOfFive + " ";
            }
        }

        System.out.println("Power of four: " + resultFour);
        System.out.println("Power of five: " + resultFive);
        input.close();
    }

}
