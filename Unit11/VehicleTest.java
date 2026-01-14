import java.util.*; 

public class VehicleTest {
	
	
	public static void main (String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); 
		
		vehicles.add(new Car(4, true)); 
		vehicles.add(new MotorCycle(2, false)); 
		vehicles.add(new Unicycle(1, false)); 
		
		for(Vehicle v : vehicles){
			
			System.out.println(v.name() + " " + v.wheelCount() + " " + v.isHumanPowered()); 
			
		}
		
		
	}
}

