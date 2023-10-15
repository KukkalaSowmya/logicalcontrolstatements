public class JavaBreak1 {
  public static void main(String[] args) {
    //for loop
    for (int i = 1; i <= 10; ++i) {
      if (i == 5) {
        break;
      }
      System.out.println(i);
    }
  }
}