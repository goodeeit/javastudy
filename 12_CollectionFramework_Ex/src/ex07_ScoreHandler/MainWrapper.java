package ex07_ScoreHandler;

import java.util.HashMap;
import java.util.Map;

public class MainWrapper {

  public static void main(String[] args) {

    ScoreHandler handler = new ScoreHandler();
    
    Map<String, Object> student1 = new HashMap<String, Object>();
    student1.put("name", "미희");
    student1.put("score", 100);
    handler.addScore(student1);
    
    Map<String, Object> student2 = new HashMap<String, Object>();
    student2.put("name", "정숙");
    student2.put("score", 70);
    handler.addScore(student2);
    
    Map<String, Object> student3 = new HashMap<String, Object>();
    student3.put("name", "상철");
    student3.put("score", 95);
    handler.addScore(student3);
    
    Map<String, Number> map = handler.get();
    
    System.out.println("최댓값: " + map.get("max"));
    System.out.println("최솟값: " + map.get("min"));
    System.out.println("합계: " + map.get("total"));
    System.out.println("평균: " + map.get("average"));
    
  }

}
