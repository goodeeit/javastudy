package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    BankAccount acc = new BankAccount(10000, "1234");
    acc.deposit(-1);

  }

}
