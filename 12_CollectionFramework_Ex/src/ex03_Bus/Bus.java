package ex03_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {

  private List<Seat> seats;      // List<Seat> seats 선언
  private final int LIMIT = 25;  // 25인승
  
  /**
   * new Bus()가 실행되면<br>
   * List<Seat> seats에 LIMIT만큼의 빈 좌석(new Seat())을 저장한다.<br>
   */
  public Bus() {
    // List<Seat> seats 생성
    seats = new ArrayList<Seat>();
    // LIMIT만큼 빈 좌석(new Seat()) 생성
    for(int cnt = 0; cnt < LIMIT; cnt++) {  // LIMIT만큼 반복하는 for문
      seats.add(new Seat());      
    }
  }
  
  /**
   * 탑승 메소드<br>
   * 1. 탑승할 좌석번호와 탑승할 Person 객체를 받아온다.<br>
   * 2. List<Seat> seats에서 탑승할 좌석번호의 좌석(Seat)를 가져온다.<br>
   * 3. 가져온 좌석(Seat)에 탑승할 Person 객체를 저장한다.<br>
   * 4. 예외상황
   *    1) 탑승할 좌석번호가 1~LIMIT을 벗어난 좌석번호인 경우
   *    2) 탑승할 좌석에 이미 Person 객체가 저장된 경우 
   * @param person 탑승할 사람. new Person("이름") 또는 new Student("이름")을 받는다.
   */
  public void getOn(int seatNo, Person person) {
    if(seatNo < 1 || seatNo > LIMIT) {
      System.out.println("존재하지 않는 좌석번호입니다.");
      return;
    }
    if(seats.get(seatNo - 1).getPerson() != null) {
      System.out.println("이미 점유된 좌석번호입니다.");
      return;
    }
    seats.get(seatNo - 1).setPerson(person);
    System.out.println(seatNo + "번 좌석에 " + person + " 탑승했습니다.");
  }
  
  
  public void getOff(int seatNo) {
    if(seatNo < 1 || seatNo > LIMIT) {
      System.out.println("존재하지 않는 좌석번호입니다.");
      return;
    }
    if(seats.get(seatNo - 1).getPerson() == null) {
      System.out.println("해당 좌석에 착석한 사람이 없습니다.");
      return;
    }
    System.out.println(seatNo + "번 좌석에 앉은 " + seats.get(seatNo - 1).getPerson() + " 하차했습니다.");
    seats.get(seatNo - 1).setPerson(null);
  }
  
  
  public void info() {
    for(int i = 0; i < LIMIT; i++) {
      System.out.print((i + 1) + "번 좌석: ");
      if(seats.get(i).getPerson() != null) {
        System.out.println(seats.get(i).getPerson());
      } else {
        System.out.println("빈 좌석");
      }
    }
  }
  
}
