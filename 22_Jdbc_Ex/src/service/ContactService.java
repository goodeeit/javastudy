package service;

import java.util.List;
import java.util.Map;

import dto.ContactDto;

public interface ContactService {
  int insert(Map<String, Object> map);
  int update(Map<String, Object> map);
  int delete(Map<String, Object> map);
  List<ContactDto> selectList();
  ContactDto selectContactByNo(Map<String, Object> map);
}
