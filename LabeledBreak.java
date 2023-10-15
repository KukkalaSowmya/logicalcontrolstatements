public class LabeledBreak{
  public static void main(String[] args){
    //for loop is labeled as first
    first:
    for(int i = 1; i < 5; i++) {
      //for loop is labeled as second 
      second:
      for(int j = 1; j < 3; j++) {
      System.out.println("i = " + i + "; j = " +j);
      //break statement breaks the loop
      if (i == 2)
        break second;
      }
    }
  }
}