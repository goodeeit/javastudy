package ex06_BinaryNumber;

import java.util.List;

public class BinaryNumber {

  /* 10진수 */ private int number;
  /*  2진수 */ private List<Integer> binary;
  
  // new BinaryNumber(32) 2진수: 100000
  public BinaryNumber(int number) {
    this.number = number;
    // 32 % 2 == 0 -> binary.get(0)
    // 16 % 2 == 0 -> binary.get(1)
    //  8 % 2 == 0 -> binary.get(2)
    //  4 % 2 == 0 -> binary.get(3)
    //  2 % 2 == 0 -> binary.get(4)
    //  1 % 2 == 1 -> binary.get(5)
    //  0 % 2 == 불가능하므로 여기서 종료
    
  }
  
  // BinaryNumber bn = new BinaryNumber(32);
  // System.out.println(bn);  // 100000
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
  
}
