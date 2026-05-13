

public class Rectangle {
	
	public static void main (String[] args) {
		Rectangle one = Rectangle("hi", 3.2, 4.5); 
		Rectangle two = Rectangle("ha", 5.2, 4.8);
		Rectangle three = Rectangle("hu", 3.9, 9.5);
		Rectangle four = Rectangle("he", 6.5, 7.5);
		
		Rectangle[][] list =
            {one, two},
            {three, four};
       

        System.out.println(one.getName());              
        System.out.println(one.calcArea());            
        System.out.println(one.calcPerimeter());       

        System.out.println(Rectangle.avPerim(list)); 
        System.out.println(Rectangle.greatestArea(list).getName()); 
	}
	private String name; 
	private double width; 
	private double height; 
	
	public Rectangle(String n, double w, double h){
		name = n; 
		width = w; 
		height = h; 
	}
	public String getName(){
		return name; 
	}
	
	public double getWidth(){
		return width; 
	}
	public double getHeight(){
		return height; 
	}
	public double calcPerimeter(){
		double perimeter = 2*width + 2*height; 
		return perimeter; 
	}
	public double calcArea(){
		double area = width * height; 
		return area; 
	}
	public static double avPerim(Rectangle[][] list){
		double average = 0.0; 
		int count = 0; 
		for(Rectangle[] rects : list){
			for(Rectangle rect : rects){
				average += rect.calcPerimeter(); 
				count++; 
			}
		}
		return average/count; 
	}
	public static Rectangle greatestArea(Rectangle[][] list){
		Rectangle greatest = list[0][0];
		
		for(Rectangle[] rects: list){
			for(Rectangle rect : rects){
				if(rect.calcArea() > greatest.calcArea()){
					greatest = rect; 
				}
			}
		}
		return greatest; 
	}
	
}
