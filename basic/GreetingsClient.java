import java.util.Scanner;

public class GreetingsClient {
  public static void main(String[] args) {
    Greetings.printGreeting();
    Scanner scanner = new Scanner(System.in);

String fn = scanner.nextLine();

String ln= scanner.nextLine();
scanner.close();
    Greetings.printPersonalGreeting(fn,ln);
    Greetings.printInformalGreeting(fn);
    String  s= Greetings.personalGreeting(fn,ln);
System.out.println(s);
    System.exit(0);
  }
}