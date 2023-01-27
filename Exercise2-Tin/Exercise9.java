import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter money(Dollar) : ");
        int dollar = input.nextInt();
        double bath = 35.50;
        double money = dollar * bath;
        System.out.print("You have money  " + money + " Bath");

    }
}