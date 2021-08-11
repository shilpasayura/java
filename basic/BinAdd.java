import java.util.Scanner;

public class BinAdd {
 public static void main(String[] args)
 {
  long b1, b2;
  int i = 0, remainder = 0;
  int[] sum = new int[20];

  Scanner in = new Scanner(System.in);

  System.out.println("Input binary number 1: ");
  b1 = in.nextLong();
  System.out.println("b1 = " + b1);
  System.out.print("Input  binary number 2: ");
  b2 = in.nextLong();
  System.out.println("b2 = " + b2);

  while (b1 != 0 || b2 != 0) 
  {
   sum[i++] = (int)((b1 % 10 + b2 % 10 + remainder) % 2);
   remainder = (int)((b1 % 10 + b2 % 10 + remainder) / 2);
   b1 = b1 / 10;
   b2 = b2 / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.print("Sum of two binary numbers: ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}