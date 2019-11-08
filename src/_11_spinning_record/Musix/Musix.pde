 import ddf.minim.*;             //at the very top of your sketch
  Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
  PImage pictureOfRecord;  
void setup() {
  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);   //in the setup method
                      //as member variable
  size(600, 600);                                 //in setup method
  pictureOfRecord= loadImage("spinningRecord.png");      //in setup method
 
}
int angle;
void draw() {

 
angle++;
  image(pictureOfRecord, 1, 1);  //in draw method 
  if (mousePressed==true){
  rotateImage(pictureOfRecord, 100);
  song.play();
 }

  else{
   song.pause();
    song.rewind();
  }
 
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
