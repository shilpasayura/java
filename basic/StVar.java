public class StVar {
   public static String CV="class variable";
	
   public static void main(String args[]){
 StVar obj1 = new StVar();
 StVar obj2 = new StVar();
  System.out.println(obj1.CV);
System.out.println(obj2.CV);

obj2.CV="New Class Varisble";
  System.out.println(obj1.CV);
System.out.println(obj2.CV);

   }
}