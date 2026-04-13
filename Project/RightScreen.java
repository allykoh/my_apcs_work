import processing.core.*;

public class RightScreen implements Screens {

    private PApplet p;
    private Brain brain;

    RightScreen(PApplet parent, Brain b){
        p = parent;
        brain = b;
    }

    public void display(){
        p.background(40, 20, 80);
        p.fill(255);
        p.textSize(50);
        p.text("Hippocampus", p.width/2, p.height/2);
    }

    public void keyPressed(){
        if(p.keyCode == PApplet.DOWN){
            brain.setScreen(1);
        }
    }
}
