public class IfElseIf{
  public static void main(String[] args){
    int number = 0;
    //cheaks if number is greater than 0
    if (number > 0){
      System.out.println("The number is positive. ");
    }
    //checks if the number is less than 0
    else if(number < 0) {
      System.out.println("The number is negative. ");
    }
    //check if both condition is false
    else {
      System.out.println("The number is 0. ");
    }
  }
}