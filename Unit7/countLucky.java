
public class CountLucky{
	
	public static int countLucky(int[] n){
		int value = 0; 
		for(int i = 0; i<n.length; i++){
			if(n[i] == 7 || n[i]%10 == 7){
				value++; 
			}
		}
		return value; 
	}
	
	public static void testLucky(int[] n, int expected){
		int actual = countLucky(n); 
		
		System.out.println("Numbers: " + java.util.Arrays.toString(n) + " # of lucky numbers: " + actual + " we got: " + expected); 
		if(actual == expected){
			System.out.println("Nice!"); 
		}else{
			System.out.println("Oof");
		}
	}
	
	public static void main (String[] args) {
		testLucky(new int[]{0, 7, 8, 17}, 2); 
		testLucky(new int[]{1, 2, 3, 4, 5}, 0);
		testLucky(new int[]{19, 17, 20}, 1); 
	}
}

