package GradeAverageCalculation;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        //created variables
        int java,python,javaScript,kotlin,go;

        //Scanner created
        Scanner inputScanner = new Scanner(System.in);

        //get input  from user
        System.out.print("java note: ");
        java = inputScanner.nextInt();

        System.out.print("python note: ");
        python = inputScanner.nextInt();


        System.out.print("javaScript note: ");
        javaScript = inputScanner.nextInt();


        System.out.print("kotlin note: ");
        kotlin = inputScanner.nextInt();


        System.out.print("go note: ");
        go = inputScanner.nextInt();


        int total = (java + javaScript + python + kotlin + go);
        double resultAverage = total / 5;
        System.out.println("Your note average: " + resultAverage);
        String result = resultAverage >= 45 ? "You passed the clas" : "You failed the class";;
        System.out.print(result);
    }
}
