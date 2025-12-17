import java.util.*;

public class Transform{
		
	public static String[] reverseAll(String[] names){
	String [] result = new String[names.length];
		for(int j = 0; j < names.length; j++){
			String reversed = "";
			for(int i = names[j].length()-1; i >=0; i--){
				reversed += names[j].substring(i, i+1);
			}
			result[j] = reversed;
		}
		return result; 
	}
	public static void main (String[] args){
		 String[] names = {"The", "quick", "brown", "fox"};
		 String[] result = reverseAll(names);

        System.out.print("result: ");
        for (String x : result)
            System.out.print(x + " ");
        System.out.println();
	}	
}
