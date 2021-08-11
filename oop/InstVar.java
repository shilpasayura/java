public class InstVar {
   String IV="instance variable";
	
public static void main(String args[]){
InstVar obj1=new InstVar();
InstVar obj2=new InstVar();
InstVar obj3=new InstVar();
			System.out.println(obj1.IV);	System.out.println(obj2.IV);
System.out.println(obj3.IV);	
obj2.IV = "Changed IV2";
obj3.IV = "Changed IV3";	System.out.println(obj1.IV);	System.out.println(obj2.IV);
System.out.println(obj3.IV);	
   }
}