import java.util.*;

public class Sequence{
	
	public static int[] fibonacci (int n){
		int[] result = new int[n];
		if(n<=0){
			return new int[0];
		}
		if(n> 1){
			 result[1] = 1;
		}
		result[0] = 1;
		for(int i =2; i < n; i++){
			result[i] = result[i-1] + result[i-2];;
		}
		return result;
	}
	public static void main (String[] args){
		int[] result = fibonacci(3);
         for (int num : result) {
            System.out.print(num + " ");
        }
	}
	
}
