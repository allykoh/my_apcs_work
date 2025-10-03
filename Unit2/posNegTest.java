public class posNegTest {
	public static boolean posNeg(int a, int b, boolean negative) {
  if(negative){
    return (a < 0 && b < 0); 
  }
  else{
    return ((a < 0 && b >0) || (a > 0 && b < 0)); 
  }
}

//to test the function 
public static void testposNeg(int a, int b, boolean negative, boolean expected){
	boolean result = posNeg(a, b, negative); 
	if (result == expected) {
		System.out.println("Pass: posNeg("+ a +", " + b +", " +negative + "): " + result); 
	}else{
		 System.out.println("FAIL: posNeg(" + a + ", " + b + ", " + negative + "): " + result + " (expected " + expected + ")"); 
	}
}
	public static void main(String[] args){
		//testing cases
		testposNeg(1,-1, false, true); 
		testposNeg(-1,1, false, true);
		testposNeg(-2,-3, true, true);
		testposNeg(-2,-3, false, false);
		testposNeg(1,1, false, false);
	}
}
