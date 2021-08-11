public class Visibility {

  public static String duplicate(String s) {
    String t = s + ", " + s;
    return t;
  }

  public static void print1() {
      //ERROR: a is not defined
 System.out.println(a);  
  }

  public static void print2() {
   //ERROR: t is not defined
    System.out.println(t);   

  }

  public static void main(String[] args) {
    String a = "Hello";
    a = duplicate(a);
    System.out.println(a);
    print1();
    print2();
    System.out.println(a);
  }
}