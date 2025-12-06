
public class TotalZNameLength {
	
	public static int length(String[] str){
		int c = 0; 
		for(int i = 0; i < str.length; i++){
			String s = str[i]; 
			if(s.length() > 0){
				char first = s.charAt(0); 
			if(first == 'z' || first == 'Z'){
				c += s.length(); 
			}
		}
	}
		return c; 
	}
	public static void testLength(String[] str, int expected){
		int actual = length(str); 
		if(actual == expected){
			System.out.println("Yay!");  
		}else{
			System.out.println("Hmm"); 
	}
}
	
	public static void main (String[] args) {
		testLength(new String[]{"hi", "what", "zoom"},4); 
		testLength(new String[]{"where", "noo"}, 0); 
	}
}

