PImage backgroundImage;
boolean e = true;
import ddf.minim.*;
Minim minim;
AudioSample sound;

void setup() {
  size (422, 851);
  backgroundImage = loadImage("pong.png");
  backgroundImage.resize(422, 851);
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
}
int x = 250;
int y = 250;
int speed = 8;
int ySpeed = 13;

void draw() {

  background(backgroundImage);

  x= x+speed;
  if (width<x) {
    speed=-speed;
    sound.trigger();
  }
  if (x<0) {
    speed=-speed;
    sound.trigger();
  }
  y= y+ySpeed;
  if (height<y) {
    ySpeed=-ySpeed;
    sound.trigger();
  }
  if (0>y||intersects()) {
    ySpeed=-ySpeed; 
    sound.trigger();
  }



  fill(255, 0, 0);
  stroke(125, 255, 0);
  ellipse(x, y, 10, 10);
  rect(mouseX, 800, 70, 30);
}

  boolean intersects() {
    if (y > 800 && x > mouseX && x < mouseX + 70)
      return true;
    else
      return false;
  }
