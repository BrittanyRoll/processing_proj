//create new variable for ball
Ball ball;
Ball ballnew;
float gravity = 0.1;

void setup() {
  size(600, 600);
  ball = new Ball(350, 60, 70, random(255), random(255), random(255)); //new indicates a new instance, Ball shows a constructor
  ballnew = new Ball(200,150, 150, random(125), random(255), random(255));
  
}

void draw() {
  background(255);
  ball.display();
  ball.move();
  ballnew.display();
  ballnew.move();
}

class Ball {
  float x;
  float y;
  float wid;
  float speed;
  float r;
  float g;
  float b;

  Ball(float X, float Y, float W, float R, float G, float B) {
    x = X;
    y = Y;
    wid = W;
    r = R;
    g = G;
    b = B;
    
    speed=0;
  }

  void display() {
    for (int i = 0; i<=500; i+=50){
    fill(r, g, b);
    stroke(r, g, b);
    ellipse(x, y, wid, wid);
    }
  }
  void move() {
    y = y + speed;
    speed = speed + gravity;
    if (y > height) {
      speed = speed*-0.95;
      y = height;
    }
  }
  void copY() {
    if (y < 200) {
      ellipse(x+100, y, 10, 10);
    }
  }
}
