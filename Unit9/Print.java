import processing.core.*;
import java.util.*; 

public class Print extends PApplet {

    int screen = 0; 
    SongScreen songScreen; 
    float bW = 320; 
    float bH = 90;  
    float bX; 
    float bY; 

    public static void main(String[] args){
        PApplet.main("Print");
    }

    public void settings(){
        fullScreen();
    }

    public void setup(){
        textAlign(CENTER, CENTER); 
        textSize(36); 
        
        bX = width/2 - bW/2; 
        bY = height/2 - bH/2; 
        
        songScreen = new SongScreen(this); 
        
    }

    public void draw(){
        
        if(screen == 0){
           drawTitleScreen(); 
	   }else if(screen == 1){
            songScreen.draw(); 
        }
    }
    void drawTitleScreen(){
		background(30); 
		fill(70); 
		rect(bX, bY, bW, bH, 20); 
		
		fill(255); 
		text("NEW SONG", width/2, height/2); 
		
	}

    public void mousePressed() {
        if(screen == 0){
			if(mouseX > bX && mouseX < bX + bW && mouseY > bY && mouseY < bY+bH){
				screen = 1; 
			}
    }
}
}

//java -cp ".:/Applications/Processing.app/Contents/Java/core/library/core.jar" Print



