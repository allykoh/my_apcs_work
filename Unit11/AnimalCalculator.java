import java.util.*;

public class AnimalCalculator {
	
	public static void printResult(ArrayList<Animal> animals){
		for(Animal a : animals){
			System.out.println(a.getName()); 
			System.out.println(a.getLegcount()); 
			System.out.println(a.furriness()); 
		}
		
		public static double averageLegs(ArrayList<Animal> animals){
			double totalLegs = 0; 
			
			for(Animal b : animals){
				totalLegs += a.getLegCount(); 
			}
		}
	}
	public static Animal FewestLegs(ArrayList<Animal> animals){
		Animal fewest = animals.get(0); 
		for(Animal c : animals){
			if(c.legCount() < fewest.legCount()){
				fewest = Animal.get(c); 
			}
			
		}
		return fewest; 
		
	}
	
	public static void main (String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>(); 
		
		Animal.add(new Human("human", 1, false)); 
		Animal.add(new Cat("cat", 4, true)); 
		Animal.add(new Sponge("sponge", 0, false)); 
		Animal.add(new Centipede("Centipede", 100, false)); 
		
		System.out.println("all info: " + println(animals)); 
		System.out.println("average number of legs: " + averageNum(animals)); 
		System.out.println("animal with fewest legs: " + fewestLegs(animals)); 
	}
}

