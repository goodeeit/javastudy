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
    
    
    Bank bank1 = new Bank();
    bank1.setName("우리은행");
    bank1.setTel("02-222-2222");
    
    BankAccount acc1 = new BankAccount();
    acc1.setBank(bank1);
    acc1.setAccNo("012-34-56789");
    acc1.setBalance(10000);
    
    BankMember member1 = new BankMember();
    member1.setName("상철");
    member1.setAcc(acc1);
    
    System.out.println("고객명: " + member1.getName());
    System.out.println("계좌번호: " + member1.getAcc().getAccNo());
    System.out.println("통장잔액: " + member1.getAcc().getBalance());
    System.out.println("개설지점: " + member1.getAcc().getBank().getName());
    System.out.println("지점연락처: " + member1.getAcc().getBank().getTel());
    
    
    Bank bank2 = new Bank();
    bank2.setName("농협");
    bank2.setTel("02-333-3333");
    
    BankAccount acc2 = new BankAccount();
    acc2.setBank(bank2);
    acc2.setAccNo("987-65-43210");
    acc2.setBalance(10000);
    
    BankMember member2 = new BankMember();
    member2.setName("영숙");
    member2.setAcc(acc2);
    
    System.out.println("고객명: " + member2.getName());
    System.out.println("계좌번호: " + member2.getAcc().getAccNo());
    System.out.println("통장잔액: " + member2.getAcc().getBalance());
    System.out.println("개설지점: " + member2.getAcc().getBank().getName());
    System.out.println("지점연락처: " + member2.getAcc().getBank().getTel());
    
    // 이체
    member1.transfer(member2, 10000);
    member1.info();
    member2.info();
    
  }

}
