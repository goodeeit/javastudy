package ex02_Coffee;

public class Americano implements Coffee {

  private String name;

  public Americano(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return "Americano [name=" + name + "]";
  }
  
}
