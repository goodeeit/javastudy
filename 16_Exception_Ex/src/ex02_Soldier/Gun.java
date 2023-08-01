package ex02_Soldier;

public class Gun {

  private int bullet;
  private final int MAX_BULLET = 50;
  
  public Gun(int bullet) {
    this.bullet = bullet > MAX_BULLET ? MAX_BULLET : bullet;
  }
  
  public void reload(int bullet) throws RuntimeException {
    if(this.bullet + bullet > MAX_BULLET) {
      throw new RuntimeException(bullet + "발은 장전이 불가능합니다.");
    }
    this.bullet += bullet;
    System.out.println(bullet + "발이 장전되었습니다. 현재 " + this.bullet + "발이 들어있습니다.");
  }
  
  public void shoot() throws RuntimeException {
    if(bullet == 0) {
      throw new RuntimeException("헛빵!");
    }
    bullet--;
    System.out.println("빵! 현재 " + bullet + "발이 남았습니다.");
  }
  
}