package ex05_BankAccount;

public class BankAccount {

  private Bank bank;
  private String accNo;
  private long balance;
  
  public BankAccount(Bank bank, String accNo, long balance) {
    this.bank = bank;
    this.accNo = accNo;
    this.balance = balance;
  }
  
  public void info() {
    System.out.println("계좌번호: " + accNo + ", 통장잔액: " + balance + "원");
    System.out.print("개설지점: ");
    bank.info();
  }
  
}
