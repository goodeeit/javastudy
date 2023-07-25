package ex04_Chair;

public class Student extends Person {

  private String school;
  
  public Student() {
    
  }
  public Student(String name, String school) {
    super(name);  // public Person(String name){} 생성자를 호출한다.
    this.school = school;
  }
  
  public String getSchool() {
    return school;
  }
  public void setSchool(String school) {
    this.school = school;
  }
  
  @Override
  public void info() {
    super.info();  // 슈퍼 클래스의 info
    System.out.println("학교: " + school);
  }
  
}
