package ex06_BinaryNumber;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumber {

  /* 10진수 */ @SuppressWarnings("unused") private int number;
  /*  2진수 */ private List<Integer> binary;
  
  // new BinaryNumber(32) 2진수: 100000
  public BinaryNumber(int number) {
    // 32 % 2 == 0 -> binary.get(0)
    // 16 % 2 == 0 -> binary.get(1)
    //  8 % 2 == 0 -> binary.get(2)
    //  4 % 2 == 0 -> binary.get(3)
    //  2 % 2 == 0 -> binary.get(4)
    //  1 % 2 == 1 -> binary.get(5)
    //  0 % 2 == 불가능하므로 여기서 종료
    this.number = number;
    binary = new ArrayList<Integer>();
    if(number == 0) {
      binary.add(0);
    } else {
      while(number > 0) {
        binary.add(number % 2);
        number /= 2;
      }
    }
  }
  
  // BinaryNumber bn = new BinaryNumber(32);
  // System.out.println(bn);  // 100000
  @Override
  public String toString() {
    String result = "";
    for(int i = binary.size() - 1; i >= 0; i--) {
      result += binary.get(i);
    }
    return result;
  }
  
}