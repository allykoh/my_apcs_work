import java.util.*;

public class AnimalCalculator {
	
	public static void printResult(ArrayList<Animal> animals){
		for(Animal a : animals){
			System.out.println(a.getName()); 
			System.out.println(a.getLegCount()); 
			System.out.println(a.isFurry()); 
		}
	}
	public static double averageLegs(ArrayList<Animal> animals){
		double totalLegs = 0; 
			
		for(Animal b : animals){
			totalLegs += b.getLegCount(); 
			}
		return totalLegs/animals.size(); 
		}
	
	public static int fewestLegs(ArrayList<Animal> animals){
    int fewest = animals.get(0).getLegCount();

    for(Animal c : animals){
        if(c.getLegCount() < fewest){
            fewest = c.getLegCount();
        }
    }
    return fewest;
}
		
	
	public static void main (String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>(); 
		
		animals.add(new Human("human", 1, false)); 
		animals.add(new Cat("cat", 4, true)); 
		animals.add(new Sponge("sponge", 0, false)); 
		animals.add(new Centipede("Centipede", 100, false)); 
		
		printResult(animals);
		System.out.println("average number of legs: " + averageLegs(animals)); 
		System.out.println("animal with fewest legs: " + fewestLegs(animals)); 
	}
}

