import processing.core.*;

public class MiddleScreen implements Screens {

    private PApplet p;
    private Brain brain;

    MiddleScreen(PApplet parent, Brain b){
        p = parent;
        brain = b;
    }

    public void display(){
        p.background(20, 60, 40);
        p.fill(255);
        p.textSize(50);
        p.text("Prefrontal Cortex", p.width/2, p.height/2);
    }

    public void keyPressed(){
        if(p.keyCode == PApplet.DOWN){
            brain.setScreen(1);
        }
    }
}
