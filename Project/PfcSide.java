import processing.core.*;

public class PfcSide implements Screens {

    private PApplet p;
    private Brain brain;
    private PImage pfcImg; 

    PfcSide(PApplet parent, Brain b){
        p = parent;
        brain = b;
     
        pfcImg = p.loadImage("PFC.png"); 
    }

    public void display(){
        p.rectMode(PApplet.CENTER);
        p.imageMode(PApplet.CENTER);
        p.textAlign(PApplet.CENTER, PApplet.CENTER);
        
   
       p.background(15, 20, 35); 

        drawTitle();
        drawImageWithBorder();
        drawInfoBoxes();
    }

    private void drawTitle(){
        p.fill(255);
        p.textSize(40);
        p.text("Prefrontal Cortex - Side View", p.width/2, p.height * 0.08f);
    }

    private void drawImageWithBorder(){
    float borderSize = 500; 
    float imgSize = 460;

    p.fill(70, 90, 140);
    p.noStroke();
    p.rect(p.width/2, p.height/2, borderSize, borderSize, 30);

    if (pfcImg != null) {
        p.image(pfcImg, p.width/2, p.height/2, imgSize, imgSize);
    }
}

    private void drawInfoBoxes(){
        float boxW = p.width - 200;
        float boxH = 140;

        p.fill(40, 60, 110);
        p.rect(p.width/2, p.height - 140, boxW, boxH, 20);

        p.fill(255);
        p.textSize(25); 
        p.textLeading(35);

        p.text(
            "The prefrontal cortex helps with planning and decisions.\n" +
            "It controls impulses and supports self-control.\n" +
            "It can calm fear signals sent by the amygdala.",
            p.width/2,
            p.height - 140
        );
    }

    public void keyPressed(){
        if(p.keyCode == PApplet.DOWN){
            brain.setScreen(1);
        }
    }
}
