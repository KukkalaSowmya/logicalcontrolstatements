//java program to display numbers from 1 to 5
import java.util.Scanner;
//program to find the sum of natural numbers from 1 to 5
public class DoWhile1_5 {
  public static void main (String[] args) {
    int i = 1, n = 5;
    //do...while loop from 1 to 5
    do {
      System.out.println(i);
      i++;
    } while(i <= n);
  }
}