package ex04_Student;

import java.util.HashMap;
import java.util.Map;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 교실의 5명 학생 정보를 저장하는 HashMap 만들기
    // Key   : 학번(예: 10101)
    // Value : Student 객체

    Map<Integer, Student> clazz = new HashMap<Integer, Student>();
    
    clazz.put(10101, new Student("가길동", new Exam(100, 100, 100)));
    
    Student student = new Student();
    student.setName("나길동");
    student.setExam(new Exam(90, 90, 90));
    clazz.put(10102, student);
    
    
    
    
    
    
    
    
    
  }

}
