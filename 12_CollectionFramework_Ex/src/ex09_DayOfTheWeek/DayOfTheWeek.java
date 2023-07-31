package ex09_DayOfTheWeek;

import java.util.Arrays;
import java.util.List;

// 지시사항)
//   1. AD 1년 1월 1일은 월요일이다.
//   2. 평년은 1년이 365일이다.(2월 28일까지 있다.)
//   3. 윤년은 1년이 366일이다.(2월 29일까지 있다.)
//   4. 윤년이란?
//      1) 4로 나눠 나머지가 0인 년도는 윤년이다.
//      2) 이 중 100으로 나눠 나머지가 0인 년도는 평년이다.
//      3) 이 중 400으로 나눠 나머지가 0인 년도는 윤년이다.
// 힌트)
//   1년 1월 1일부터 입력한 날짜까지 며칠이 지났는지 계산한다.
//   계산된 일수와 요일의 관계는 다음과 같다.
//     일 : 계산된 일수를 7로 나눈 나머지가 0이다.
//     월 : 계산된 일수를 7로 나눈 나머지가 1이다.
//     화 : 계산된 일수를 7로 나눈 나머지가 2이다.
//     수 : 계산된 일수를 7로 나눈 나머지가 3이다.
//     목 : 계산된 일수를 7로 나눈 나머지가 4이다.
//     금 : 계산된 일수를 7로 나눈 나머지가 5이다.
//     토 : 계산된 일수를 7로 나눈 나머지가 6이다.

public class DayOfTheWeek {

  private int year;             // 2023
  private int month;            // 7
  private int day;              // 28
  private String dayOfTheWeek;  // 금요일
  private List<Integer> lastDay = Arrays.asList(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30);
  private List<String> week = Arrays.asList("일", "월", "화", "수", "목", "금", "토");
  
  // new DayOfTheWeek(2023, 7, 28);
  public DayOfTheWeek(int year, int month, int day) {
    
    this.year = year;
    this.month = month;
    this.day = day;
    
    // dayOfTheWeek 계산 코드 작성
    int totalDay = 0;  // AD 1년 1월 1일 이후로 며칠이 지났는지 저장한 변수
    
    // year를 이용해 totalDay 누적 (작년까지 며칠이 지났는지 계산)
    for(int y = 1; y < year; y++) {
      totalDay += 365;
      if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
        totalDay++;
      }
    }
    
    // month를 이용해 totalDay 누적(리스트 lastDay 활용) (지난달까지 며칠이 지났는지 계산)
    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      lastDay.set(2, 29);
    }
    for(int i = 1; i < month; i++) {
      totalDay += lastDay.get(i);
    }
    
    // day를 이용해 totalDay 누적 (이번 달 며칠이 지났는지 계산)
    totalDay += day;
    
    // dayOfTheWeek 계산(totalDay + 리스트 week 활용)
    dayOfTheWeek = week.get(totalDay % 7);
    
  }
  
  // toString()
  @Override
  public String toString() {
    return year + "년 " + String.format("%02d", month) + "월 " + String.format("%02d", day) + "일은 " + dayOfTheWeek + "요일입니다.";
  }
  
}