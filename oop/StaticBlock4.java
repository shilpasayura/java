
/*Static block can be used to check conditions before execution of main begin.
*/

class StaticBlock4 {
  public static void main(String[] args) {
    System.out.println("You are using Windows operating system.");
  }
 
  static {
    String os = System.getenv("OS");
    if (os.equals("Windows") != true) {
      System.exit(1);
    }
  }