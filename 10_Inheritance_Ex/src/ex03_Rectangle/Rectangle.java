package ex03_Rectangle;

public class Rectangle {

  private int width;  // 너비
  private int height; // 높이
  
  // new Rectangle()
  public Rectangle() {
    
  }
  // new Rectangle(10, 20) - 너비 10, 높이 20
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
  
  public int getWidth() {
    return width;
  }
  public void setWidth(int width) {
    this.width = width;
  }
  public int getHeight() {
    return height;
  }
  public void setHeight(int height) {
    this.height = height;
  }
  
  // 넓이를 반환하는 메소드
  public int getArea() {
    return width * height;
  }
  
  // 너비, 높이, 넓이를 출력하는 메소드
  public void info() {
    System.out.println("너비: " + width);
    System.out.println("높이: " + height);
    System.out.println("넓이: " + getArea());
  }
  
}
