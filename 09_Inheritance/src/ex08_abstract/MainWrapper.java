package ex08_abstract;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 추상 클래스 Person은 객체를 생성할 수 없다.
    // Person p1 = new Person();
    // p1.eat();
    // p1.sleep();
    
    Person p2 = new Student();
    p2.eat();
    p2.sleep();
    p2.study();
    
  }
  
}
