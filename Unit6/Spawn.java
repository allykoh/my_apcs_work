import processing.core.*;
import java.util.ArrayList;

public class Spawn extends PApplet {

    ArrayList<Square> squares;

    public static void main(String[] args){
        PApplet.main("Spawn");
    }

    public void settings(){
        size(400,400);
    }

    public void setup(){
        squares = new ArrayList<Square>();
        squares.add(new Square(50, 50, this));
    }

    public void draw(){
        background(0);
        for(Square s : squares){
            s.update();
            s.display();
        }
    }

    public void mousePressed() {
        squares.add(new Square(mouseX, mouseY, this));
    }
}


//java -cp /Applications/Processing.app/Contents/Java/core/library/core.jar:. Spawn
