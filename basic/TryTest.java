import java.util.Scanner;

class TryTest {
 public static void main(String[] args) {
   int count = 0;
   int maxTries = 3;
   String input;
   int value=0;
   boolean dataok =false;
   Scanner in = new Scanner(System.in);
   
   while(true) {
      try {        
        // Some Code
        // break out of loop, or return, on success
         System.out.print("Enter a number: ");
         input = in.next();
         value=Integer.parseInt(input);
         in.close();
         dataok =true;
         break;
      } catch (Exception e) {
        // handle exception
        count++;
        System.out.println("Error : " + e + "\nTried " + count);
         if (count > maxTries) {
            //throw e;
            in.close();
            break;
         }
       } // try
   }//while
 
   if (dataok ==true){
      System.out.println("Value " + value);
   }else{
      System.out.println("Data Error");
   }
}
}