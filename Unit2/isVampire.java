public class isVampire {

  
    public static boolean isVampire(float hour, boolean awake) {
        return ((hour >= 6 && hour < 22) && !awake)     
            || ((hour < 6 || hour >= 22) && awake);     
    }

   
    public static void testisVampire(float hour, boolean awake, boolean expected) {
        boolean result = isVampire(hour, awake);
        if (result == expected) {
            System.out.println("PASS: isVampire(" + hour + ", " + awake + ") → " + result);
        } else {
            System.out.println("FAIL: isVampire(" + hour + ", " + awake + ") → " + result
                               + " (expected " + expected + ")");
        }
    }

    public static void main(String[] args) {
        // Waking hours 
        testisVampire(10.0f, true, false);  
        testisVampire(10.0f, false, true);   

        // Sleeping hours 
        testisVampire(2.0f, true, true);     
        testisVampire(2.0f, false, false);   


        testisVampire(6.0f, false, true);    
        testisVampire(6.0f, true, false);    
        testisVampire(22.0f, true, true);    
        testisVampire(22.0f, false, false);  
    }
}

