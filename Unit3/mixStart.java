public class mixStart {
	public static boolean mixStart(String str) {
  if (str.length() < 3){
	  return false;
  }
 return str.substring(1, 3).equals("ix");
  }
public static void testmixStart(String str, boolean expected){ 
boolean result = mixStart(str); 
if (result == expected) {
        System.out.println("PASS: mixStart(\"" + str + "\") → " + result);
    } else {
        System.out.println("FAIL: mixStart(\"" + str + "\") → " + result +
                           " (expected " + expected + ")");
    }
}
	public static void main (String[] args) {
	testmixStart("mix snacks", true);
    testmixStart("pix snacks", true);
    testmixStart("piz snacks", false);
    testmixStart("mi", false);
	}
}

