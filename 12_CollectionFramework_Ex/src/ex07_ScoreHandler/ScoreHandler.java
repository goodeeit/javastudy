package ex07_ScoreHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ScoreHandler {

  private List<Map<String, Object>> students;
  
  // new ScoreHandler()
  public ScoreHandler() {
    students = new ArrayList<Map<String,Object>>();
  }
  
  public void addScore(Map<String, Object> map) {
    students.add(map);
  }
  
  public int getMax() {
    int max = (int)(students.get(0).get("score"));
    for(int i = 1, length = students.size(); i < length; i++) {
      int score = (int)(students.get(i).get("score"));
      if(max < score) {
        max = score;
      }
    }
    return max;
  }
  
  
  
  
  
  
  
  
  
  
  
  
}
