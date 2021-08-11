import java.util.*;
import java.util.stream.*;

public class SortingKing {

	protected static int n=10;
	protected static int[] array = new int[n];
	protected static int ArraySize =n;
	
	
	public static void GenrateRandomArray(int max) {
		
		for (int i = 0; i < ArraySize; i++) {
			
			//array[i] = (int) (Math.random() * 10) + 10;
			array[i] = (int) (Math.random() * max);
		}
	}
	
	public static void  DispalyHArray() {
		
		/*
		 * --------------------------------------------------
		 * | 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  |
		 * ---------------------------------------------------
		 * | 13 | 10 | 12 | 17 | 14 | 15 | 16 | 17 | 11 | 19 |
		 * ---------------------------------------------------
		 */
		
		for (int i = 0; i < 51; i++)System.out.print("-");
		System.out.println();
		System.out.print("| ");
		for (int i = 0; i < ArraySize; i++) System.out.print(i + "  | ");
		System.out.println();
		
		for (int i = 0; i < 51; i++){
      System.out.print("-");
      }
		System.out.println();
		System.out.print("| ");
		for (int i = 0; i < ArraySize; i++) {
         System.out.print(array[i] + " | ");
      }
			
		System.out.println();
		for (int i = 0; i < 51; i++){
         System.out.print("-");
		}
      System.out.println();
	}
	
	//Display Array
	
	protected static void dislayArray() {

		System.out.print("-----------------------------------------------------------");
		System.out.println();

		for (int i = 0; i < ArraySize; i++) {   			
			System.out.print( i + "   | ");
		}
		System.out.println();

		System.out.print("-----------------------------------------------------------");
		System.out.println();
	    for (int i = 0; i < ArraySize; i++) {
			System.out.print(  array[i] +"  | ");
		}
		System.out.println();

		System.out.print("-----------------------------------------------------------");
		System.out.println();
	}
	
	public static void PrintHorizontalArray(int i , int j) {
		
		for (int n = 0; n < 51; n++){
         System.out.print("-");
      }
		System.out.println();
		System.out.print("| ");
		for (int p = 0; p < ArraySize; p++) {
         System.out.print(p + "  | ");
      }
		System.out.println();
		
		for (int q = 0; q < 51; q++){
         System.out.print("-");
      }
		System.out.println();
		System.out.print("| ");
		for (int x = 0; x < ArraySize; x++) {
         System.out.print(array[x] + " | ");
		}	
		
		System.out.println();
		for (int s = 0; s < 51; s++) {
         System.out.print("-");
      }
		System.out.println();
		
		if(j != -1){
			
			for (int k = 0; k < ((j * 5 )  + 2 ); k++){
            System.out.print(" ");
			}
			System.out.print(j);
		}
		
		
		if (i != -1) {
			
			for (int c = 0; c < (5* (i - j)  - 1); c++){
           System.out.print(" ");
			}
         System.out.print(i);
		}
		System.out.println();
	}
	

	public static void main(String[] args) {

		GenrateRandomArray(100);
      
      dislayArray();
      
		// SeachingAlgorithms.LinearSearch(array, 12);

		SortingAlgorithms.bubbleSort(array);

		// SortingAlgorithms.SelctionSort(array);

		//SortingAlgorithms.InsertionSort(array);
		
		//Test Merge Sort algorithms by uncommenting the following lines of code
		//dislayArray();
		//SortingAlgorithms.QuickSort(array);
		//dislayArray();

		// SeachingAlgorithms.BinarySearch(array, 17);
		
	 	//SortingAlgorithms.BucketSort(array, Helper.getMax(array));;
		
      dislayArray();
	}

	
	
}

class SortingAlgorithms {


	public static void bubbleSort(int[] Database) {

		for (int i = Database.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (Database[j] > Database[j + 1]) {

					Helper.Swap(Database, j, j + 1);
					// ArrayPartition.DisplayTheArray(i, j)

				}
				SortingKing.PrintHorizontalArray(i, j);

			}

		}

	}

