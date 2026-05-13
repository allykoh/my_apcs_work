import processing.core.*;
import java.util.*;

public class Brain extends PApplet {

    private int screen = 0;

    ArrayList<Screens> screens = new ArrayList<Screens>();

    public static void main(String[] args){
        PApplet.main("Brain");
    }

    public void settings(){
        fullScreen();
    }

    public void setup(){
        textAlign(CENTER, CENTER);


        screens.add(new Screen1(this, this));            
        screens.add(new AmygSide(this, this));           
        screens.add(new PfcSide(this, this));            
        screens.add(new HippocampusSide(this, this));    
    }

    public void draw(){

        if(screen == 0){
            drawTitleScreen();
        } else {
            screens.get(screen - 1).display();
        }
    }

    public void drawTitleScreen(){
        background(30);

        fill(100, 50, 80);
        rectMode(CENTER);
        rect(width/2, height/2, 890, 200);

        fill(255);
        textSize(height * 0.07f);
        text("Flight, Fight, and Thought", width/2, height/2);
    }

    public void setScreen(int s){
        screen = s;
    }

    public void mousePressed(){
        if(screen == 0){
            screen = 1; 
        }
    }

    public void keyPressed(){
        if(screen > 0){
            screens.get(screen - 1).keyPressed();
        }
    }
}
//javac -cp ".:/Applications/Processing.app/Contents/Java/core/library/core.jar" *.java
//java -cp ".:/Applications/Processing.app/Contents/Java/core/library/core.jar" Brain

