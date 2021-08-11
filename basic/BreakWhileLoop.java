//Java while loop with  continue 
import java.util.Scanner;
 
class ContinueWhileLoop {
  public static void main(String[] args) {
    int n;
 
    Scanner input = new Scanner(System.in);
 
    while (true) {
      System.out.println("Input an integer");
      n = input.nextInt();
 
      if (n != 0) {
        System.out.println("You entered " + n);
        continue;
      }
      else {
        break;
      }
    }
  }
}