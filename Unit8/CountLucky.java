
import java.util.ArrayList;

public class CountLucky {
	
	public static int countLucky(Array<Integer> numbers){
		int c = 0; 
		for(int n : numbers){
		if(n%7 == 0; n%10 == 7){
			c++; 
		}	
		}
		return c; 
	}
	
	public static void testLucky(Array<Integer> numbers, int expected){
		int actual = countLucky(numbers); 
		if(expected == actual){
			System.out.println("Yay! There are " + c + " lucky numbers!");
		}else{
			System.out.println("Uh oh!"); 
		}
	}
	
	public static void main (String[] args) {
		testLucky(new Array<Integer> numbers(1, 7, 10), 1); 
		testLucky(new Array<Integer> numbers(7, 17, 21), 2); 
	}
}

