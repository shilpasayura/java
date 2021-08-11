import java.util.Scanner;

public class IfElseCondition {
  public static void main(String[] args) {
     
  Scanner sc = new Scanner(System.in);
  int x = sc.nextInt();
  
  if (x == 0) {
     System.out.println("Zero");
  }
  else if (x ==1) {
     System.out.println("One.");
  }
  else if (x ==2) {
     System.out.println("Two.");
  }
  else if (x ==3) {
     System.out.println("Three.");
  }
  else if (x ==4) {
     System.out.println("Four.");
  }
  else if (x ==5) {
     System.out.println("Five.");
  }
  else if (x < 0) {
     System.out.println("Below zero");
  }
  else {
   System.out.println("Above 5");
  }
}}
