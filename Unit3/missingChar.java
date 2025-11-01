public class missingChar{


public static String missingChar(String str, int n){
  String front = str.substring(0, n);
  String back = str.substring(n+1); 
  
  return front + back; 
}
public static void testmissingChar(String str, int n, String expected){
	String result = missingChar(str, n);
	  if (result.equals(expected)) {
            System.out.println("PASS: missingChar(" + str + ", " + n + ") → " + str + n);
        } else {
            System.out.println("FAIL: missingChar(" + str + ", " + n + ") → " + str + n
                               + " (expected " + expected + ")");
        }
    }
    public static void main(String[] args){
		testmissingChar("kitten", 1, "ktten");   
        testmissingChar("kitten", 0, "itten");   
        testmissingChar("kitten", 4, "kittn");  
        testmissingChar("Hi", 0, "i");           
        testmissingChar("Hi", 1, "H");           
        testmissingChar("code", 2, "coe");     
	}
}
