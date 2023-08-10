package service;

import java.util.List;
import java.util.Map;

import dao.ContactDao;
import dto.ContactDto;

// ContactMain -> ContactController -> ContactService -> ContactDao -> DB

public class ContactServiceImpl implements ContactService {

  // ContactDao는 Singleton Pattern으로 작성되어있다.
  private ContactDao contactDao = ContactDao.getDao();
  
  @Override
  public int insert(Map<String, Object> map) {
    // Map -> ContactDto
    ContactDto contactDto = new ContactDto();
    contactDto.setName((String)map.get("name"));
    contactDto.setTel((String)map.get("tel"));
    contactDto.setEmail((String)map.get("email"));
    contactDto.setAddress((String)map.get("address"));
    // 실행 + 결과반환
    return contactDao.insert(contactDto);
  }

  @Override
  public int update(Map<String, Object> map) {
    // Map -> ContactDto
    ContactDto contactDto = new ContactDto();
    contactDto.setContact_no((int)map.get("contact_no"));
    contactDto.setName((String)map.get("name"));
    contactDto.setTel((String)map.get("tel"));
    contactDto.setEmail((String)map.get("email"));
    contactDto.setAddress((String)map.get("address"));
    // 실행 + 결과반환
    return contactDao.update(contactDto);
  }

  @Override
  public int delete(Map<String, Object> map) {
    // Map에서 contact_no 추출
    int contact_no = (int)map.get("contact_no");
    // 실행 + 결과반환
    return contactDao.delete(contact_no);
  }

  @Override
  public List<ContactDto> selectList() {
    // 실행 + 결과반환
    return contactDao.selectList();
  }

  @Override
  public ContactDto selectContactByNo(Map<String, Object> map) {
    // Map에서 contact_no 추출
    int contact_no = (int)map.get("contact_no");
    // 실행 + 결과반환
    return contactDao.selectContactByNo(contact_no);
  }

}
