import java.lang.Math; 


public class coinFlip{
	
	public static String coinFlip(){
		double coin = Math.random(); 
		if(coin <= 0.5){
			return "heads"; 
		}else{
			return "tails"; 
		}
	}
	public static void main (String[] args) {
		for(int i = 0; i<20; i++){
			System.out.println(coinFlip()); 
		}
	}
}

