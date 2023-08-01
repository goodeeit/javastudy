package ex02_Soldier;

public class Soldier {

  private Gun gun;
  
  public Soldier(Gun gun) {
    this.gun = gun;
  }
  
  public Soldier(int bullet) {
    gun = new Gun(bullet);
  }
  
  public void reload(int bullet) throws RuntimeException {
    gun.reload(bullet);
  }
  
  public void shoot() throws RuntimeException {
    gun.shoot();
  }
  
}
