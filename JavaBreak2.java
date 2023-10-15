import java.util.Scanner;
public class JavaBreak2 {
  public static void main(String[] args) {
    Double number, sum = 0.0;
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print("Enter a number: ");
      //takes double input from user
      number = input.nextDouble();
      //if number is negative the loop breaks
      if (number < 0.0) {
        break;
      }
      sum += number;
    }
    System.out.println("Sum = " + sum);
  }
}