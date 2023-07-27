package ex02_Coffee;

public class CafeLatte implements Coffee {

  private String name;

  public CafeLatte(String name) {
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
    return "CafeLatte [name=" + name + "]";
  }
  
}
