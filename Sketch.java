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
      ellipse(mouseX, mouseY, 75, 75);
    }

    if(key == 's')
    {
      stroke(0, 76, 255);
      fill(0, 76, 255);
      rect(0,0,400, 100);
      
      stroke(255, 227, 115);
      fill(255, 227, 115);
      rect(0, 0, 400, 75);
    }

    if(key == 'u')
    {
      stroke(250, 214, 165);
      fill(250, 214, 165);
      rect(0, 0, 400, 75);
    }

    if(key == 'n')
    {
      stroke(252, 156, 84);
      fill(252, 156, 84);
      rect(0, 0, 400, 75);

      stroke(230, 255, 8);
      fill(230, 255, 8);
      arc(200, 75, 80, 80, -PI, 0);
      
    }

    if(key == 'e')
    {
      stroke(75, 61, 96);
      fill(75, 61, 96);
      rect(0, 0, 400, 75);
    }

    if(key == 't')
    {
      stroke(21, 40, 82);
      fill(21, 40, 82);
      rect(0, 0, 400, 75);

      stroke(199, 212, 199);
      fill(199, 212, 199);
      arc(200, 75, 80, 80, -PI, 0);
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
    ellipse(250, 120, 20, 20);

    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(250, 130, 20, 20);

    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(235, 130, 20, 20);

    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(265, 130, 20, 20);
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