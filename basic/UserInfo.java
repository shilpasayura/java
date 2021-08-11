
import java.util.Scanner;

public class UserInfo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String fname, group, res;
        int age, height;
        boolean pcr;
      
        System.out.print("Please enter first name:");
        fname = scan.nextLine();
        System.out.print("Please enter group:");
        group = scan.nextLine();
        System.out.print("Please enter your age:");
        age=scan.nextInt();
        System.out.print("Please enter your height in cm:");
        height=scan.nextInt();
        System.out.print("Result of your PCR test?- ");  
        pcr= scan.nextBoolean();  
        
        if (pcr == true) {
			res="Positive";
        }
        else{
           res="Negative";
        }

        System.out.println("Student details");
       
        System.out.println("First Name: " + fname);
        System.out.println("Group: " + group);
        System.out.println("Age:" + age + " years");
        System.out.println("Height: " + height);
        System.out.println("PCR Result: " + res);
        }
}
