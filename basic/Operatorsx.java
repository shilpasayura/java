import java.util.Scanner;
 
public class Operatorsx {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  System.out.print("Input number 1 : ");
  int num1 = in.nextInt();
   
  System.out.print("Input number 2: ");
  int num2 = in.nextInt();
   
  System.out.println(num1 + " + " + num2 + " = " + 
  (num1 + num2));
   
  System.out.println(num1 + " - " + num2 + " = " + 
  (num1 - num2));
   
  System.out.println(num1 + " x " + num2 + " = " + 
  (num1 * num2));
   
  System.out.println(num1 + " / " + num2 + " = " + 
  (num1 / num2));
 
  System.out.println(num1 + " mod " + num2 + " = " + 
  (num1 % num2));

System.out.println(num1 + " mod " + num2 + " = " + 
  (num1++)); 
}}
