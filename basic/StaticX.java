public class StaticX {

// static method
public static int getTotal(int a, int b) {
  return a + b;
}
 
public static void main(String[] args) {
  int x = 3;
  int y = 2;
  System.out.println(getTotal(x,y)); // Prints: 5
}

}
