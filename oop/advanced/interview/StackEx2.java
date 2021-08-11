import java.util.*;

class StackEx2 {
	public static void main(String[] args){

		// Initialization of Stack using Generics
		Stack<String> stack1 = new Stack<String>();

		// pushing the elements
      stack1.add("All");
		stack1.add("Silver");
		stack1.push("Tea");
      stack1.push("Cups");
		stack1.add(2, "Cool");
      // Fetching the element at the head
      System.out.println("Top : " + stack1.peek());
      stack1.set(2, "Wool");
      System.out.println( "At 3 is " + stack1.get(2));
      System.out.println( "Size : " +stack1.size());
      System.out.println( stack1.indexOf("Cups", 0));
      // Priniting the Stack Elements
		//System.out.println(stack1);
		System.out.println(stack1);
      System.out.println("Pop : " + stack1.pop());
      System.out.println(stack1);
      
      String[] arr = new String[stack1.size()];
      arr = stack1.toArray(arr);
      for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
      }
	}
}
