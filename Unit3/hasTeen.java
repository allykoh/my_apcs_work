public class hasTeen{
	
	public static boolean hasTeen(int a, int b, int c) {
  return (a>=13 && a<=19) ||
         (b>=13 && b<=19) ||
         (c>=13 && c<=19);
	}
	
	
	public static void testhasTeen(int a, int b, int c, boolean expected){
		boolean result = hasTeen(a, b, c); 
		if (result == expected){
			System.out.println("PASS: hasTeen(" + a + "," + b + "," + c + ") returned " + result); 
		} else {
        System.out.println("FAIL: hasTeen(" + a + ", " + b + ", " + c + ") returned " 
            + result + " but expected " + expected);
    }
}
	public static void main (String[] args) {
		testhasTeen(13, 20, 10, true);
		testhasTeen(20, 19, 10, true);
		testhasTeen(20, 10, 13, true);
		testhasTeen(20, 10, 12, false);
	}
}
