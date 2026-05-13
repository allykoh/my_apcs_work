import processing.core.*;
import java.util.*;  

public class Screen1 implements Screens {

    private PApplet p;
    private Brain brain;  

    Screen1(PApplet parent, Brain b){
        p = parent;
        brain = b;
    }

    public void display(){
        p.background(20); 
        p.textSize(40);
        p.fill(255);  

        p.text("Amygdala", p.width/4.0f, p.height/2.5f); 
        p.text("Prefrontal Cortex", p.width/2.0f, p.height/2.5f); 
        p.text("Hippocampus", (p.width*3)/4.0f, p.height/2.5f); 

        p.fill(100, 50, 80);
		float size = 140;
		float x1 = p.width/4.0f;
		float y1 = p.height/2.0f;
		p.triangle(
		x1 - size/2, y1,        
		x1 + size/2, y1 - size/2,
		x1 + size/2, y1 + size/2);
		//p.text("insert image", p.width/4.0f, p.height/3.0f); 


		float x2 = p.width/2.0f;
		float y2 = p.height/2.0f;
		p.triangle(
		x2, y2 - size/2,        
		x2 - size/2, y2 + size/2,
		x2 + size/2, y2 + size/2);
		//p.text("insert image", p.width/2.0f, p.height/3.0f); 


		float x3 = (p.width*3)/4.0f;
		float y3 = p.height/2.0f;
		p.triangle(
		x3 + size/2, y3,        
		x3 - size/2, y3 - size/2,
		x3 - size/2, y3 + size/2);	
		//p.text("insert image", (p.width*3)/4.0f, p.height/3.0f); 
        
    }

public void keyPressed(){

    if(p.keyCode == PApplet.LEFT){
        brain.setScreen(2); 
    }

    if(p.keyCode == PApplet.UP){
        brain.setScreen(3); 
    }

    if(p.keyCode == PApplet.RIGHT){
        brain.setScreen(4); 
    }
}
}
