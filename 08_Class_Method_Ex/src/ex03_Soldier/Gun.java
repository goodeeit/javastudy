package ex03_Soldier;

public class Gun {

  private int bullet;
  private final int MAX_BULLET = 50;
  
  public Gun(int bullet) {
    this.bullet = bullet > MAX_BULLET ? MAX_BULLET : bullet;
  }
  
  public void reload(int bullet) {
    if(this.bullet + bullet > MAX_BULLET) {
      System.out.println(bullet + "발은 장전이 불가능합니다.");
      return;
    }
    this.bullet += bullet;
    System.out.println(bullet + "발이 장전되었습니다. 현재 " + this.bullet + "발이 들어있습니다.");
  }
  
  public void shoot() {
    if(bullet == 0) {
      System.out.println("헛빵!");
      return;
    }
    bullet--;
    System.out.println("빵! 현재 " + bullet + "발이 남았습니다.");
  }
  
}