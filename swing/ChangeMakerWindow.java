import javax.swing.JOptionPane;

public class ChangeMakerWindow {
 public static void main (String [] args)
 {
 String amountString = JOptionPane.showInputDialog (
 "Enter a whole number from 1 to 99.\n" +
 "I will output a combination of coins\n" +
 "that equals that amount of change.");
 int amount, originalAmount,
 quarters, dimes, nickels, pennies;
 amount = Integer.parseInt (amountString);
 originalAmount = amount;
 quarters = amount / 25;
 amount = amount % 25;
 dimes = amount / 10;
 amount = amount % 10;
 nickels = amount / 5;
 amount = amount % 5;
 pennies = amount;
 JOptionPane.showMessageDialog (null, originalAmount + " cents in coins can be given as:\n" +
 quarters + " quarters\n" +  dimes + " dimes\n" + nickels + " nickels and\n" + pennies + " pennies");
 System.exit (0);
 }
}
