Public class Fibonacci{
	public static void main(String[] args){
		int a = 0; 
		int b = 1; 
		
		System.out.println("Fibonacci sequence:"); 
		
		for (int i = 0; i < 10; i++){
			System.out.println(b); 
			int c = a + b; 
			a = b; 
			b = c; 
		}
	}
}
