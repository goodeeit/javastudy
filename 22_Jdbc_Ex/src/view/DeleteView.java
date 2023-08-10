package view;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class DeleteView implements View {

  @Override
  public Map<String, Object> display() {
    
    if(JOptionPane.showConfirmDialog(null, "삭제를 진행할까요?") == 0) {
      
      String contact_no = JOptionPane.showInputDialog("삭제할 연락처 번호를 입력하세요");
      
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("contact_no", contact_no);
      
      return map;

    } else {
      
      return null;
      
    }
    
  }

}
