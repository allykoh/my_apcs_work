import processing.core.*;
import java.util.*;  

public class SongScreen {
   
    PApplet p;
    PVector cursor; 

    SongScreen(PApplet parent){
        p = parent;
       cursor = new PVector(p.width/2, p.height/2); 
    }

    void draw(){
       p.background(20); 
       p.fill(227, 24, 24);
       p.circle(p.width/2.0f, p.height/2.0f, 80); 
    }
}
