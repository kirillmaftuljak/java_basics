package Week_1;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type in year: ");
        int year = Integer.parseInt(reader.nextLine());

        if ((year % 400 == 0) || ((year % 100 != 0)) && ((year % 4 == 0))){
            System.out.println("The year is leap year.");
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}
