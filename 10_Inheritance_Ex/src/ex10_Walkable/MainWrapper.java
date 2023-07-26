package ex10_Walkable;

public class MainWrapper {

  public static void main(String[] args) {
    
    Dog dog = new Dog("백구");
    Snake snake = new Snake("냘름");
    
    Person p = new Person();
    
    p.foodFeed(dog, "고구마");  // 백구에게 고구마주기
    p.foodFeed(snake, "감자");  // 냘름에게 감자주기
    
    p.walk(dog);    // 백구와 산책하기
    // p.walk(snake);  // 컴파일 오류 발생

  }

}
