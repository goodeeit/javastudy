package ex03_Soldier;

public class Soldier {

  private Gun gun;
  
  public Soldier(Gun gun) {
    this.gun = gun;
  }
  
  public Soldier(int bullet) {
    gun = new Gun(bullet);
  }
  
  public void reload(int bullet) {
    gun.reload(bullet);
  }
  
  public void shoot() {
    gun.shoot();
  }
  
}
