package view;

import java.util.Map;

import javax.swing.JOptionPane;

public class ListView implements View {

  @Override
  public Map<String, Object> display() {
    
    JOptionPane.showMessageDialog(null, "전체 연락처를 가져옵니다.");
    return null;
    
  }

}
