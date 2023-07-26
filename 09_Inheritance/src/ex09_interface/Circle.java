package ex09_interface;

public class Circle implements Shape {

  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }
  
  @Override
  public double getArea() {
    return PI * radius * radius;
  }

}
