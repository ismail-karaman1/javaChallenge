package circle;
import java.util.Scanner;
import java.text.DecimalFormat;
public class CircleCalculation {
    public static void main(String[] args) {
        int radius;
        double angle;
        final double PI = 3.14; //I used the final keyword for the PI variable because it's a constant.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = input.nextInt();
        System.out.print("Enter angle in degrees: ");
        angle = input.nextDouble();

        input.close();

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        double sectorArea = (PI * radius * radius * angle) / 360.0;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");// Format with two decimal places
        String formattedSectorArea = decimalFormat.format(sectorArea);



        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);
        System.out.println("Sector Area: " + formattedSectorArea);
    }

}
