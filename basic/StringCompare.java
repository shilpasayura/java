
import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args){    
    String x="hi";

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter hi or bye:");
    
    // String input
    String str = sc.nextLine();
   
  System.out.println("You Entered " + str);
  
  str=x;
  if ( str.contains(x) ){
         System.out.println("String Contains hi");
  }
    
 if ( str.equals(x)){
     System.out.println("String equals hi" );
     }
  
   if ( str.compareTo(x)==0){
    System.out.println("String CompareTo hi" );
    }
    
if ( str ==x){
        System.out.println("String == hi" );
 }
 sc.close();
 }
}
