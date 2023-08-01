package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    // deposit, withdrawal, transfer 메소드에서 던진 RuntimeException을
    // 여기서 처리한다.
    
    try {
      BankAccount acc = new BankAccount(10000, "1234");
      BankAccount acc2 = new BankAccount(10000, "5678");
      acc.deposit(10000);
      acc2.withdrawal(5000);
      acc.transfer(acc2, 1);
      acc.inquiry();
      acc2.inquiry();
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
    
  }

}
