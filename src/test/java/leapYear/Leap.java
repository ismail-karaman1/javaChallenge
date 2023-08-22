package leapYear;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        year = input.nextInt();
        /*String  leapYear = ((year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) ? "Leap Year" : "Not Leap Year" ;
        System.out.print(leapYear);*/
         if ((year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.print(year + " is leap year.");
        }else {
            System.out.print( year + " Not leap year.");
        }
            //System.out.print(leapYear);
    }
}
