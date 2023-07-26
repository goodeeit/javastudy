package ex01_generic;

public class MainWrapper {

  public static void main(String[] args) {
    
    // String을 저장하는 box1
    Box<String> box1 = new Box<String>();
    box1.setItem("Hello world");
    System.out.println(box1.getItem());
    
    // int를 저장하는 box2
    // 오직 "참조타입"만 Generic 처리에서 사용할 수 있다.
    // int의 참조타입인 Integer를 사용한다.
    Box<Integer> box2 = new Box<Integer>();
    box2.setItem(10);
    System.out.println(box2.getItem());
    
    // Person을 저장하는 box3
    Box<Person> box3 = new Box<Person>();
    box3.setItem(new Person("홍길동"));
    System.out.println(box3.getItem());
    
  }

}
