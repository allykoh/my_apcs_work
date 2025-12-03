
public class CountOccurences {
	
	public static int countOccurences(String full, String str){
		int n = 0; 
		for(int i = 0; i < full.length()-str.length()+1; i++){
			if(full.substring(i, i + str.length()).equals(str)){
				n+=1; 
			}
		}
		return n; 
	}
	public static void testOccurences(String full, String str, int expected){
		int actual = countOccurences(full, str); 
		
		if(actual == expected){
			System.out.println("PASS: (" + str + ") in (" + full + ") occurs " + actual + " times"); 
		}else{
			System.out.println("FAIL: got " + expected + "correct: " + actual); 
		}
	}
	
	public static void main (String[] args) {
		testOccurences("Mississippi", "iss", 2); 
		testOccurences("bananana", "na", 3); 
		testOccurences("Falalala", "la", 3); 
	}
}

