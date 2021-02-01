import java.util.Scanner;

public class Question {

    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of England ?");
        keyboard.next();

        System.out.println("What is capital of Bangladesh ?");
        keyboard.next();

        System.out.println("What is 10 multiplied by 10 ?");
        keyboard.nextInt();

        System.out.println("Enter a number between 0.00 and 1.5. ");
        keyboard.nextDouble();

        System.out.println("Is there anything else you would like to say ?");
        keyboard.next();
    }
}
