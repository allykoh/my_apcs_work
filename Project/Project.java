import processing.core.*;
import java.util.*;  

public class Project {
   
    PApplet p;
    PVector cursor; 

    Project(PApplet parent){
        p = parent;
       cursor = new PVector(p.width/2, p.height/2); 
    }

    void draw(){
       p.background(20); 
       p.textSize(40);
       p.fill(255);  
        p.text("Anatomy View", p.width/4.0f, p.height/2.5f); 
          p.text("Anxiety Pathway", p.width/2.0f, p.height/2.5f); 
           p.text("Regulation View", (p.width*3)/4.0f, p.height/2.5f); 
       p.fill(100, 50, 80);
       p.circle(p.width/4.0f, p.height/2.0f, 140); 
        p.circle(p.width/2.0f, p.height/2.0f, 140);
         p.circle((p.width*3)/4.0f, p.height/2.0f, 140);
         
        
    }
}
