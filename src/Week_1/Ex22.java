package Week_1;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);



        while(true) {
            System.out.println("Type the password: (password)");
            String password = reader.nextLine();

            if (password.equals("carrot")) {
                System.out.println("Right!");
                System.out.println("The secret is: meme memes!");
                break;

            } else {
                System.out.println("Wrong!");
            }

        }
    }
}