import java.util.*;

public class PersonStats {
	
	public static double Average(ArrayList<Person> persons){
		double sum = 0; 
		
		for(Person p : persons){
			sum += p.getNumber(); 
		}
		return sum / persons.size(); 
	}
	public static String Most(ArrayList<Person> persons){
		String MostExpensive = ""; 
		double maxValue = -1.0; 
		
		for(Person i : persons){
			if(i.getNumber() > maxValue){
				maxValue = i.getNumber(); 
				MostExpensive = i.getName(); 
			}
		}
		return MostExpensive; 
	}
	
	public static ArrayList<Person> Two(ArrayList<Person> persons){
		ArrayList<Person> two = new ArrayList<Person>(); 
		for(Person a : persons){
			if(a.getNumber() > 2){
				two.add(a);
			}
		}
		return two; 
	}
	
	
	public static void main (String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Elissa", 0)); 
		persons.add(new Person("Kira", 3));
		persons.add(new Person("Lexi", 3)); 
		
		ArrayList<Person> names = Two(persons);
				System.out.println("People With More Than Two Pets: ");
				for (Person name : names)
				System.out.println(name.getName());  
		
		System.out.println("Average: " + Average(persons)); 
		System.out.println("Person With Most Pets: " + Most(persons)); 
		
		
	}
}

