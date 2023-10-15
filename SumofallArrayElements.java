public class SumofallArrayElements
{
  public static void main(String[] args)
  {
    ////array of all elents
    int[] numbers = {3,4,5,6,7,-8,-9};
    int sum = 0;
    //iterating through each element of the array
    for (int number: numbers) {
      sum += number;
    }
    System.out.println("Sum = " +sum);
  }
}