package Week_1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type in number:");
        int radius = Integer.parseInt(reader.nextLine());

        if (radius > 0){
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }
    }
}
