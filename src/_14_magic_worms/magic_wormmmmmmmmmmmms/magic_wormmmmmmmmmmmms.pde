void setup(){
  size(500, 500);

  background(0,0,0);
}
int randX = 10;
int randY = 10;
int e = 0;
void draw(){
  e++;
  if(e>250){
   e--; 
  }
  makeMagical();  
if(mouseButton==0
){
  for(int i= 0;i<e;i++){
  
  fill(frameCount,i,0);
  ellipse(getWormX(i),getWormY(i),5,5);
  randX=int(random(500));
    randY=int(random(500)); 
}}}
    float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
