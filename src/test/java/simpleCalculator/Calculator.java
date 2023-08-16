package simpleCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();
        System.out.print("Select an operator (+, -, *, /): ");
        char select = input.next().charAt(0);// Read the first character of the input.
        switch (select){
            case '+':
                System.out.println("Addition result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication result: " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0) {
                    System.out.println("Division result: " + (num1 / num2));
                } else {
                    System.out.println("Please enter a number other than 0.");
                }
                break;
            default:
                System.out.println("Enter a valid operator!!!");
        }

        input.close(); // Close the Scanner

    }
}
