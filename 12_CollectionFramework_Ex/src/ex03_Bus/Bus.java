package ex03_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {

  private List<Seat> seats;      // List<Seat> seats 선언
  private final int LIMIT = 25;  // 25인승
  
  /**
   * new Bus()가 실행되면<br>
   * List<Seat> seats에 LIMIT만큼의 빈 시트(new Seat())을 저장한다.<br>
   */
  public Bus() {
    // List<Seat> seats 생성
    seats = new ArrayList<Seat>();
    // LIMIT만큼 빈 시트(new Seat()) 생성
    for(int cnt = 0; cnt < LIMIT; cnt++) {  // LIMIT만큼 반복하는 for문
      seats.add(new Seat());      
    }
  }
  
  /**
   * 착석 메소드<br>
   * 1. 착석할 시트번호와 착석할 Person을 받아온다.<br>
   * 2. List<Seat> seats에서 착석할 시트(Seat)를 가져온다.<br>
   * 3. 가져온 시트(Seat)에 착석할 Person을 저장한다.<br>
   * 4. 예외상황
   *    1) 착석할 시트번호가 1~LIMIT을 벗어난 경우
   *    2) 착석할 시트에 이미 Person이 있는 경우 
   * @param seatNo 착석할 시트번호. 1~LIMIT 사이 값을 받는다.
   * @param person 착석할 Person. new Person("이름") 또는 new Student("이름")을 받는다.
   */
  public void getOn(int seatNo, Person person) {
    if(seatNo < 1 || seatNo > LIMIT) {
      System.out.println("존재하지 않는 시트번호입니다.");
      return;
    }
    Seat seat = seats.get(seatNo - 1);  // 착석할 시트
    if(seat.getPerson() != null) {  // 착석할 시트에 Person이 있다.
      System.out.println("이미 점유된 시트번호입니다.");
      return;
    }
    seat.setPerson(person);  // 착석!
    System.out.println(seatNo + "번 시트에 " + person + " 착석했습니다.");
  }
  
  /**
   * 하차 메소드<br>
   * 1. 하차할 시트번호를 받아온다.<br>
   * 2. List<Seat> seats에서 하차할 시트(Seat)를 가져온다.<br>
   * 3. 가져온 시트(Seat)에 null 값을 저장한다.<br>
   * 4. 예외상황
   *    1) 하차할 시트번호가 1~LIMIT을 벗어난 경우
   *    2) 하차할 시트에 저장된 Person이 null인 경우 
   * @param seatNo 하차할 시트번호. 1~LIMIT 사이 값을 받는다.
   */
  public void getOff(int seatNo) {
    if(seatNo < 1 || seatNo > LIMIT) {
      System.out.println("존재하지 않는 시트번호입니다.");
      return;
    }
    Seat seat = seats.get(seatNo - 1);  // 하차할 시트
    Person person = seat.getPerson();   // 하차할 시트에 앉은 Person
    if(person == null) {  // 하차할 시트에 앉은 Person이 없다.
      System.out.println("해당 시트에 착석한 사람이 없습니다.");
      return;
    }
    seat.setPerson(null);  // 하차!
    System.out.println(seatNo + "번 시트에 앉은 " + person + " 하차했습니다.");
  }
  
  public void info() {
    for(int i = 0; i < LIMIT; i++) {
      System.out.print((i + 1) + "번 시트: ");
      Person person = seats.get(i).getPerson();  // 각 시트에 앉은 Person
      if(person != null) {
        System.out.println(person);
      } else {
        System.out.println("빈 시트");
      }
    }
  }
  
}
