
public class RefObj{
   String name; 
   public static void main(String[] args) {
//Create new object P1 
RefObj P1= new RefObj();
P1.name="Ama";
System.out.println("P1: " + P1.name);
//create reference variable P3 and assign P1 
RefObj P3= P1;
System.out.println("P3: " + P3.name); //print P3
//Change P3
P1.name="Cima";
System.out.println("P1: " + P1.name); 
System.out.println("P3: " + P3.name);
P3.name="Duma";
System.out.println("P1: " + P1.name);
   }
}
