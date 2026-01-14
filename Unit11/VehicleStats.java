
import java.util.*; 

public class VehicleStats{
	
	public static int totalWheels(ArrayList<Vehicle> vehicles){
		int total = 0; 
		for(Vehicle i : vehicles){
			total += i.wheelCount(); 
		}
		return total; 
		
	}
	public static ArrayList<Vehicle> humanPowered(ArrayList<Vehicle> vehicles){
		ArrayList<Vehicle> humanPowered = new ArrayList<Vehicle>(); 
		
		for(Vehicle b : vehicles){
			if(b.isHumanPowered() == true){
				humanPowered.add(b); 
			}
		}
		return humanPowered; 
		
	}	
	
	public static void main (String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); 
		
		vehicles.add(new Car(4, true)); 
		vehicles.add(new MotorCycle(2, false)); 
		vehicles.add(new Unicycle(1, false)); 
		
		System.out.println(totalWheels(vehicles)); 
		
		System.out.println(humanPowered(vehicles)); 
		
	}
}

