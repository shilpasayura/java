import java.awt.Point;

class ReferenceTest {
 public static void main (String args[]) {
 Point pt1, pt2;
 pt1 = new Point(100, 100);
 pt2 = pt1;
 pt1.x = 100;
 pt1.y = 100;
 System.out.println("Point1: " + pt1.x + ", "+ pt1.y);
 System.out.println("Point2: “ + pt2.x + ", "+ pt2.y);
pt2.x = 200;
System.out.println(,"Point1: “ + pt1.x + ", " + pt1.y);
 }
}