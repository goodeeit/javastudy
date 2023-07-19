package ex05_access_modifier;

public class MainWrapper {

  public static void main(String[] args) {
    
    // User 객체(객체명 u) 생성
    User u = new User();
    
    // User 객체에 데이터 저장
    u.setId("admin");
    u.setAge(30);
    
    // User 객체의 데이터 확인
    System.out.println(u.getId());
    System.out.println(u.getAge());

  }

}
