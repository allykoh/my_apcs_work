
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
		System.out.println("smallest number: " + smallest(myManArr));
		System.out.println("smallest number: " + smallest(myRanArr));
	}
	
	
	public static int[][] manArr(){
		int[][] myArr = {{2, 5, 8, 10},
						{7, 24, 50, 1}, 
						{8, 90, 45, 3}}; 
						
		return myArr; 
	}
	public static int[][] randArr(int rows, int columns){
		int[][] rArr = new int[rows][columns];
		for(int row = 0; row < rArr.length; row++){
			for(int col = 0; col < rArr[0].length; col++){
				rArr[row][col] = (int)(Math.random()*100)+1; 
			}
		}
		return rArr; 
	}
	
	public static double[][] randDoubleArr(int rows, int columns){
		double[][] rArr = new double[rows][columns];
		for(int row = 0; row < rArr.length; row++){
			for(int col = 0; col < rArr[0].length; col++){
				rArr[row][col] = (Math.random()*100)+1; 
			}
		}
		return rArr; 
	}
	
	
	public static void printArr(int[][] charlie){
		for(int[] row : charlie){
			for(int num : row){
				System.out.print(num + " ");
			}
			System.out.println(); 
		}
	}
	public static void printDouble(double[][] charlie){
		for(double[] row : charlie){
			for(double num : row){
				System.out.print(num + " ");
			}
			System.out.println(); 
		}
	}
	
	public static int smallest(int[][] flo){
		int smallestNum = flo[0][0]; 
		for(int[] row : flo){
			for(int num : row){
				if(num < smallestNum){
					smallestNum = num; 
				}
			}
		}
		return smallestNum;  
	}
	public static double sumDouble(double[][] flo){
		double sum = 0; 
		for(double[] row : flo){
			for(double num : row){
				sum += num; 
				}
			}
		}
		return sum;  
	}
	
	
}

