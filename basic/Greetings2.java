public class Greetings2 {

  public static void printGreeting() {
    System.out.println("Hello!");
  }

  public static void printGreeting(String name) {
    System.out.println("Hello " + name + "!");
  }

public static void main(String[] args) {
printGreeting();
String name= "Niranjan";
printGreeting( name);
    }
}