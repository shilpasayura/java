import java.util.Scanner;
 
public class Mathx {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  System.out.println("Input number 1 : ");
  int num1 = in.nextInt();
   
  System.out.println("num 1 = " + num1);
   
 
  System.out.println("Input number 2: ");
  int num2 = in.nextInt();
  
   System.out.println("num2 1 = "+ num2);
   
System.out.println("min = " + Math.min(num1,num2));

System.out.println("max = " + Math.max(num1,num2));

System.out.println("sqrt  num 1 = " + Math.sqrt(num1));

System.out.println("pow num1, num2 =" + Math.pow(num1, num2));

 }
}
