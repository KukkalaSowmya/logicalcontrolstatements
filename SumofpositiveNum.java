import java.util.Scanner;
public class SumofpositiveNum {
  public static void main(String[] args) {
    int sum = 0;
    //create an object of Scanner class
    Scanner input = new Scanner(System.in);
    //take integer input from the user
    System.out.println("Enter the number");
    int number = input.nextInt();
    //while loop continues untill entered positive number
    while (number >= 0) {
      //add only positive numbers
      sum += number;
      System.out.println("Enter a number");
      number = input.nextInt();
    }
    System.out.println("Sum = " + sum);
    input.close();
  }
}