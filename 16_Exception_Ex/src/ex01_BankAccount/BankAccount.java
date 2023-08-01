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
   * @throws RuntimeException 입금할 금액이 0보다 작거나 같은 경우에 발생한다.
   */
  public void deposit(long money) throws RuntimeException {
    if(money <= 0) {
      throw new RuntimeException(money + "원 입금 불가");
    }
    balance += money;
  }
  
  /**
   * 출금 메소드<br>
   * 파라미터가 0보다 작거나 같으면 출금된 금액이 없으므로 0을 반환한다.<br>
   * 파라미터가 통장잔액(balance)보다 크면 출금된 금액이 없으므로 0을 반환한다.
   * @param money 출금할 금액
   * @return 실제로 출금된 금액
   * @throws RuntimeException 출금할 금액이 0 이하이거나 잔액보다 큰 경우에 발생한다.
   */
  public long withdrawal(long money) throws RuntimeException {
    long retVal = 0;
    if(money <= 0) {
      throw new RuntimeException(money + "원 출금 불가");
    } else if(money > balance) {
      throw new RuntimeException("잔액 부족");
    } else {
      balance -= money;
      retVal = money;
    }
    return retVal;
  }
  
  /**
   * 이체 메소드<br>
   * 다른 계좌로 이체하는 메소드로 기존의 입금 메소드와 출금 메소드를 활용한다.<br>
   * 내 계좌에서 출금을 먼저 수행하고, 출금된 금액만큼 다른 계좌로 입금한다.
   * @param acc 다른 계좌
   * @param money 이체할 금액
   * @throws RuntimeException 입금 메소드와 출금 메소드가 던진 예외를 다시 던진다.
   */
  public void transfer(BankAccount acc, long money) throws RuntimeException {
     acc.deposit(withdrawal(money));
  }
  
}