public class countLucky {
	
	public static int countLucky(int[] arr){
	int count = 0; 
	for(int num : arr){
		if(num%7 == 0 || num%10 == 7){
			count++
		}
	}
	return count; 
}
	public static void testcountLucky(){
		
	}
	public static void main (String[] args) {
		
		
	}


