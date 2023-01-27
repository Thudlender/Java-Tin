import java.util.Scanner;
public class Exercise3 {
    /**
     * @param args
     */
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("number 1");
    int a = input.nextInt();
    System.out.println("number 2");
    int b = input.nextInt();
    System.out.println("number 3");
    int c = input.nextInt();
    System.out.println("number 4");
    int d = input.nextInt();
    System.out.println("number 5");
    int e = input.nextInt();
    double average = (a+b+c+d+e)/5;
    System.out.println("Average of " +a+", " +b+", " +c+", " +d+" and " +e+" is "+average);
  }
}