

public class SumofSquares{
	
	
	public static int sumofSquares(int n){
		int value = 0; 
	for(int i = 1; i < n+1; i++){
		value += i*i; 
	}
	return value; 
} 
public static void testSum(int n, int expected){
	int actual = sumofSquares(n); 
	
	if(actual == expected){
		System.out.println("PASS: " + n + " becomes " + expected); 
	}else{
		System.out.println("FAIL: " + n + " becomes " + actual + " not " + expected); 
	}
	
}


	public static void main(String[] args){
		testSum(1, 1); 
		testSum(2, 5);
		testSum(3, 14); 
	}
	
}
