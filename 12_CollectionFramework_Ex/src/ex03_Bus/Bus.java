package ex03_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {

  private List<Seat> seats;
  private final int LIMIT = 25;  // 25인승
  
  public Bus() {
    seats = new ArrayList<Seat>();
    for(int cnt = 0; cnt < LIMIT; cnt++) {
      seats.add(new Seat());
    }
  }
  
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
  
  
  
  
  
  
  
  
  
  
  
  
}
