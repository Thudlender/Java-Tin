import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your weight (kg)");
        double weight = input.nextDouble();
        System.out.print("Input your height (cm)");
        double height = input.nextDouble();
        double h = (height / 100);
        double bmi = weight / (h * h);
        System.out.println("Your bmi is : " + bmi);
        String status = " ";
        if (bmi >= 30)
            status = "Very fat";
        else if (bmi >= 25)
            status = "fat";
        else if (bmi >= 23)
            status = "Overweight";
        else if (bmi >= 18)
            status = "normal";
        else
            status = "Too skinny";
        System.out.println("You are : " + status);

    }
}