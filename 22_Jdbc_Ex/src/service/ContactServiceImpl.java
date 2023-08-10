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
    System.out.println("Service::" + map);
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
    
    System.out.println("Service::" + map);
    
    // 수정할 정보 (값이 있거나, 빈 문자열이다.)
    int contact_no = Integer.parseInt((String)map.get("contact_no"));
    String name = (String)map.get("name");
    String tel = (String)map.get("tel");
    String email = (String)map.get("email");
    String address = (String)map.get("address");
    
    // 수정하기 전에 원본 ContactDto 가져오기
    ContactDto originDto = contactDao.selectContactByNo(contact_no);

    // 원본 ContactDto가 없는 경우 (contact_no가 일치하는 연락처가 없는 경우)
    if(originDto == null) {
      return 0;  // 수정 실패로 처리
    }
    
    // Map -> ContactDto
    ContactDto contactDto = new ContactDto();
    contactDto.setContact_no(contact_no);
    contactDto.setName(name.isEmpty() ? originDto.getName() : name);
    contactDto.setTel(tel.isEmpty() ? originDto.getTel() : tel);
    contactDto.setEmail(email.isEmpty() ? originDto.getEmail() : email);
    contactDto.setAddress(address.isEmpty() ? originDto.getAddress() : address);
    
    // 실행 + 결과반환
    return contactDao.update(contactDto);
    
  }

  @Override
  public int delete(Map<String, Object> map) {
    
    System.out.println("Service::" + map);
    
    // Map이 없으면 삭제 안 함
    if(map == null) {
      return 0;
    }
    
    // Map에서 contact_no 추출
    int contact_no = Integer.parseInt((String)map.get("contact_no"));
    
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
    System.out.println("Service::" + map);
    // Map에서 contact_no 추출
    int contact_no = Integer.parseInt((String)map.get("contact_no"));
    // 실행 + 결과반환
    return contactDao.selectContactByNo(contact_no);
  }

}
