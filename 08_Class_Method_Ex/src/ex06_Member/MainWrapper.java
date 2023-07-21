package ex06_Member;

public class MainWrapper {

  public static void main(String[] args) {
    
    Address address = new Address();
    address.setPostCode("08505");
    address.setRoadAddr("가산디지털2로 95");
    address.setJibunAddr("가산동 550-7");
    address.setDetailAddr("3층 G강의실");
    
    Contact contact = new Contact();
    contact.setHomeTel("02-818-7950");
    contact.setMobile("010-1234-5678");
    contact.setAddress(address);
    
    Member member = new Member();
    member.setName("홍길동");
    member.setContact(contact);
    
    System.out.println("이름: " + member.getName());
    System.out.println("집전화: " + member.getContact().getHomeTel());
    System.out.println("모바일: " + member.getContact().getMobile());
    System.out.println("우편번호: " + member.getContact().getAddress().getPostCode());
    System.out.println("도로명: " + member.getContact().getAddress().getRoadAddr());
    System.out.println("지번: " + member.getContact().getAddress().getJibunAddr());
    System.out.println("상세주소: " + member.getContact().getAddress().getDetailAddr());

  }

}