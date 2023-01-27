import java.util.Scanner;

public class Exercise1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("number 1");
        int number1 = input.nextInt();
        System.out.println("number 2");
        int number2 = input.nextInt();
        input.close();
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));
    }
}