package ex03_constructor;

/*
 * 상속 관계의 생성자
 * 1. 자식 클래스를 생성할 땐 "반드시" 부모 클래스를 "먼저" 생성해야 한다.
 * 2. 서브 클래스를 생성할 땐 "반드시" 슈퍼 클래스를 "먼저" 생성해야 한다.
 * 3. 서브 클래스의 생성자가 호출될 때는 "반드시" 슈퍼 클래스의 생성자를 "먼저" 호출해야 한다.
 * 4. 만약 서브 클래스의 생성자에서 슈퍼 클래스의 생성자를 호출하지 않으면 Java에 의해서 슈퍼 클래스의 "디폴트 생성자"가 호출된다.
 * 5. 서브 클래스의 생성자에서 슈퍼 클래스의 생성자를 호출하는 방법은 super()이다.
 */

public class MainWrapper {

  public static void main(String[] args) {
    
    // new Student()를 이용한 Student 객체 생성
    Student s1 = new Student();
    System.out.println(s1.getName());
    System.out.println(s1.getSchool());
    
    // new Student("가산대학교")를 이용한 Student 객체 생성
    Student s2 = new Student("가산대학교");
    System.out.println(s2.getName());
    System.out.println(s2.getSchool());
    
    // new Student("홍길동", "가산대학교")를 이용한 Student 객체 생성
    Student s3 = new Student("홍길동", "가산대학교");
    System.out.println(s3.getName());
    System.out.println(s3.getSchool());
    
  }

}
