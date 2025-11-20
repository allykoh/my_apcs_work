

public class SumofSquares{
	
	
	public static int sumofSquares(int n){
		int value = 0; 
	for(int i = 1; i < n+1; i++){
		value += i*i; 
	}
	return value; 
}
	public static void main(String[] args){
		System.out.println(sumofSquares(1)); 
		System.out.println(sumofSquares(2));
		System.out.println(sumofSquares(3)); 
	}
	
}
