public class Constructor2 {
   int age;
   String name;
   //Default constructor
   Constructor2(){
	this.name="Ama";
	this.age=21;
   }
	
   //Parameterized constructor
   Constructor2(String name,int age){
	this.name=name;
	this.age=age;
   }
   public static void main(String args[]){
	Constructor2 obj1 = new Constructor2();
	Constructor2obj2 = 
		       new Constructor2("Bima", 18);
	System.out.println(obj1.name+" "+obj1.age);
	System.out.println(obj2.name+" "+obj2.age);
   }
}