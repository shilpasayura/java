import java.util.Scanner;

public class ArrChange {
	public static void main(String[] args) {
		//දත්ත ව්‍යුහය
		int[][] twodm = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
   {10, 11, 12}
		};
		
		System.out.println("Original Array:\n");
		
		print_array(twodm);
		
		System.out.println();
		
		System.out.println("After changing the rows and columns of the array:");
		System.out.println();
		transpose(twodm);
		}
	
	private static void transpose(int[][] twodm) {
		
		int[][] newtwodm = new int[twodm[0].length][twodm.length];
		
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				newtwodm[j][i] = twodm[i][j];
			}
		}
		
		print_array(newtwodm);
	}
	
	private static void print_array(int[][] twodm) {
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				System.out.print(twodm[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}


