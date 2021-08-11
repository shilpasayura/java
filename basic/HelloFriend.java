// HelloFriend.java
import java.util.Scanner;  // Import the Scanner class

class HelloFriend{
   public static void main(String[] args){
	    // Create a Scanner object
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter Your Name : ");
        String name=sc.next(); // Read user input
        System.out.println("Hello " + name);
        System.out.println("How are you?");
    }
}
