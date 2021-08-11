import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s1, s2, h;         
        System.out.print("Enter  Side 1: ");
        s1 = input.nextDouble();
        System.out.print("Enter  Side 2: ");
        s2 = input.nextDouble();

        //square root of (s1^2 + s2^2)
        h = Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
 System.out.println("h  = " + h);
    }
}