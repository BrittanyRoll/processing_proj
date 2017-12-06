void setup(){
  //window size
  size(600, 600);
  background(6, 6, 38);
}

void draw(){
  /*each "big" if statement controls a diff. portion of the screen based on the 
  x-coordinate of the mouse*/
  if (mouseX >= 0 && mouseX < 100) {
    fill(60, 216, 169);
    stroke(48, 219, 168);
    if (mouseY <= 300) {
      ellipse(50, mouseY+300, mouseX*.5, mouseY/3);
    } else if (mouseY > 300) {
      ellipse(50, mouseY-300, mouseX*.5, (mouseY-300)/3);
    }
  }
  else if (mouseX >= 100 && mouseX< 200) {
    fill(60, 216, 179);
    stroke(48, 219, 178);
    if (mouseY <= 300) {
      ellipse(150, mouseY+300, (mouseX-100)*.5, mouseY/2);
    } else if (mouseY > 300) {
      ellipse(150, mouseY-300, (mouseX-100)*.5, (mouseY-300)/3);
    }
  }  
  else if (mouseX >= 200 && mouseX< 300) {
    fill(60, 216, 189);
    stroke(48, 219, 188);
    if (mouseY <= 300) {
      ellipse(250, mouseY+300, (mouseX-200)*.5, mouseY/2);
    } else if (mouseY > 300) {
      ellipse(250, mouseY-300, (mouseX-200)*.5, (mouseY-300)/3);
    }
  }   
  else if (mouseX >= 300 && mouseX< 400) {
    fill(60, 216, 209);
    stroke(48, 219, 208);
    if (mouseY <= 300) {
      ellipse(350, mouseY+300, (mouseX-300)*.5, mouseY/2);
    } else if (mouseY > 300) {
      ellipse(350, mouseY-300, (mouseX-300)*.5, (mouseY-300)/3);
    }
  }   
  else if (mouseX >= 400 && mouseX< 500) {
    fill(60, 216, 229);
    stroke(48, 219, 228);
    if (mouseY <= 300) {
      ellipse(450, mouseY+300, (mouseX-400)*.5, mouseY/2);
    } else if (mouseY > 300) {
      ellipse(450, mouseY-300, (mouseX-400)*.5, (mouseY-300)/3);
    }
  }    
  else if (mouseX >= 500 && mouseX< 600) {
    fill(60, 216, 249);
    stroke(48, 219, 248);
    if (mouseY <= 300) {
      triangle(550, mouseY+300, 500, mouseY+400, 599, mouseY+400);
      //ellipse(550, mouseY+300, (mouseX-500)*.5, mouseY/2);
    } else if (mouseY > 300) {
      triangle(550, mouseY-300, 500, mouseY-400, 599, mouseY-400);
     //ellipse(550, mouseY-300, (mouseX-500)*.5, (mouseY-300)/3);
    }
  }
}
