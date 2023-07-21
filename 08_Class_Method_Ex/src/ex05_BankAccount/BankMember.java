package ex05_BankAccount;

public class BankMember {

  private String name;
  private BankAccount acc;
  
  public BankMember(String name, BankAccount acc) {
    this.name = name;
    this.acc = acc;
  }
  
  public void info() {
    System.out.println("고객명: " + name);
    acc.info();
  }
  
}
