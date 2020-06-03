PImage rainbow;
PImage unicorn;
int x=0;
int y=0;
//PImage
void setup() {
  rainbow=loadImage("rainbow.jpeg");
  size(800,600);
  rainbow.resize(800,600);
  unicorn=loadImage("unicorn.png");
  unicorn.resize(150,200);
}

void draw() {
  background(rainbow);
 //image(unicorn,mouseX,mouseY);
 if(mousePressed){
   background(rainbow);
   x=mouseX-75;
   y=mouseY-100;
 }  
  image(unicorn,x,y);

}
