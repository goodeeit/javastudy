package ex04_Chair;

public class Person {

  private String name;
  
  public Person() {
    
  }
  public Person(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public void info() {
    System.out.println("이름: " + name);
  }
  
}