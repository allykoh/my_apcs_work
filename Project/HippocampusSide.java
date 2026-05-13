import processing.core.*;

public class HippocampusSide implements Screens {

    private PApplet p;
    private Brain brain;
    private PImage hipp; 

    HippocampusSide(PApplet parent, Brain b){
        p = parent;
        brain = b;
        hipp = p.loadImage("hipp.png"); 
    }

    public void display(){
        p.rectMode(PApplet.CENTER);
        p.imageMode(PApplet.CENTER);
        p.textAlign(PApplet.CENTER, PApplet.CENTER);

        p.background(20, 35, 20); 

        drawTitle();
        drawImageWithBorder();
        drawInfoBoxes();
    }

    private void drawTitle(){
        p.fill(255);
        p.textSize(40);
        p.text("Hippocampus - Side View", p.width/2, p.height * 0.08f);
    }

    private void drawImageWithBorder(){
        float borderSize = 500; 
        float imgSize = 460;

        p.fill(70, 120, 80);
        p.noStroke();
        p.rect(p.width/2, p.height/2, borderSize, borderSize, 30);

        if (hipp != null) {
            p.image(hipp, p.width/2, p.height/2, imgSize, imgSize);
        }
    }

    private void drawInfoBoxes(){
        p.fill(40, 70, 50); 
        p.rect(p.width/2, p.height - 140, p.width - 200, 140, 20);

        p.fill(255);
        p.textSize(25);
        p.text(
            "The hippocampus helps form new memories each day.\n" +
            "It supports learning and remembering experiences.\n" +
            "Long-term stress can reduce its effectiveness.",
            p.width/2, p.height - 140
        );
    }

    public void keyPressed(){
        if(p.keyCode == PApplet.DOWN) brain.setScreen(1);
    }
}
