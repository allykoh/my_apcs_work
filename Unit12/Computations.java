import java.util.*;

public class Computations {
	
	public static void main (String[] args) {
		
		int[][] myManArr = manArr(); 				
		int[][] myRanArr = randArr(6, 8); 
		double[][] myRanDubArr = randDoubleArr(6, 8); 
		
		printArr(myManArr);
		System.out.println();
		
		printArr(myRanArr);
		System.out.println();
		
		printDouble(myRanDubArr);
		System.out.println();
		
		System.out.println("smallest number (manual array): " + smallest(myManArr));
		System.out.println("smallest number (random array): " + smallest(myRanArr)); 
		
		System.out.println("sum of double array: " + sumDouble(myRanDubArr)); 
		
		
		String[][] words = {
			{"Apple", "banana", "Avocado"},
			{"cat", "Ant", "dog"},
			{"", "Aardvark", "elephant"}
		};
		
		System.out.println("words starting with A: " + startA(words));
	}
	
	
	public static int[][] manArr(){
		return new int[][] {
			{2, 5, 8, 10},
			{7, 24, 50, 1}, 
			{8, 90, 45, 3}
		}; 
	} 
	
	
	public static int[][] randArr(int rows, int columns){
		int[][] rArr = new int[rows][columns];
		
		for(int row = 0; row < rArr.length; row++){
			for(int col = 0; col < rArr[row].length; col++){
				rArr[row][col] = (int)(Math.random() * 100) + 1; 
			}
		}
		return rArr; 
	}
	
	

	public static double[][] randDoubleArr(int rows, int columns){
		double[][] rArr = new double[rows][columns];
		
		for(int row = 0; row < rArr.length; row++){
			for(int col = 0; col < rArr[row].length; col++){
				rArr[row][col] = Math.random() * 100; 
			}
		}
		return rArr; 
	}
	
	
	public static void printArr(int[][] arr){
		for(int[] row : arr){
			for(int num : row){
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void printDouble(double[][] arr){
		for(double[] row : arr){
			for(double num : row){
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	
	
	public static int smallest(int[][] arr){
		int smallestNum = arr[0][0]; 
		
		for(int[] row : arr){
			for(int num : row){
				if(num < smallestNum){
					smallestNum = num; 
				}
			}
		}
		return smallestNum;  
	}
	
	
	
	public static double sumDouble(double[][] arr){
		double sum = 0; 
		
		for(double[] row : arr){
			for(double num : row){
				sum += num; 
			}
		}
		return sum;  
	}
	
	
	
	public static int startA(String[][] words){
		int count = 0; 
		
		for(String[] row : words){
			for(String word : row){
				if(word != null && word.length() > 0 && word.toUpperCase().charAt(0) == 'A'){
					count++; 
				}
			}
		}
		return count; 
	}
}

