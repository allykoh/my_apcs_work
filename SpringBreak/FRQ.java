
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
	
	private String f; 
	private String l;
	
	public SignedText(String first, String last){
		f = first; 
		l = last; 
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

ArrayList<Competitor> competitorList = new ArrayList<Competitor>(); 


public Round(String[] names){
	competitorList = new ArrayList<Competitor>(); 
	for(int i = 0; i < names.length; i++){
		competitorList.add(new Competitor(names[i], i+1)); 
	}
}


public ArrayList<Match> buildMatches(){
	ArrayList<Match> matches = new ArrayList<Match>(); 
	if(competitorList.size()%2 == 0){
		for(int i = 0; i < competitorList.size()/2; i++){
			Match match = wnew Match(competitorList.get(i), 
				competitorList.get(competitorList.size()-i-1)); 
			matches.add(match); 
		}
	}else{
		for(int i = 1; i < competitorList.size()/2+1; i++){
			matches.add(new Match(competitorList.get(i), 
				competitorList.get(competitorList.size()-i)); 
		}
	}
	return matches; 
	
}








