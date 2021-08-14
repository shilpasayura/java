import java.util.*;

class StackEx {
	public static void main(String[] args){

		// Initialization of Stack using Generics
		Stack<String> stack1 = new Stack<String>();

		// pushing the elements
      stack1.push("All");
		stack1.push("Silver");
		stack1.push("Tea");
      stack1.push("Cups");
		
      // Fetching the element at the head
      System.out.println("Top : " + stack1.peek());
      
      // Priniting the Stack Elements
		//System.out.println(stack1);
		System.out.println(stack1);
      System.out.println("Pop : " + stack1.pop());
      System.out.println(stack1);

	}
}
