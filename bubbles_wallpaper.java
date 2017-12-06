void setup() {
  size(620,750);  
  frameRate(10);
}

void draw() {
  design();
}

//int ranPoso = int(random(200, 400));
//int ranPost = int(random(200, 400));
//int ranPosth = int(random(200, 400));

void design(){
  //for(int i=0; i<500; i++){
    coolShapes(int(random(4,620)), int(random(5,750)), int(random(55,200)));
  //}
}

void coolShapes(int ranPoso, int ranPost, int ranPosth){
  stroke(int(random(255)), int(random(255)), int(random(255)));
  fill(int(random(255)), int(random(255)), int(random(255)), 50);
  ellipse(ranPoso, ranPost, ranPosth, ranPosth);
  ranPoso = add_five(ranPoso);
  ranPost = add_five(ranPost);
  ranPosth = add_five(ranPosth);
}

int add_five(int x){
  return x + 5;
}
  
