import processing.core.*;
//import java.util.*; 
//import processing.core.PApplet;


public class Brain extends PApplet {

    int screen = 0; 
    Project project; 
    float bW = 820; 
    float bH = 200;  
    float bX; 
    float bY; 

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
 

    project = new Project(this);
       
        
    }
    public void draw(){          
        transition();            
    }

    
    public void drawTitleScreen(){
		background(30); 
		fill(100, 50, 80); 
		rect(bX, bY, bW, bH, 40); 
		
		fill(255);
		textSize(height * 0.1f);
		text("PROJECT NAME", width/2, height/2);

		
		
	}

   public void transition(){
    if(screen == 0){
        drawTitleScreen();  
    } else if(screen == 1){
        project.draw();     
    }
}



    public void mousePressed() {
    if(screen == 0){
        if(mouseX > bX && mouseX < bX + bW && mouseY > bY && mouseY < bY+bH){
            screen = 1; 
        }
    }
}

}
//javac -cp ".:/Applications/Processing.app/Contents/Java/core/library/core.jar" Brain.java Project.java

//java -cp ".:/Applications/Processing.app/Contents/Java/core/library/core.jar" Brain



