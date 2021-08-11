/*
* Hashtable is a concrete implementation of a Dictionary. 
* integrated into the collections framework. 
* It is similar to HashMap, but is synchronized.
* Hashtable stores key/value pairs in a hash table. 
* The key is hashed, and the resulting hash code is used as the 
* index the value stored within the table.
*/
 
import java.io.*; 
import java.util.*; 

class CollectionDemo { 

	public static void main(String[] args) 
	{ 
		// Creating instances of the array, 
		// vector and hashtable 
		int arr[] = new int[] { 1, 2, 3, 4,5,6,7,8,9,10 };
		 
		Vector<Integer> v = new Vector(); 
		
		Hashtable<Integer, String> h = new Hashtable(); 

		// Adding the elements into the vector 
		for (int i=0 ; i <10; i++){
			v.addElement(i * i); 
		}
		
		for (int i=0 ; i <10; i++){
		// Adding the element into the hashtable
		    String s="Java " + (2 * i) ; 
			h.put(i, s); 
		} 

		// Array instance creation requires [], 
		// while Vector and hastable require () 
		// Vector element insertion requires addElement(), 
		// but hashtable element insertion requires put() 

		// Accessing the first element of the 
		// array, vector and hashtable 
		System.out.println(arr[0]); 
		System.out.println(v.elementAt(0)); 
		System.out.println(h.get(0)); 
		
		// Array elements are accessed using [], 
		// vector elements using elementAt() 
		// and hashtable elements using get() 

		for (int i=0 ; i <10; i++){
			System.out.println(arr[i]); 
			System.out.println(v.elementAt(i)); 
			System.out.println(h.get(i));
		} 

	} 
} 
