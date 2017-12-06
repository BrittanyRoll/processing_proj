void setup(){
  size(700,700);
  frameRate(10);
}

int e = 0;

void draw(){
  for(int i=0; i<=30; i++){
    background(i+random(0,80), i+random(0,170), i+random(100,255));
  }
  for(int i=0; i<=540; i++){
    stroke(100,100,e);
    fill(130, random(0,130), e+10);
    rect(i+50, i+random(2,50), 30, 30);
    e = e+i;
  }
  for(int i=0; i<=20; i++){
    stroke(50,100, 50);
    fill(130, 20, 250);
    ellipse(random(100,740), random(50, 600), 30, 30);
  }
}
