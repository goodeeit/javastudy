package ex02_Computer;

public class Notebook extends Computer {

  private int battery;
  
  // new Notebook("gram", 70)에 의해서 호출되는 생성자
  public Notebook(String model, int battery) {
    super(model);
    this.battery = battery;
  }
  
  public int getBattery() {
    return battery;
  }
  public void setBattery(int battery) {
    this.battery = battery;
  }
  
}
