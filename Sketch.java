import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 255, 242);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    if(mouseY > 250)
    {
      stroke(55, 135, 39);
      fill(55, 135, 39);
      rect(mouseX, mouseY, 100, 100);
    }

    if (mousePressed && mouseY > 100)
    {
      stroke(0, 76, 255);
      fill(0, 76, 255);
      ellipse(mouseX, mouseY, 100, 100);
    }

  }

  public void mousePressed()
  {
    stroke(32);
    fill(32);
    ellipse(50, 150, 25, 25);

    stroke(32);
    fill(32);
    triangle(56, 150, 80, 142, 80, 158);

    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(45, 147, 5, 5);
  }

  public void mouseReleased()
  {
    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(300, 30, 20, 20);

    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(300, 40, 20, 20);

    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(285, 40, 20, 20);

    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(315, 40, 20, 20);
  }

  public void mouseClicked()
  {
    stroke(165,42,42);
    fill(165,42,42);
    rect(300,200,20,150);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(310,200,50,50);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(280,200,50,50);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(340,200,50,50);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(310,170,50,50);

  }

  
  // define other methods down here.
}