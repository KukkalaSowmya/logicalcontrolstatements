public class DefaultCase{
  public static void main(String [] args){
    int expression = 9;
    //Switch statement to check size
    switch(expression) {
      case 1:
        System.out.println("Small Size");
        break;
      case 2:
        System.out.println("Medium size");
        break;
      case 3:
        System.out.println("Large size");
        break;
        //default case:
      default:
        System.out.println("Unknown Size");
    }
  }
}