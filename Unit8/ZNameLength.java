import java.util.ArrayList;
import java.util.List;


public class ZNameLength {
	
	public static int Length(ArrayList<String> names){
		int c = 0; 
		for(String n: names){
			if(n.charAt(0) == 'Z' || n.charAt(0) == 'z'){
				c += n.length(); 
			}
		}
		return c; 
	}
	
	public static void testLength(ArrayList<String> names, int expected){
		int actual = Length(names); 
		if(actual == expected){
			System.out.println("Yay! ZNameLength: " + actual); 
		}else {
			System.out.println("Hmm"); 
	}
}
	
	public static void main (String[] args) {
		testLength(new ArrayList<>(List.of("Dr. Kessner", "Dr. Sands")), 0); 
		testLength(new ArrayList<>(List.of("Zorro", "zero", "zippy")), 14); 
	}
}

