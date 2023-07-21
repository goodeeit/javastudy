package ex05_BankAccount;

public class BankMember {

  private String name;
  private BankAccount acc;
  
  public BankMember() {
    
  }
  public BankMember(String name, BankAccount acc) {
    this.name = name;
    this.acc = acc;
  }
  
  // Setter
  public void setName(String name) {
    this.name = name;
  }
  public void setAcc(BankAccount acc) {
    this.acc = acc;
  }
  
  // Getter
  public String getName() {
    return name;
  }
  public BankAccount getAcc() {
    return acc;
  }
  
  public void info() {
    System.out.println("고객명: " + name);
    acc.info();
  }
  
  public void deposit(long money) {
    acc.deposit(money);
  }
  
  public long withdrawal(long money) {
    return acc.withdrawal(money);
  }
  
  public void transfer(BankMember member, long money) {
    member.deposit(withdrawal(money));
  }
  
}
