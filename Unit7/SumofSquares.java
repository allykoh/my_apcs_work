

public class SumofSquares {
	
	public static double sumofSquares(double[] n){
		double sum = 0.0; 
		for(int i = 0; i < n.length; i++){
			sum += n[i]*n[i]; 
		}
		return sum; 
	}
	public static void testSum(double[] n, double expected){
		double actual = sumofSquares(n); 
		if(actual == expected){
			System.out.println("Great! Expected: " + expected + " Actual: " + actual);
		}else{
			System.out.println("Oops! Expected: " + expected + " Actual: " + actual);
		}
	}
	
	public static void main (String[] args) {
		double[] sum = {0, 4.0, 5.0};
		double[] sum2 = {1.0, 2.0, 3.0};
		double[] sum3 = {2.0, 2.0};
		
		testSum(sum, 41.0); 
		testSum(sum2, 14.0); 
		testSum(sum3, 8.0);
	}
}

