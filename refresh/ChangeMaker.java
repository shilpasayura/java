
import java.util.Scanner;
public class ChangeMaker{
 public static void main (String [] args) {
 int amount, originalAmount,
 quarters, dimes, nickels, pennies;
 System.out.println ("Enter a whole number from 1 to 99.");
 System.out.println ("I will find a combination of coins");
 System.out.println ("that equals that amount ofchange.");
 Scanner keyboard = new Scanner (System.in);
 amount = keyboard.nextInt ();
 originalAmount = amount;
 quarters = amount / 25;
 amount = amount % 25;
 dimes = amount / 10;
 amount = amount % 10;
 nickels = amount / 5;
 amount = amount % 5;
 pennies = amount;
 System.out.println (originalAmount +
 " cents in coins can be given as:");
 System.out.println (quarters + " quarters");
 System.out.println (dimes + " dimes");
 System.out.println (nickels + " nickels and");
 System.out.println (pennies + " pennies");
 }
}
