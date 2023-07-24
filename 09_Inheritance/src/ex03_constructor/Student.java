package ex03_constructor;

public class Student extends Person {

  private String school;
  
  // new Student()에서 호출되는 생성자
  public Student() {
    System.out.println("Student() 호출");
  }
  // new Student("가산대학교")에서 호출되는 생성자
  public Student(String school) {
    this.school = school;
    System.out.println("Student(String school) 호출");
  }
  // new Student("홍길동", "가산대학교")에서 호출되는 생성자
  public Student(String name, String school) {
    // 파라미터 String name을 슈퍼 클래스의 생성자를 호출할 때 전달한다.
    super(name);  // 인수 name은 String 타입이므로 파라미터가 String인 Person 생성자가 호출된다.
    this.school = school;
  }
  
  public String getSchool() {
    return school;
  }
  public void setSchool(String school) {
    this.school = school;
  }
  
}
