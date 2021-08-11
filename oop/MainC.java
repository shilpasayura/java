public class MainC2 {
  int x;

public MainC2() {
    x = 7;
  
  }
  
  public MainC2(int y) {
      
    x = y;
  }

  public static void main(String[] args) {
    MainC2 myObj1 = new MainC2();
   
MainC2 myObj2= new MainC2(5);
 System.out.println(myObj1.x);
 System.out.println(myObj2.x);
 
}
}