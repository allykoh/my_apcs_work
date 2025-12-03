
public class Reverse {
	public static String reverse(String str){
		String flip = ""; 
		for(int i = str.length()-1; i >= 0; i--){
			flip += str.charAt(i);
		}
		return flip; 
	}
	public static void testReverse(String str, String expected){
		String result = reverse(str); 
		
		if(result.equals(expected)){
			System.out.println("PASS: " +str+ " becomes " + result); 
		}else{	
			System.out.println("FAIL: " +str+ " becomes " + result + " not " + expected); 
		} 
	}
	
	public static void main(String[] args) {
		testReverse("bad", "dab");
		testReverse("Hello, world!", "!dlrow ,olleH");
		testReverse("tacocat", "tacocat");
	}
}

