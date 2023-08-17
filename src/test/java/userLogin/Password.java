package userLogin;

import java.util.Scanner;

public class Password {

        public static void main(String[] args) {
            // CHALLENGE:(!!!I wrote the challenge script myself :-)).
            // Design a password management system that checks and resets passwords based on the following rules:
            // 1. Password must be at least 8 characters long.
            // 2. No spaces allowed in the password.
            // 3. Password must contain at least 1 uppercase letter, 1 lowercase letter, and 1 digit.
            // 4. If the entered password is incorrect, ask the user if they want to reset their password.
            //    - If yes, allow the user to input a new password.
            //        - If the new password is the same as the old password, display a warning message.
            //        - If the new password meets all the criteria, set the new password as the user's password.


            String username, password, trueUsername = "ismail", truePassword = "Java1234";
            Scanner input = new Scanner(System.in);

            // Get user's username
            System.out.print("Please enter your username: ");
            username = input.nextLine();
            boolean usernameControl = username.matches("[a-z]+");

            // Get user's password
            System.out.print("Please enter your password: ");
            password = input.nextLine();
            boolean passwordControl = password.length() >= 8;
            boolean spaceControl = !password.contains(" ");
            boolean upperAndLowercaseControl = password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*[0-9].*");

            // Check username and password
            if (username.equals(trueUsername)) {
                if (truePassword.equals(password)) {
                    System.out.println("Login Successful");
                } else {
                    System.out.print("Incorrect password. Do you want to reset your password? (Yes/No): ");
                    String resetChoice = input.nextLine();
                    if (resetChoice.equalsIgnoreCase("Yes")) {
                        System.out.print("Please enter your new password: ");
                        String newPassword = input.nextLine();
                        if (newPassword.equals(password)) {
                            System.out.println("New password cannot be the same as the old password!");
                        } else if (newPassword.equals(truePassword)) {

                            System.out.println("Password updated successfully.");
                        } else {
                            System.out.println("Password could not be created. Please make sure your new password meets the requirements.");
                        }
                    }
                }
            } else {
                System.out.println("Invalid username.");
            }
        }
}
