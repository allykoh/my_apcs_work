public class makes10{

public static boolean makes10(int a, int b) {
  return(a==10 || b==10 || a+b == 10); 
}
//testing the function 

public static void testmakes10(int a, int b, boolean expected){
	boolean result = makes10(a,b); 
	   if (result == expected) {
            System.out.println("PASS: makes10(" + a + ", " + b + ") → " + result);
        } else {
            System.out.println("FAIL: makes10(" + a + ", " + b + ") → " + result + " (expected " + expected + ")");
        }
}
    // main method for running test cases
    public static void main(String[] args) {
        testmakes10(9, 10, true);   
        testmakes10(10, 5, true);   
        testmakes10(1, 9, true);    
        testmakes10(3, 4, false);   
        testmakes10(0, 10, true);   
        testmakes10(10, 10, true);  
        testmakes10(5, 6, false);   
    }

}
