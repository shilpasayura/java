import java.util.Scanner;
public class DelimitersDemo{
 public static void main (String [] args){
 Scanner keyboard1 = new Scanner (System.in);
 Scanner keyboard2 = new Scanner (System.in);

 keyboard2.useDelimiter ("##");
 //The delimiters for keyboard1 are the whitespace characters.
 //The only delimiter for keyboard2 is ##.
 String s1, s2;
 System.out.println ("Enter a line of text with two words:");

 s1 = keyboard1.next ();
 s2 = keyboard1.next ();

 System.out.println ("the two words are \"" + s1 +  "\" and \"" + s2 + "\"");
 System.out.println ("Enter a line of text with two words");
 System.out.println ("delimited by ##:");
 s1 = keyboard2.next ();
 s2 = keyboard2.next ();
 System.out.println ("the two words are \"" + s1 + "\" and \"" + s2 + "\"");
 }
}
