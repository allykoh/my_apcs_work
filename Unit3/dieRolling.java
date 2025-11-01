
public class dieRolling {
	public static int rollDie(){
		int dice = (int)(Math.random() * 6) + 1; 
			return dice; 
	}
	
	public static void main(String[] args) {
		System.out.println("Rolling 5 times...");
		for(int i = 1; i <= 5; i++){
			int result = rollDie(); 
			System.out.println("Roll " + i + " : " + result); 
	}
}
}

