public class Thisx {
  int x;
  
  // Constructor with a parameter
  public Thisx(int x) {
    this.x = x;
  }

  // Call the constructor
  public static void main(String[] args) {
    Thisx myObj = new Thisx (5);
    System.out.println("Value of x = " + myObj.x);
  }
}

