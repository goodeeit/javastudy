package view;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class InsertView implements View {

  @Override
  public Map<String, Object> display() {
    
    String name = JOptionPane.showInputDialog("이름을 입력하세요.");
    String tel = JOptionPane.showInputDialog("전화번호를 입력하세요.");
    String email = JOptionPane.showInputDialog("이메일을 입력하세요.");
    String address = JOptionPane.showInputDialog("주소를 입력하세요.");
    
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("name", name);
    map.put("tel", tel);
    map.put("email", email);
    map.put("address", address);
    
    return map;
    
  }

}
