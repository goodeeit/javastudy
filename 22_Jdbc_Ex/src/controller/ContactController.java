package controller;

import java.util.Map;

import service.ContactService;
import service.ContactServiceImpl;

// ContactMain -> ContactController -> ContactService -> ContactDao -> DB

public class ContactController {

  private ContactService contactService = new ContactServiceImpl();

  /**
   * 요청 처리 메소드<br>
   * @param choice 1,2,3,4,5 중 하나
   * @param map 사용자가 입력한 값
   *            choice == 1 : name, tel, email, address
   *            choice == 2 : contact_no, name, tel, email, address
   *            choice == 3 : contact_no
   *            choice == 4 : null
   *            choice == 5 : contact_no
   */
  public void request(String choice, Map<String, Object> map) {
    
    switch(choice) {
    case "1":
      contactService.insert(map);
      break;
    case "2":
      contactService.update(map);
      break;
    case "3":
      contactService.delete(map);
      break;
    case "4":
      contactService.selectList();
      break;
    case "5":
      contactService.selectContactByNo(map);
      break;
    }
    
  }
  
}
