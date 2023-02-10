import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter money(THB) : ");
        double thb = input.nextDouble();
        double rate = 35.50;
        double usd = thb / rate;
        input.close();
        String pattern = "0.00";
        DecimalFormat df = new DecimalFormat(pattern);
        String usd2 = df.format(usd);

        System.out.print(thb + " THB to USD is " + usd2 + " USD");

    }
}