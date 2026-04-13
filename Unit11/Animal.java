
public class Animal{

public Animal(String name, int legCount, boolean isFurry) {
	
	this.name = name; 
	this.legCount = legCount; 
	this.isFurry = isFurry; 
}
	
	private String name; 
	private int legCount; 
	private boolean isFurry; 
	
	public String getName(){
		return name; 
	}
	public int getLegCount(){
		return legCount; 
	}
	
	public boolean isFurry(){
		return isFurry; 
	}

	
	public static void main (String[] args) {
		
	}
}

