public class JavaContinue1 {
  public static void main(String[] args) {
    //forloop
    for(int i = 1; i<= 10; ++i) {
      //if value of i is between 4 and 9
      //continue is executed
      if(i > 4 && i < 9) {
        continue;
      }
      System.out.println(i);
    }
  }
}