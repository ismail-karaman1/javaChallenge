package numberSorting;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
       /* int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        a = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        b = input.nextInt();
        System.out.print("Enter the 3rd number: ");
        c = input.nextInt();

        if (a>b && a>c) {
            if (b>c) {
                System.out.println("a>b>c");
            }else{
                System.out.print("a>c>b");
            }
        } else if (b>a && b>c) {
            if (c>a) {
                System.out.println("b>c>a");
            }else{
                System.out.print("b>a>c");
            }
        }else if (c>a && c>b) {
            if (b>a) {
                System.out.println("c>b>a");
            }else {
                System.out.print("c>a>b");
            }
        }else {
            System.out.println("invalid");
        } **/
               //***** Sorting the 3 numbers entered "from smallest to largest"
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the 3rd number: ");
        int number3 = input.nextInt();

        int[] number = {number1, number2, number3};
        int largestNumber = number[0];
        int smallestNumber = number[0];

        for (int i = 1; i < 3; i++) {
            if (number[i] > largestNumber) {
                largestNumber = number[i];
            }
            if (number[i] < smallestNumber) {
                smallestNumber = number[i];
            }
        }

        int medianNumber = 0;
        for (int i = 0; i < 3; i++) {
            if (number[i] != largestNumber && number[i] != smallestNumber) {
                medianNumber = number[i];
            }
        }

        System.out.println(smallestNumber + " < " + medianNumber + " < " + largestNumber);

        input.close();
    }

}
