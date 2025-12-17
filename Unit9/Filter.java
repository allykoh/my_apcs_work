import java.util.*;

public class Filter{
	 public static ArrayList<Double> filter(ArrayList<Double> scores)
    {
        ArrayList<Double> result = new ArrayList<Double>();

        for (double value : scores)
        {
            if (value < 50)
                result.add(value);
        }

        return result;
    }
	
	public static void main(String[] args){
		ArrayList<Double> scores = new ArrayList<>();
		scores.add(48.0);
		scores.add(62.0);
		scores.add(98.0);
		scores.add(1.0);
		scores.add(0.0);
		scores.add(35.0);
		ArrayList<Double> bad = filter(scores);
        System.out.print("bad scores: ");
        for (double score : bad){
			System.out.println(score + " ");
        }
	}
}
