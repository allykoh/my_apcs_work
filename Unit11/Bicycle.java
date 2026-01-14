
public class Bicycle implements Vehicle{
	public Bicycle(int wheel, boolean human){
		this.wheel = wheel; 
		this.human = human; 
	}
	private int wheel; 
	private boolean human; 
	
	public String name(){
		return "Bicycle"; 
	}
	public int wheelCount(){
		return wheel; 
	}
	public boolean isHumanPowered(){
		return human; 
	}
	
	public static void main (String[] args) {
		
	}
}



