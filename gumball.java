color WHITE = color(255);
color BLACK = color(0);
color GRAY = color(127);

int insertButtonX,turnButtonX,insertButtonY,turnButtonY;
int insertButtonSize=100;
int turnButtonSize=100;
color insertButtonColor,turnButtonColor;
color insertButtonHover,turnButtonHover;
color backgroundColor = WHITE;
boolean turnPressed, insertPressed;

GumballMachine gumballMachine = new GumballMachine(3);

void setup() 
{
  size(800, 800);
  background(backgroundColor);
  smooth();
  strokeWeight(3);
  strokeCap(ROUND);
  
  insertButtonColor = WHITE;
  turnButtonColor = WHITE;
  insertButtonX=30;
  turnButtonX=630;
  insertButtonY=20;
  turnButtonY=20;
  insertButtonHover=GRAY;
  turnButtonHover=GRAY;
  
  // load font
  PFont font;
  font = loadFont("BookAntiqua-48.vlw");
  textFont(font, 32);
   fill(0);
   text("The Gumball Machine", 250, 60);
   PImage image = loadImage("gumball.jpg");
  image(image, (width-image.width)/2, (height-image.height)/2);
  drawRectangle(insertButtonX, insertButtonY, insertButtonSize, insertButtonSize, 0, WHITE, "Insert \n$.25", BLACK);
  drawRectangle(turnButtonX, turnButtonY, turnButtonSize, turnButtonSize, 0, WHITE, "Turn \nCrank", BLACK);
  loop();
  
}

void draw() {
  //if (!overInsertButton() && !overTurnButton()) {
  //  backgroundColor = WHITE;
  //} else {
  //  backgroundColor = GRAY;
  //}
  if (insertPressed) {
    drawRectangle(insertButtonX, insertButtonY, insertButtonSize, insertButtonSize, 0, BLACK, "Insert \n$.25", WHITE);
  } else {
    if (overInsertButton()) {
      drawRectangle(insertButtonX, insertButtonY, insertButtonSize, insertButtonSize, 0, GRAY, "Insert \n$.25", BLACK);
    } else {
      drawRectangle(insertButtonX, insertButtonY, insertButtonSize, insertButtonSize, 0, WHITE, "Insert \n$.25", BLACK);    
    }
  }
  if (turnPressed) {
    drawRectangle(turnButtonX, turnButtonY, turnButtonSize, turnButtonSize, 0, BLACK, "Turn\nCrank", WHITE);
  } else {
    if (overTurnButton()) {
      drawRectangle(turnButtonX, turnButtonY, turnButtonSize, turnButtonSize, 0, GRAY, "Turn\nCrank", BLACK);
    } else {
      drawRectangle(turnButtonX, turnButtonY, turnButtonSize, turnButtonSize, 0, WHITE, "Turn\nCrank", BLACK);    
    }
  }
}


public void runTest() {
  
  GumballMachine gumballMachine = new GumballMachine(5);
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
  System.out.println("Finished");
}

void mousePressed() {
  if (overInsertButton()) {
    insertPressed = true;
    gumballMachine.insertQuarter();
  } else if (overTurnButton()) {
    turnPressed = true;
    gumballMachine.turnCrank();
  }
}

void mouseReleased() {
  turnPressed = false;
  insertPressed = false;
}


void drawRectangle(int x, int y, int width, int height, int str, color fillColor, String txt, color txtColor) {
  stroke(str);
  fill(fillColor);
  rect(x, y, width, height);
  fill(txtColor);
  text(txt,x+10,y+40);  
}
boolean overInsertButton() {
  return ((mouseX>insertButtonX) && (mouseX<insertButtonX+insertButtonSize) && (mouseY>insertButtonY) && (mouseY<insertButtonY+insertButtonSize));  
}
boolean overTurnButton() {
  return ((mouseX>turnButtonX) && (mouseX<turnButtonX+turnButtonSize) && (mouseY>turnButtonY) && (mouseY<insertButtonY+turnButtonSize));  
}

