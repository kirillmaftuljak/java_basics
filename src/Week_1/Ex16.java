package Week_1;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type in number:");
        int number = Integer.parseInt(reader.nextLine());

        if (number % 2 == 0){
            System.out.println("Number "+ number +" is even");
        } else {
            System.out.println("Number "+ number +" is odd");
        }
    }
}
