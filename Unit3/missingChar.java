public class missingChar{


public static boolean missingChar(String str, int n){
  String front = str.substring(0, n);
  String back = str.substring(n+1, str.length()); 
  
  return front + back; 
}

public static void testmissingChar(String str, int n, boolean expected){
	boolean result = missingChar(str, n);
	  if (result == expected) {
            System.out.println("PASS: missingChar(" + front + ", " + back + ") → " + front + back);
        } else {
            System.out.println("FAIL: missingChar(" + front + ", " + back + ") → " + front + back
                               + " (expected " + expected + ")");
        }
    }
    public static void main(String[] args){
		
	}
}
