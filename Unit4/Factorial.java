

public class Factorial {
	
	public static int factorial(int n){
		int value = 1; 
		for(int i = 1; i <= n; i++){
			value *= i; 
		}
		return value; 
	}
	
	public static void main (String[] args) {
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		System.out.println(factorial(4));
	}
}

