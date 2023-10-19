import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        // Write a little program here to randomly choose
        // one of six responses to the user's yes-no question!
        int choices = (int) (Math.random() * 6);
        if (choices == 0) {
            System.out.println("Outlook good!");
        } else {
            if (choices == 1) {
                System.out.println("Better not tell you now.");
            } else {
                if (choices == 2) {
                    System.out.println("Outlook not so good...");
                } else {
                    if (choices == 3) {
                        System.out.println("It is certain!");
                    } else {
                        if (choices == 4) {
                            System.out.println("Cannot predict now.");
                        } else {
                            System.out.println("Don't count on it...");
                        }
                    }
                }
            }
        }
    }
}