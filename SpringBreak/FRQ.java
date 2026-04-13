
//1A
public int walkDogs(int hour){
	int numDogs = company.numAvaialableDogs(hour); 
	
	if(numDogs> maxDogs){
		numDogs= maxDogs; 
	}
	DogWalkCompany.updateDogs(hour, numDogs); 
	return numDogs;
	
}
//1B
public int dogWalkShift(int startHour, int endHour){
	int pay = 0; 
	for(int hour = startHour; hour <= endHour; hour++){
		int dogs = walkDogs(hour); 
		pay += 5*dogs; 
		if((maxDogs == dogs) || ((hour >= 9) && (hour <= 17)){
			pay += 3; 
		}
	}
	return pay;  
}

public class SignedText{
	public SignedText(String first, String last){
		first = f; 
		last = l; 
	}
	public String getSignature(){
		String sign = ""; 
		if(f.length() == 0){
			sign += l; 
		}else{
			sign = f.substring(0, 1) + "-" + l; 
		}
		return sign; 
	}
	public String addSignature(String str){
		String sign = getSignature(); 
		if(str.indexOf(sign) == -1){
			return str + sign; 
		}else if(str.indexOf(sign) == 0){
			return str.substring(sign.length()) + sign; 
		}else{
			return str; 
		}
		
	}
}
