
import java.util.ArrayList;
import java.util.List;

public class LuckyCount {
	
	public static int countLucky(ArrayList<Integer> numbers){
		int c = 0; 
		for(int n : numbers){
		if(n%7 == 0 || n%10 == 7){
			c++; 
		}	
		}
		return c; 
	}
	
	public static void testLucky(ArrayList<Integer> numbers, int expected){
		int actual = countLucky(numbers); 
		if(expected == actual){
			System.out.println("Yay! There are " + actual + " lucky numbers!");
		}else{
			System.out.println("Uh oh!"); 
		}
	}
	
	public static void main (String[] args) {
		testLucky(new ArrayList<> (List.of(1, 7, 10)), 1); 
		testLucky(new ArrayList<> (List.of(7, 17, 21)), 3); 
	}
}

