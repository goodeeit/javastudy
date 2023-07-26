package ex09_interface;

public class MainWrapper {

  public static void main(String[] args) {
    
    Shape s1 = new Rectangle(3, 4);
    System.out.println(s1.getArea());
    s1.info1();
    Shape.info2();
    
    Shape s2 = new Circle(1.5);
    System.out.println(s2.getArea());
    s2.info1();
    Shape.info2();

  }

}
