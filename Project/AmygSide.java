import processing.core.*;

public class AmygSide implements Screens {

    private PApplet p;
    private Brain brain;
    private PImage amyg; 

    AmygSide(PApplet parent, Brain b){
        p = parent;
        brain = b;
        amyg = p.loadImage("amyg.png"); 
    }

    public void display(){
        p.rectMode(PApplet.CENTER);
        p.imageMode(PApplet.CENTER);
        p.textAlign(PApplet.CENTER, PApplet.CENTER);
    
        p.background(40, 20, 60); 

        drawTitle();
        drawImageWithBorder();
        drawInfoBoxes();
    }

    private void drawTitle(){
        p.fill(255);
        p.textSize(40);
        p.text("Amygdala - Side View", p.width / 2, p.height * 0.08f);
    }

    private void drawImageWithBorder(){
        float borderSize = 500; 
        float imgSize = 460;    

   
        p.fill(120, 80, 180);
        p.noStroke();
        p.rect(p.width / 2, p.height / 2, borderSize, borderSize, 30);

        // The Image
        if (amyg != null) {
            p.image(amyg, p.width / 2, p.height / 2, imgSize, imgSize);
        }
    }

    private void drawInfoBoxes(){
        p.fill(80, 50, 120); 
        p.rect(p.width / 2, p.height - 140, p.width - 200, 140, 20);

        p.fill(255);
        p.textSize(25);
        p.text(
            "The amygdala quickly detects danger and fear.\n" +
            "It helps create anxiety and stress responses\n" +
            "and activates the body's fight-or-flight reaction.",
            p.width / 2, p.height - 140
        );
    }

    public void keyPressed(){
        if(p.keyCode == PApplet.DOWN) brain.setScreen(1); 
    }
}
