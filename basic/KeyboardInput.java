import java.util.Scanner;

public class KeyboardInput{ 
public static void main (String[] args) { 

//Create a Scanner object to read input from stdin.

Scanner scanner = new Scanner(System.in); 

// Read a full line of input from stdin and save it in a variable

String inputString = scanner.nextLine(); 

// Close the scanner object after reading 

scanner.close();
        
// Print a string literal saying
 System.out.println(inputString); 
 
} 

}
