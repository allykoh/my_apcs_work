//2026 Practice FRQs

public String findWinner(int numLaps){ 
	double carOneTime = 0; 
	double carTwoTime = 0; 
	for(int lap = 1; lap <= numLaps; lap++){
		carOneTime += carOne.getLapTime(lap); 
		carTwoTime += carTwo.getLapTime(lap); 
	} 
	if(carOneTime > carTwoTime){
		return "Car 2 wins!"; 
	}else if(carTwoTime > carOneTime){
		return "Car 1 wins!";
	}else{
		return "Tie!"; 
	}
}

public String shortenMessage(String message, String str){
	
	while(message.indexOf(str) > -1){
		int index = message.indexOf(str);
		message = message.substring(0, index) + message.substring(index + str.length());  
	}
	return message; 
}

public class CubePair{
	private Cube cubeOne;
	private Cube cubeTwo;  
	
	public CubePair(String type){
		cubeOne = new Cube(type); 
		cubeTwo = new Cube(type); 
	}
	public CubePair(String type1, String type2){
		cubeOne = new Cube(type1); 
		cubeTwo = new Cube(type2); 
	}
	public String rollCubes(){
		return cubeOne.roll() + cubeTwo.roll(); 
	}
}



private ArrayList<String> getHighRangeVehicles(int target){
	ArrayList<String> highRange = new ArrayList<String>;
	
	for(ElectricVehicle v : vehicleList){
		if(v.getRange() > target){
			highRange.add(v.getModelName());
		}
	}
	for(int i = 0; i < highRange.size()-1; i++){
		for(int j = i+1; j < highRange.size(); j++){
			if(highRange.get(i).equals(highRange.get(j)){
				highRange.remove(j);
				j--; 
			}	
		}
	}
	return highRange; 
}

public int numberOfPies(double poundsPerPie){
	double pounds = 0; 
	for(int r = 0; r < apples.length; r++){
		for(int c = 0; c < apples[0].length; c++){
			boolean bad = apples[r][c].isRotten();
			if(r > 0 && apples[r-1][c].isRotten()){
				bad = true; 
			}
			if(r < apples.length-1 && apples[r+1][c].isRotten()){
				bad = true; 
			}
			if(c < apples[0].length-1 && apples[r][c+1].isRotten()){
				bad = true; 
			}
			if(c > 0 && apples[r][c-1].isRotten()){
				bad = true; 
			}
				
			if(bad == false){
				pounds += apples[r][c].getWeight(); 
			}
		}
	
	}
	return (int)(pounds/poundsPerPie); 
}

















