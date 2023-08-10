package main;

import java.util.Map;

import javax.swing.JOptionPane;

import controller.ContactController;
import view.DeleteView;
import view.DetailView;
import view.InsertView;
import view.ListView;
import view.UpdateView;
import view.View;

// ContactMain -> ContactController -> ContactService -> ContactDao -> DB

public class ContactMain {

  public static void main(String[] args) {
    
    ContactController contactController = new ContactController();
    
    while(true) {
      
      String choice = JOptionPane.showInputDialog("1.삽입\n2.수정\n3.삭제\n4.전체조회\n5.상세조회\n0.종료\n원하는 작업을 입력하세요.");
      View view = null;

      switch(choice) {
      case "1":
        view = new InsertView();
        break;
      case "2":
        view = new UpdateView();
        break;
      case "3":
        view = new DeleteView();
        break;
      case "4":
        view = new ListView();
        break;
      case "5":
        view = new DetailView();
        break;
      case "0":
        JOptionPane.showMessageDialog(null, "연락처 프로그램을 종료합니다.");
        return;
      default:
        JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 선택하세요.");
      }

      if(view != null) {
        Map<String, Object> map = view.display();
        String message = contactController.request(choice, map);
        JOptionPane.showMessageDialog(null, message);
      }
      
    }
    
  }
  
}
