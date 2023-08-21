package ticketPrice;

import java.util.Scanner;

public class TicketPrice {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the distance in kilometers: ");
            int distance = input.nextInt();

            System.out.print("Enter your age: ");
            int age = input.nextInt();

            System.out.print("Enter the travel type (1: One-way, 2: Round-trip): ");
            int travelType = input.nextInt();

            input.close();

            // Data input validation.
            if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
                System.out.print("You entered invalid data.");
                return;
            }

            double basePrice = distance * 0.10;
            double discountRate = 0;

            if (age <= 12) {
                discountRate = travelType == 2 ? 0.60 : 0.50;
            } else if (age >= 12 && age <= 24) {
                discountRate = travelType == 2 ? 0.28 : 0.10;
            } else if (age >= 65) {
                discountRate = travelType == 2 ? 0.44 : 0.30;
            }

            double totalPrice = travelType == 1 ? basePrice - (basePrice * discountRate) : (basePrice - (basePrice * discountRate)) * 2;
            System.out.print("Amount to be paid: " + totalPrice + "TL");
        }
    }

