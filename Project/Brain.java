import processing.core.*;
import java.util.*; 
//import processing.core.PApplet;


public class Brain extends PApplet {


    private int screen = 0; 
    private float bW = 820; 
    private float bH = 200;  
    private float bX; 
    private float bY; 
    ArrayList<Screens> screens = new ArrayList<Screens>(); 

    public static void main(String[] args){
        PApplet.main("Brain");
    }

    public void settings(){
        fullScreen();
    }

    public void setup(){
        textAlign(CENTER, CENTER);
		bX = (float)(width/3.7);
		bY = (float)(height/2.4);
		
		screens.add(new Screen1(this, this));  
		screens.add(new LeftScreen(this, this));   
		screens.add(new MiddleScreen(this, this)); 
		screens.add(new RightScreen(this, this));  
		screens.add(new AmygSide(this, this)); 
       
        
    }
  
    
    public void drawTitleScreen(){
		background(30); 
		fill(100, 50, 80); 
		rectMode(CENTER);
		rect(width/2, height/2, 890, 200);
		
		fill(255);
		textSize(height * 0.07f);
		text("Flight, Fight, and Thought", width/2, height/2);

		
		
	}

   
	public void draw(){
		if(screen == 0){
			drawTitleScreen();
		} else {
			screens.get(screen - 1).display();
		}
	}
	
    public void setScreen(int s){
    screen = s;
	}



    public void mousePressed() {
    if(screen == 0){
        if(mouseX > bX && mouseX < bX + bW && mouseY > bY && mouseY < bY+bH){
            screen = 1; 
        }
    }
}
	public void keyPressed(){
    if(screen > 0){
        screens.get(screen - 1).keyPressed();
		}
	}
}
//javac -cp ".:/Applications/Processing.app/Contents/Java/core/library/core.jar" *.java
//java -cp ".:/Applications/Processing.app/Contents/Java/core/library/core.jar" Brain

