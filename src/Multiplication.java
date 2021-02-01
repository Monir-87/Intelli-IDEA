import java.util.*;
public class Multiplication
{
    public static void main(String[] args)
    {
        int number1;
        int number2;
        int multiplication;
        System.out.println("Enter 1st number");
        number1 = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Enter 2nd number");
        number2 = Integer.parseInt(new Scanner(System.in).nextLine());
        multiplication = number1 * number2;
        System.out.println("The multiplication is:");
        System.out.println(multiplication);
    }
}