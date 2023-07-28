package ex04_Student;

public class Student {

  private String name;
  private Exam exam;
  
  public Student() {
   
  }
  public Student(String name, Exam exam) {
    super();
    this.name = name;
    this.exam = exam;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Exam getExam() {
    return exam;
  }
  public void setExam(Exam exam) {
    this.exam = exam;
  }
  
}
