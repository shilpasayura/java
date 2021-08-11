//Program to compute area of a circle.

import java.util.Scanner;
public class CircleArea{
 public static void main (String [] args){
 double radius; //in inches
 double area; //in square inches
 Scanner keyboard = new Scanner (System.in);
 System.out.println ("Enter the radius of a circle in centimeters:");
 radius = keyboard.nextDouble ();
 area = 3.14159 * radius * radius;
 System.out.println ("A circle of radius " + radius + " cm");
 System.out.println ("has an area of " + area + " square cm.");
 }
}
