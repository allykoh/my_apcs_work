import processing.core.PVector;
import processing.core.PApplet;

public class Square {
    PVector position;
    PVector velocity;
    int c;
    float size = 50;
    PApplet p;

    Square(float x, float y, PApplet parent){
        p = parent;
        position = new PVector(x, y);
        velocity = new PVector(p.random(-3,3), p.random(-3,3));
        c = p.color(p.random(256), p.random(256), p.random(256));
    }

    void update(){
        position.add(velocity);
        if(position.x < 0 || position.x + size > p.width) velocity.x *= -1;
        if(position.y < 0 || position.y + size > p.height) velocity.y *= -1;
    }

    void display(){
        p.fill(c);
        p.square(position.x, position.y, size);
    }
}
