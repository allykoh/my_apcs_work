import java.util.*;

public class MaxValue{
	public static double maxValue(double[] values)
    {
        double result = values[0];        

        for (double value : values)
        {
            if (value > result)
                result = value;
        }

        return result;
    }
	public static void testvalue(double[] values, int expected){
	double result = maxValue(values);
	
	for (double value : values)
            System.out.print(value + " ");

        System.out.print(" expected: " + expected +
                           " result: " + result + " ");

        if (expected == result)
            System.out.println("Yes!");
        else
            System.out.println("Hmm");
}
	public static void main(String[] args){
		 double[] values = {7, 5, 2, 1, 2, 4};
		  double[] values1 = {1,88,30,188,5};
		   double[] values2 = {1,2,3,4,5};
         testvalue(values, 7);
           testvalue(values1, 188);
             testvalue(values2, 5);
		
	}

}
