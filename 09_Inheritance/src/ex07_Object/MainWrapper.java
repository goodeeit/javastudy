package ex07_Object;

public class MainWrapper {

  public static void main(String[] args) {
    
    Object obj = new Person();
    ((Person)obj).setName("홍길동");
    ((Person)obj).setAge(20);
    System.out.println(((Person)obj).getName());
    System.out.println(((Person)obj).getAge());

  }

}
