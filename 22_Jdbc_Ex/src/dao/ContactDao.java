package dao;

/*
 * DAO
 * 1. Database Access Object
 * 2. 데이터베이스에 접근해서 쿼리문을 실행하고 쿼리문의 실행 결과를 받는 객체이다.
 * 3. 하나의 객체만 만들어서 사용하는 Singleton Pattern으로 객체를 생성한다.
 */

public class ContactDao {

  /*
   * Singleton Pattern
   * 1. 오직 하나의 객체만 만들 수 있도록 처리하는 패턴이다.
   * 2. 미리 하나의 객체를 만든 뒤 해당 객체를 가져다 사용할 수 있도록 처리한다.
   * 3. 객체 생성이 불가능하도록 생성자를 호출할 수 없게 만든다.
   */
  private static ContactDao dao = new ContactDao();
  private ContactDao() {
    // 내부에서만 호출할 수 있는 생성자
  }
  public static ContactDao getDao() {
    return dao;
  }

  
  
  
  
  
  
  
  
  
  
  
  
}
