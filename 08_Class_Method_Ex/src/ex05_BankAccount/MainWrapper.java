package ex05_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {

    Bank bank = new Bank("국민은행가산지점", "02-111-1111");
    bank.info();  // 국민은행가산지점(02-111-1111)

    BankAccount acc = new BankAccount(bank, "012-34-56789", 50000);
    acc.info();  // 계좌번호: 012-34-56789, 통장잔액: 50000원
                 // 개설지점: 국민은행가산지점(02-111-1111)
    
    BankMember member = new BankMember("홍길동", acc);
    member.info();  // 고객명: 홍길동
                    // 계좌번호: 012-34-56789, 통장잔액: 50000원
                    // 개설지점: 국민은행가산지점(02-111-1111)
    
  }

}
