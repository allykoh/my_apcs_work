
public class CountOccurences {
	
	public static int countOccurences(String full, String str){
		int n = 0; 
		for(int i = 0; i < full.length()-str.length()+1; i++){
			if(full.substring(i, i + str.length()).equals(str)){
				n+=1; 
			}
		}
		return n; 
	}
	
	public static void main (String[] args) {
		System.out.println(countOccurences("Mississippi", "iss")); 
		System.out.println(countOccurences("bananana", "na")); 
	}
}