public static void MergeSort(int[] array) {

		int[] arr = new int[array.length];

		System.arraycopy(array, 0, arr, 0, arr.length);

		int[] out = new int[arr.length];

		int[] temp; // temp array reference

		int n = arr.length;

		for (int i = 1; i < n; i *= 2) {
			for (int j = 0; j < n; j += 2 * i) {
				Helper.merge(arr, out, j, i);
			}

			temp = arr;
			arr = out;
			out = temp;

		}

		System.arraycopy(arr, 0, array, 0, arr.length);

	}


	/*
	 * Shellsort, also known as Shell sort or Shell's method, is an in-place
	 * comparison sort. It can be seen as either a generalization of sorting by
	 * exchange (bubble sort) or sorting by insertion (insertion sort). The method
	 * starts by sorting elements far apart from each other and progressively
	 * reducing the gap between them.
	 */
	public static void ShellSort(int[] Database) {
		int in, out, temp;
		int i = 1;

		while (i <= Database.length) {
			i = i * 2 + 1;
		}
		while (i > 0) {
			for (out = i; out < Database.length; out++) {
				temp = Database[out];
				in = out;

				while (in > i - 1 && Database[in - i] >= temp) {
					Database[in] = Database[in - i];
					in -= i;
				}
				Database[in] = temp;
			}
			i = (i - 1) / 2;

		}

	}

	public static void RadixSort() {
	}

	public static void HeapSort() {
	}

	/*
	 * In the Bucket Sorting technique, the data items are distributed in a set of
	 * buckets. Each bucket can hold a similar type of data. After distributing,
	 * each bucket is sorted using another sorting algorithm. After that, all
	 * elements are gathered on the main list to get the sorted form.
	 * 
	 * 
	 * Time Complexity: O(n + k) for best case and average case and O(n^2) for the
	 * worst case.
	 * 
	 * Space Complexity: O(nk) for worst case
	 */
	public static void BucketSort(int[] Database, int maxVal) {

		int[] bucket = new int[maxVal + 1];

		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		for (int i = 0; i < Database.length; i++) {
			bucket[Database[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				Database[outPos++] = i;
			}
		}

	}


	public static void InsertionSort(int[] Database) {

		for (int i = 0; i < Database.length; i++) {
			int j = i;

			int ValueToAdd = Database[i];

			while ((j > 0) && (Database[j - 1] > ValueToAdd)) {

				Database[j] = Database[j - 1];
				j--;

				SortingKing.PrintHorizontalArray(i, j);
			}

			Database[j] = ValueToAdd;

			SortingKing.PrintHorizontalArray(i, j);

			System.out.println("\nArray[i] =  " + Database[i] + "\nArray[j] = " + Database[j] + "\nValue to insert = "
					+ ValueToAdd);
		}
	}

	public static void QuickSort(int[] Database) {

		if (Database.length < 2) {
			return;
		} // array is already sorted

		Helper.QuickSortStep(Database, 0, Database.length - 1);

	}

	
	
	public static void Radixsort(int[] Database) {
	  
		int bucket[][]=new int[10][10];  
        int bucket_count[]=new int[10];  
        int i, j, k, remainder, NOP=0, divisor=1, larger, pass;  
        larger = Helper.getMax(Database);  
        while(larger>0)  
        {  
            NOP++;  
            larger/=10;  
        }  
        for(pass=0;pass<NOP;pass++) // Initialize the buckets  
        {  
            for(i=0;i<10;i++)  
            bucket_count[i]=0;  
            for(i=0;i<10;i++)  
            {  
                // sort the numbers according to the digit at passth place            
                remainder = (Database[i]/divisor)%10;  
                bucket[remainder][bucket_count[remainder]] = Database[i];  
                bucket_count[remainder] += 1;  
            }  
            // collect the numbers after PASS pass  
            i=0;  
            for(k=0;k<10;k++)  
            {  
                for(j=0;j<bucket_count[k];j++)  
                {  
                	Database[i] = bucket[k][j];  
                    i++;  
                }  
            }  
            divisor *= 10;  
        }  
	}
	
	
	

	
	public static void SeletionSort(int[] Database) {

		for (int i = 0; i < Database.length; i++) {

			int min = i;

			for (int j = i; j < Database.length; j++) {

				if (Database[min] > Database[j]) {

					min = j;

				}
			}

			Helper.Swap(Database, i, min);
			SortingKing.PrintHorizontalArray(i, -1);
		}
	}
}

class Helper {

	public static void QuickSortStep(int[] database, int leftBound, int rightBound) {

		if (leftBound >= rightBound)
			return; // indices have crossed;

		int pivot = database[rightBound];

		int leftInd = leftBound; // will scan leftward

		int rightInd = rightBound - 1;// will scan right until lager than the pivot


		while (leftInd <= rightInd) { // scan right until larger than the pivot

			while ((leftInd <= rightInd) && (database[leftInd] <= pivot)) {
				leftInd++;
			}

			while ((rightInd >= leftInd) && (database[rightInd] >= pivot)) {
				rightInd--;
			}

			if (leftInd < rightInd) { // both elements were found so swap

				Helper.Swap(database, leftInd, rightInd);
				SortingKing.PrintHorizontalArray(rightInd, database.length - 1); // print the array to show how many steps
																			// taken to solve the problem

			}

		} // loop continues until indices cross

		SortingKing.PrintHorizontalArray(leftInd, -1); // print the array to show how many steps taken to solve the problem
		Helper.Swap(database, rightBound, leftInd);

		QuickSortStep(database, leftBound, leftInd - 1); // left recursive call
		QuickSortStep(database, leftInd + 1, rightBound); // right recursive call
		

	}

	public static void Swap(int[] database, int j, int i) {
		int temp = database[j];
		database[j] = database[i];
		database[i] = temp;

	}

	
	//get maximum value in the array
	
	public static int getMax(int[] array) 
	{
	 int max = Arrays.stream(array).max().getAsInt();
	 
	 return max;
	}

	//merge two arrays
	public static void merge(int[] arr, int[] out,  int start, int i) {
		
		int x = start;
		int end1 = Math.min(start + i, arr.length);
		int end2 = Math.min(start + 2*i, arr.length);
		int y = start + i;
		int z = start;
		
		while((x < end1) && (y < end2)) 
			
			if(arr[x] >= arr[y])  {

				out[z++] = arr[x++];

			}
		
			
			else out[z++] = arr[y++];
			
		if(x < end1) {
			System.arraycopy(arr, x, out, z, end1 - x);
		}

		else if(y < end2) {
			System.arraycopy(arr, y, out, z, end2 - y);

		}
		
	}

	public static int calculateNumberOfDigitsIn(int maxNum) {
		// TODO Auto-generated method stub
		return 0;
	}	

}


