
import java.util.Scanner;
public class EggsBasket2{
 public static void main (String [] args){
 int numberOfBaskets, eggsPerBasket, totalEggs;
 Scanner keyboard = new Scanner (System.in);
 System.out.println ("Enter the number of eggs in each basket:");
 eggsPerBasket = keyboard.nextInt ();
 System.out.println ("Enter the number of baskets:");
 numberOfBaskets = keyboard.nextInt ();
 totalEggs = numberOfBaskets * eggsPerBasket;
 System.out.println ("If you have");
 System.out.println (eggsPerBasket + " eggs per basket and");
 System.out.println (numberOfBaskets + " baskets, then");
 System.out.println ("the total number of eggs is " + totalEggs);
 System.out.println ("Now we take two eggs out of each basket.");
 eggsPerBasket = eggsPerBasket - 2;
 totalEggs = numberOfBaskets * eggsPerBasket;
 System.out.println ("You now have");
 System.out.println (eggsPerBasket + " eggs per basket and");
 System.out.println (numberOfBaskets + " baskets.");
 System.out.println ("The new total number of eggs is " + totalEggs);
 }
}
