
public class Greetings{
	
	public static String Greetings(String str){
		return "Hello, " + str + ", how are you?"; 
	}
	public static void testGreetings(String str, String expected){
		String result = Greetings(str); 
		if (result.equals(expected)){
			System.out.println("PASS: Greetings("+ str +") -> " + result); 
		}else{
			System.out.println("FAIL: Greetings(" + str + ") -> (" + result + ") -> (expected: " + expected+")");  
		}
	}
	
	public static void main (String[] args) {
		testGreetings("Ally", "Hello, Ally, how are you?"); 
		testGreetings("Sera", "Hello, Sera, how are you?"); 
		testGreetings("Puppy", "Hello, Puppy, how are you?"); 
		testGreetings("Mother", "Hello, Mother, how are you?"); 
	}
}

