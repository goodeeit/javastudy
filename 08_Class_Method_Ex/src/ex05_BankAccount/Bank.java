package ex05_BankAccount;

public class Bank {

  private String name;
  private String tel;
  
  public Bank(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }
  
  public void info() {
    System.out.println(name + "(" + tel + ")");
  }
  
}
