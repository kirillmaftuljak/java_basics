package Week_1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type in radius:");
        int radius = Integer.parseInt(reader.nextLine());

        double result = 2 * Math.PI * (double)radius;

        System.out.println("Circumference of the circle:" + result);
    }
}