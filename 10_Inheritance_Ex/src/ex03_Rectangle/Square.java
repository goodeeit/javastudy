package ex03_Rectangle;

public class Square extends Rectangle {

  // new Square()
  public Square() {
    super();
  }
  
  // new Square(6)
  public Square(int width) {
    super(width, width);  // new Rectangle(6, 6)
  }
  
}
