public class Initialization{
	
	public static double[][] DiagonalArray()
    {

        double[][] result = new double[5][5];

        for (int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                if (i == j)
                    result[i][j] = 2.0;
                else
                    result[i][j] = 0.0;
            }
        }
        
        return result;
    }
	
	 public static void printStuff(double[][] values)
    {

        for (double[] row : values) 
        {
            for (double value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
    public static String[][] StrArr(){
		
		String[][] printA = new String[4][4]; 
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(i == 0)
				printA[i][j] = "h";
				if(i == 1)
				printA[i][j] = "i";
				if(i == 2)
				printA[i][j] = "h";
				if(i == 3)
				printA[i][j] = "i"; 
				
			}
		
	}
	return printA; 
}
    public static void printStuff2(String[][] values)
    {

        for (String[] row : values) 
        {
            for (String value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
    
    public static int[][] Count(){
		int[][] counting = new int[6][5]; 
		
		for (int i = 0; i < 6; i++){
			
		for(int j = 0; j < 5; j++){
			if(i==0)
			counting[i][j] = 1; 
			if(i ==1)
			counting[i][j] = 2; 
			if(i==2)
			counting[i][j] = 3; 
			if(i==3)
			counting[i][j] = 4; 
			if(i==4)
			counting[i][j] = 5; 
			if(i==5)
			counting[i][j] = 6; 
			
	}
		
	}
	return counting; 
}
    
      public static void printStuff3(int[][] values)
    {

        for (int[] row : values) 
        {
            for (int value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
    public static double[][] Random(){
		
		double[][] rando = new double[5][5]; 
		double i = 10; 
		double j = 1;
		
		for(i = 0; i < 5; i++)
		for(j = 0; j < 5; j++)
		result[i][j] = i+1; 
		i = i+1; 
		
		j= j+1; 
		i = 10*j;
		
	}

	
	public static void main (String[] args){
		double[][] diagonal = DiagonalArray(); 
		System.out.println("diagonal: "); 
		printStuff(diagonal); 
		String[][] strA = StrArr();
		System.out.println("string array: "); 
		printStuff2(strA); 
		int[][] count = Count(); 
		System.out.println("counting array: "); 
		printStuff3(count);
		double[][] random = Random(); 
		System.out.println("double array: "); 
		printStuff(random);  
	}
	
}
