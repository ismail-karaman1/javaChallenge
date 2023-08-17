package passingGradeStatus;
import  java.util.Scanner;
public class Average {

        public static void main(String[] args) {
            int math, physics, chemistry, turkish, music;
            Scanner input = new Scanner(System.in);
            System.out.print("Your Math grade: ");
            math = input.nextInt();
            System.out.print("Your Physics grade: ");
            physics = input.nextInt();
            System.out.print("Your Chemistry grade: ");
            chemistry = input.nextInt();
            System.out.print("Your Turkish grade: ");
            turkish = input.nextInt();
            System.out.print("Your Music grade: ");
            music = input.nextInt();
            double totalGrade = 0;
            byte validGradeCount = 0;
            double average;
            double[] courses = {math, physics, chemistry, turkish, music};

            for (int i = 0; i < courses.length; i++) {
                if (0 < courses[i] && courses[i] < 100) { // Ensure that the entered course grades are between 0 and 100.
                    totalGrade += courses[i];
                    validGradeCount++;
                }
            }

            if (validGradeCount > 0) {
                average = totalGrade / validGradeCount;
                if (average > 55) {
                    System.out.println("You have passed the class.\nYour average: " + average);
                } else {
                    System.out.println("You have failed the class.\nYour average: " + average);
                }
            }
        }
    }







