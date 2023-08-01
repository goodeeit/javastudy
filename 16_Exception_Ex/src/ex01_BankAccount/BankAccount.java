package ex01_BankAccount;

public class BankAccount {

  private long balance;
  private String accNo;
  
  // new BankAccount(10000, "1234")
  public BankAccount(long balance, String accNo) {
    super();
    this.balance = balance;
    this.accNo = accNo;
  }
  
  /**
   * 조회 메소드<br>
   * 계좌번호와 통장잔액을 조회하는 메소드
   */
  public void inquiry() {
    System.out.println("계좌번호: " + accNo);
    System.out.println("통장잔액: " + balance + "원");
  }
  
  
  /**
   * 입금 메소드<br>
   * 파라미터가 0보다 작거나 같으면 동작하지 않는다.
   * @param money 입금할 금액
   * @exception RuntimeException 입금할 금액이 0보다 작거나 같은 경우에 발생한다.
   */
  public void deposit(long money) {
    try {
      if(money <= 0) {
        throw new RuntimeException(money + "원 입금 불가");
      }
      balance += money;
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
