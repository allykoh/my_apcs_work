public class attention {
	
	public boolean attention(String str){
		if(str.length() < 9){
		 return false; 
	 }
		
		String s = str.substring(0,9); 
		
		if(s.equals("Hey, you!")){
		 return true; 
	 }else{
		 return false; 
		 
	}
}
	public static void testattention(String str, boolean expected){
		Attention a = new attention();
		boolean result = a.attention(str); 
		if(result == expected){
			System.out.println("PASS: attention(" + String str + ") returned " 
		} else {
            System.out.println("FAIL: attention(\"" + str + "\") returned " + result + ", expected " + expected);
        }
    }
	
	public static void main (String[] args) {
		 testAttention("Hey, you! Listen!", true);  
        testAttention("Hey, you!", true);          
        testAttention("Hey, you", false);          
        testAttention("Hi there!", false);         
        testAttention("Hey, you!123", true);       
        testAttention("", false);     
	}
}

