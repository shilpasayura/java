import java.io.*;
import java.util.*;
 
// child  class

class Child{
    String name;
    int age ;
    String city;
   Child(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
 
/* Father class contains list of child Objects. It is associated with child
class through its Object(s). */

class Father{
    String name;
    private List<Child> children;
    Father(String name, List<Child> children) {
        this.name = name;
        this.children= children;
    }
    public List<Child> getChildren() {
        return children;
    }
}
 
/* Village class contains list of Father
Objects. It is associated with Father class through its Object(s).*/

class Village {
    String villageName;
    private List<Father> fathers;
    Village(String villageName, List<Father> fathers){
        this. villageName= villageName;
        this. fathers= fathers;
    }

    // count total children of all father's 
    // in a given Village  

    public int getTotalChildtenOfFathers(){
        int noOfChildren = 0;
        List<Child> children; 
        for(Father f : fathers) {
            children = f.getChildren();
            for(Child c : children){
                noOfChildren++;
            }
        }
        return noOfChildren;
    }
} 
 
public class Aggregation{
    public static void main (String[] args)  {
        Child c1 = new Child("Ama", 16, "Kandy");
        Child c2 = new Child("Bima", 18, "Kandy");
         
        Child c3 = new Child("Cima", 21, "Colombo");
        Child c4 = new Child("Duma", 24, "Colombo");
        Child c5 = new Child("Ema", 17, "Colombo"); 
  
        List <Child> children1 = new ArrayList<Child>();
        children1.add(c1);
        children1.add(c2);
    
        List <Child> children2 = new ArrayList<Child>();

        children2.add(c3);
        children2.add(c4);
        children2.add(c5);
        
        Father f1 = new Father("Sunil", children1);
        Father f2 = new Father("Anil", children2);
        
        List <Father> fathers = new ArrayList<Father>();
        fathers.add(f1);
        fathers.add(f2);

        // creating an instance of Village .

        Village v = new Village("Kitula", fathers );

        System.out.print("Total children in Village: "); 
        System.out.print(v.getTotalChildtenOfFathers());
    }
}
