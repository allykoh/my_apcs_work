public class missingChar{


public static boolean missingChar(String str, int n){
  String front = str.substring(0, n);
  String back = str.substring(n+1, str.length()); 
  
  return front + back; 
}

public static void testmissingChar(String str, int n, String expected){
	String result = missingChar(str, n);
	  if (result.equals(expected)) {
            System.out.println("PASS: missingChar(" + front + ", " + back + ") → " + front + back);
        } else {
            System.out.println("FAIL: missingChar(" + front + ", " + back + ") → " + front + back
                               + " (expected " + expected + ")");
        }
    }
    public static void main(String[] args){
		 testMissingChar("kitten", 1, "ktten");   
        testMissingChar("kitten", 0, "itten");   
        testMissingChar("kitten", 4, "kittn");  
        testMissingChar("Hi", 0, "i");           
        testMissingChar("Hi", 1, "H");           
        testMissingChar("code", 2, "coe");     
	}
}
