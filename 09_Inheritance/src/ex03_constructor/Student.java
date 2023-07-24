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
  
  public String getSchool() {
    return school;
  }
  public void setSchool(String school) {
    this.school = school;
  }
  
}
