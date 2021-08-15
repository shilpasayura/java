import java.io.*;
import java.util.*;

public class CountWords {
	
	public static void main(String[] args) throws IOException {
		//read text file - need a try catch blok here
	//	BufferedReader reader = new BufferedReader(new FileReader(new File("input.txt")));
		
   BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("F:\\git\\java\\advanced\\input.txt"));
  } catch (IOException e) {
       e.printStackTrace();
       reader.close();
   }

      //create empty HashMap
		Map<String, Integer> dictionary = new HashMap<String, Integer>();
		//how to create empty Hashtable 
		//Map<String, Integer> dictionary = new Hashtable<String, Integer>();
		String inputLine;
		while((inputLine = reader.readLine()) != null) {
			// Split the input line.
			String[] words = inputLine.split("\\s+");
	     	
			// Ignore empty lines.
			if(inputLine.equals(""))
				continue;
			
			for(String word: words) {
				// Remove any commas and dots.
				word = word.replace(".", "");
				word = word.replace(",", "");

				//check if exsist
				if(dictionary.containsKey(word)) {
					Integer val = dictionary.get(word);
					dictionary.put(word, val + 1);
				}
				else
					dictionary.put(word, 1);
			}
		}
		reader.close();
      
		// Printing all words stored in the map.
		for(String key: dictionary.keySet())
			System.out.println(key + ": " + dictionary.get(key));{
      }
	}
}