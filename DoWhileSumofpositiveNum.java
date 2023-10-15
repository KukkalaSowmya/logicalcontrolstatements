import java.util.Scanner;
public class DoWhileSumofpositiveNum {
  public static void main (String[] args){
    int sum = 0;
    int number = 0;
    //create object of scanner class
    Scanner input = new Scanner(System.in);
    //do...while loop continues until positive number entered
    do {
      //add only positive numbers
      sum += number;
      System.out.println("Enter a number");
      number = input.nextInt();
    } while(number >= 0);
    System.out.println("Sum = " + sum);
    input.close();
  }
}