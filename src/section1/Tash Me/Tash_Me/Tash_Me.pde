PImage mustache;
PImage oboma;
PImage hat;
//PImage for hat

void setup() {
  oboma=loadImage("oboma.jpg");
  size(800, 600);
  oboma.resize(width, height); 
  mustache=loadImage("tash.png");
  
  // load hat like you did with mustache and obama
 hat=loadImage("hat.png"); 
}

void draw() {
  background(oboma);

  if (mousePressed) {
    image(mustache, mouseX-110, mouseY-90);
  } else {
  image(mustache,mouseX-110,mouseY-90);
  }
  
  
  if(mouseButton==LEFT){
    image(hat,50
}
}
