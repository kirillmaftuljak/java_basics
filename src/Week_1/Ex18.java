package Week_1;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());

        if (grade >= 0 && grade < 30) {
            System.out.println("Failed");
        } else if (grade >= 30 && grade < 35) {
            System.out.println("Grade: 1");
        } else if (grade >= 35 && grade < 40) {
            System.out.println("Grade: 2");
        } else if (grade >= 40 && grade < 45) {
            System.out.println("Grade: 3");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("Grade: 4");
        } else if (grade >= 50 && grade < 61) {
            System.out.println("Grade: 5");
        }
    }
}