
void setup(){
  size(600,600);

   
   
}
int e = 0;
 int randomNumber = 250;
 int score = 0;
void draw(){

  e=e+10;
    background(1,1,1);
      fill(30, 10, 243);
    stroke(54, 10, 240);
    ellipse(randomNumber, e, 5, 5);
    fill(0,255,0);
   rect(mouseX, 550, 30, 50);
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
       
if(e>600){
  checkCatch(randomNumber);
  e=0;
    randomNumber = (int) random(600);
}
  
  
  
}
  void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
