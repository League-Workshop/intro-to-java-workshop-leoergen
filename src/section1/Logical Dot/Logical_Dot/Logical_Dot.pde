


void setup(){
  size(600,600);
  
  
fill(#1A5A4A);
rect(100,100,200,300);
fill(#050002);
ellipse(100,100,25,25);
fill(#050002);
rect(200,200,10,25);
rect(192,215,25,10);
rect(192,215,10,25);
rect(210,215,10,25);
ellipse(192,190,10,10);
ellipse(220,190,10,10);

  
}

void draw(){

  if(mousePressed){
 fill(#008364);
  }else{
fill(#FFDD93);
  }
 ellipse(300,300,100,100); 
}
