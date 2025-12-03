

public class Factorial {
	
	public static int factorial(int n){
		int value = 1; 
		for(int i = 1; i <= n; i++){
			value *= i; 
		}
		return value; 
	}
	
	public static void testFactorial(int n, int expected){
		int actual = factorial(n); 
		if(actual == expected){
			System.out.println("PASS: the factorial of " + n + " is " + actual); 
		}else {
			System.out.println("FAIL: expected value of " + n + " is " + expected + ", the actual value is " + actual); 
	}
}
	public static void main (String[] args) {
		testFactorial(0, 1);
		testFactorial(1, 1);
		testFactorial(2, 2);
		testFactorial(3, 6);
	}
}

