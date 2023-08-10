package view;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class UpdateView implements View {

  @Override
  public Map<String, Object> display() {
    
    String contact_no = JOptionPane.showInputDialog("수정할 연락처 번호를 입력하세요");
    String name = JOptionPane.showInputDialog("수정할 이름을 입력하세요");
    String tel = JOptionPane.showInputDialog("수정할 전화번호를 입력하세요");
    String email = JOptionPane.showInputDialog("수정할 이메일을 입력하세요");
    String address = JOptionPane.showInputDialog("수정할 주소를 입력하세요");
    
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("contact_no", contact_no);
    map.put("name", name);
    map.put("tel", tel);
    map.put("email", email);
    map.put("address", address);
    
    return map;
    
  }

}
