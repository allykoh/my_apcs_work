
import java.util.ArrayList;
import java.util.List;

public class SquaresSum {
	
	public static float SumofSquares(ArrayList<Float> flo){
		float s = 0; 
		for(float f: flo){
		s += f*f; 	
		}
		return s; 
	}
	
	public static void testSum(ArrayList<Float> flo, float expected){
		float actual = SumofSquares(flo); 
		
		if(actual == expected){
			System.out.println("Yay! The sum is " + actual); 
		}else{
			System.out.println("Hmm."); 
		}
		
	}
	
	public static void main (String[] args) {
		testSum(new ArrayList<>(List.of(0f)), 0f); 
		testSum(new ArrayList<>(List.of(1.0f, 2.0f, 3.0f)), 14.0f); 
		testSum(new ArrayList<>(List.of(2.0f, 2.0f, 2.0f)), 12.0f); 
	}
}

