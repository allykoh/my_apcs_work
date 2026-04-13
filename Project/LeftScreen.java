import processing.core.*;

public class LeftScreen implements Screens {

    private PApplet p;
    private Brain brain;

    LeftScreen(PApplet parent, Brain b){
        p = parent;
        brain = b;
    }

    public void display(){
        p.background(60, 20, 40);
        p.fill(255);
        p.textSize(50);
        p.text("Front view", p.width/2, p.height/2);
    }

    public void keyPressed(){
        if(p.keyCode == PApplet.DOWN){
            brain.setScreen(1); 
        }
        if(p.keyCode == PApplet.RIGHT){
			brain.setScreen(5); 
		}
    }
}
