import processing.core.*;

public class AmygSide implements Screens {

    private PApplet p;
    private Brain brain;

    AmygSide(PApplet parent, Brain b){
        p = parent;
        brain = b;
    }

    public void display(){
		
		p.rectMode(PApplet.CENTER);  
		p.textAlign(PApplet.CENTER, PApplet.CENTER); 
        p.background(50, 20, 40);

        drawTitle();
        drawImagePlaceholder();
        drawInfoBoxes();
    }

    private void drawTitle(){
        p.fill(255);
        p.textSize(40);
     
        p.text("Amygdala - Side View", p.width / 2, p.height * 0.08f);
    }

    private void drawImagePlaceholder(){

        float imgW = 300;
        float imgH = 300;
        float imgX = p.width / 2 - imgW / 2;
        float imgY = p.height / 2 - imgH / 2;

        p.fill(120);
        p.rect(p.width / 2, p.height / 2, 300, 300);

        p.fill(255);
        p.textSize(20);
        p.text("Image will go here", p.width / 2, p.height / 2);
    }

    private void drawInfoBoxes(){

        float boxW = p.width - 200;
        float boxH = 120;
        float boxX = p.width / 2 - boxW / 2;
        float boxY = p.height - 200;

        p.fill(90);\
		p.rect(p.width / 2, p.height - 140, p.width - 200, 120, 20);

        p.fill(255);
        p.textSize(18);
        p.text("Information here...", p.width / 2, boxY + boxH / 2);
    }

    public void keyPressed(){
        if(p.keyCode == PApplet.LEFT){
            brain.setScreen(2);  
        }
    }
}
