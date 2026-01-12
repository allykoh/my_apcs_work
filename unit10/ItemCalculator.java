import java.util.*;

public class ItemCalculator {
	
	public static void List(ArrayList<Item> Items){
		for(Item i : Items){
			System.out.print(" Item: " + i.getName() + " Price: " + i.getPrice()); 
		}
	}
	public static float averagePrice(ArrayList<Item> Items){
		float sum = 0f;
		for(Item b : Items){
			sum += b.getPrice(); 
		}
		return sum/Items.size(); 
		
	}
	public static String Expensive(ArrayList<Item> Items){
		String expensive = ""; 
		double maxPrice = -1.0; 
		for(Item x : Items){
			if(x.getPrice() > maxPrice){
				maxPrice = x.getPrice(); 
				expensive = x.getName(); 
			}
		}
		return expensive; 
	}
	
	public static void main (String[] args) {
		ArrayList<Item> Items = new ArrayList<Item>();
		Items.add(new Item("apple", 1.5f)); 
		Items.add(new Item("zebra", 1000.0f));
		Items.add(new Item("shoes", 80f)); 
		
		System.out.println("List of Items: ");
		List(Items);  
		System.out.println(" Average Price: " + averagePrice(Items)); 
		System.out.println(" Most Expensive: " + Expensive(Items)); 
	
	}
}

