package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    BankAccount acc = new BankAccount(10000, "1234");
    long money = acc.withdrawal(5000);
    System.out.println("출금액 " + money);
    
  }

}
