


// Base Class
class Parent {
	void show(){
		System.out.println("Parent's show()");
	}
}

// Inherited class
class Child extends Parent {
	// This method overrides show() of Parent
	/*
   @Override
	void show(){
		System.out.println("Child's show()");
	}
   */
}

public class OverRiding {
	public static void main(String[] args){
		
		Parent p = new Parent();
		p.show();
                Child c1 = new Child();
		c1.show();
		Parent c2 = new Child();
		c2.show();
	}
}

