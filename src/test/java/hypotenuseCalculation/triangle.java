package hypotenuseCalculation;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        double firstEdge,secondEdge, hypotenuse, fieldLength, perimeter;
        // I used Scanner class to get edges from user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side length: ");
        firstEdge = input.nextDouble();
        System.out.print("Enter the second side length: ");
        secondEdge = input.nextDouble();
        hypotenuse = Math.sqrt(firstEdge * firstEdge + secondEdge * secondEdge);
        fieldLength = (firstEdge * secondEdge) / 2.0;
        perimeter = firstEdge + secondEdge + hypotenuse;


        System.out.println("hypotenuse length: " + hypotenuse);
        System.out.println("field length: " + fieldLength);
        System.out.print("perimeter length: " + perimeter);



        input.close();

    }
}
