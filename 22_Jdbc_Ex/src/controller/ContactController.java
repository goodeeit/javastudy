package controller;

import java.util.List;
import java.util.Map;

import dto.ContactDto;
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
   * @return message 처리 결과 메시지
   */
  public String request(String choice, Map<String, Object> map) {
    
    System.out.println("Controller::" + map);
    
    String message = "";
    
    switch(choice) {
    case "1":
      int insertCount = contactService.insert(map);
      message = insertCount + "개 연락처가 등록되었습니다.";
      break;
    case "2":
      int updateCount = contactService.update(map);
      message = updateCount + "개 연락처가 수정되었습니다.";
      break;
    case "3":
      int deleteCount = contactService.delete(map);
      message = deleteCount + "개 연락처가 삭제되었습니다.";
      break;
    case "4":
      List<ContactDto> list = contactService.selectList();
      for(ContactDto contactDto : list) {
        message += contactDto.toString() + "\n";
      }
      break;
    case "5":
      ContactDto contactDto = contactService.selectContactByNo(map);
      if(contactDto == null) {
        message = "조회된 결과가 없습니다.";
      } else {
        message = "조회결과: " + contactDto.toString();
      }
      break;
    }
    
    return message;
    
  }
  
}
