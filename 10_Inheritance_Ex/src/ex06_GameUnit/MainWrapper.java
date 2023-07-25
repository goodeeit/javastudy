package ex06_GameUnit;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 게임 유닛 생성
    GameUnit unit1 = new Marine("마린");
    GameUnit unit2 = new Firebat("파이어뱃");
    
    // 초기 에너지 설정
    unit1.setHp(100);
    unit2.setHp(50);
    
    // 공격 순서를 결정하는 flag
    boolean myTurn = true;
    
    // 게임 유닛이 모두 살아있으면 계속해서 공격
    while(unit1.isAlive() && unit2.isAlive()) {
      
      // 공격 순서에 따라 공격을 진행
      if(myTurn) {
        unit1.attack(unit2);
      } else {
        unit2.attack(unit1);
      }
      
      // 공격 순서 변경
      myTurn = !myTurn;
      
    }
    
    System.out.println("=== 게임 종료 ===");
    
    // 승리한 게임 유닛 확인
    if(unit1.isAlive()) {
      System.out.println(unit1.getName() + "의 승리! 현재 HP = " + unit1.getHp());
    } else {
      System.out.println(unit2.getName() + "의 승리! 현재 HP = " + unit2.getHp());
    }

  }

}
