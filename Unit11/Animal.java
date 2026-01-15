
public class Animal{

public Animal(String name, int legCount, boolean furriness) {
	
	this.name = name; 
	this.legCount = legCount; 
	this.furriness = furriness; 
}
	
	private String name; 
	private int legCount; 
	private boolean furriness; 
	
	public String getName(){
		return name; 
	}
	public int getLegCount(){
		return legCount; 
	}
	
	public boolean furriness(){
		return furriness; 
	}

	
	public static void main (String[] args) {
		
	}
}

