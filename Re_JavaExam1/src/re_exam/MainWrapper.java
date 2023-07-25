package re_exam;

public class MainWrapper {

	// 문제1. 절대값 구하기
	// int number에 저장된 절대값을 계산하여 int absNumber에 저장하고 출력하시오.
	// 예시)
	// -5의 절대값은 5입니다.
	public static void q1() {
		int number = -5;
		int absNumber;
		
	}
	
	// 문제2. 나이에 따른 구분하기
	// 0 ~ 7    : 미취학아동
	// 8 ~ 13   : 초등학생
	// 14 ~ 16  : 중학생
	// 17 ~ 19  : 고등학생
	// 20 ~ 100 : 성인
	// 이외값   : 잘못된 나이
	// 예시)
	// 30살은 성인입니다.
	public static void q2() {
		String strAge = "30";
		
	}
	
	// 문제3. 너비가 int width, 높이가 int height인 삼각형의 넓이를 계산하여 double area에 저장한 뒤 출력하시오.
	// 예시)
	// 너비가 3, 높이가 3인 삼각형의 넓이는 4.5입니다.
	public static void q3() {
		int width = 3;
		int height = 3;
		double area;
		
	}
	
	// 문제4. int month에 저장된 월의 계절과 해당 월이 며칠까지 있는지 출력하시오.
	// 항상 2월은 28일까지만 있는 것으로 처리하시오.(윤년은 고려하지 않는다는 의미이다.) 
	// 예시1)
	// 5월은 봄입니다.
	// 5월은 31일까지 있습니다.
	// 예시2)
	// 13월은 잘못된 정보입니다.
	public static void q4() {
		int month = 5;
		String[] season = {"겨울", "봄", "여름", "가을"};
		int[] lastDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
	}
	
	// 문제5. int a, b에 저장된 값 중에서 정수 10과 더 가까운 값을 출력하시오.
	// 예시)
	// 8, 11중 10과 가까운 수는 11입니다.
	public static void q5() {
		int a = 8;
		int b = 11;
		
	}
	
	// 문제6. int money를 오만원권, 만원권, 천원권, 오백원 동전, 백원 동전, 오십원 동전, 십원 동전, 오원 동전, 일원 동전이 각각 몇 개로 변환되는지 출력하시오.
	// 예시)
	// 75832원은 다음과 같습니다.
	// 50000원 짜리 : 1개
	// 10000원 짜리 : 2개
	// 5000원 짜리 : 1개
	// 500원 짜리 : 1개
	// 100원 짜리 : 3개
	// 10원 짜리 : 3개
	// 1원 짜리 : 2개
	public static void q6() {
		int money = 75832;
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] count = new int[unit.length];
		
	}
	
	// 문제7. int score에 해당하는 학점을 출력하시오. switch문을 활용하시오.
	// 100    : S
	//  99~97 : A+
	//  96~94 : A0
	//  93~90 : A-
	//  89~87 : B+
	//  86~84 : B0
	//  83~80 : B-
	//  79~77 : C+
	//  76~74 : C0
	//  73~70 : C-
	//  69~0  : F
	// 예시)
	// 점수 98점은 학점 A+입니다.
	public static void q7() {
		int score = 98;
		char grade, point;  // grade(A~F), point(+,0,-)
		
	}
	
	// 문제8. String height 정보를 이용해 워터파크에서 탑승이 가능한 모든 어트랙션을 출력하시오.
	//   1. 슬라이드 : 120 이상 탑승 가능
	//   2. 부메랑고 : 130 이상 탑승 가능
	//   3. 인피닛풀 : 140 이상 탑승 가능
	// 예시(키가 135.5인 경우)
	// 슬라이드 탑승 가능합니다.
	// 부메랑고 탑승 가능합니다.
	public static void q8() {
		String height = "135.5";
		
	}
	
	// 문제9. int second에 저장된 초를 시/분/초로 변환하여 출력하시오.
	// 1분이 넘는 경우 '분'까지 표시하고, 1시간이 넘는 경우 '시'까지 표시하시오.
	// 예시1)
	// 40초는 40초입니다.
	// 예시2)
	// 90초는 1분 30초입니다.
	// 예시3)
	// 3690초는 1시간 1분 30초입니다.
	public static void q9() {
		int second = 3690;
		
	}
	
	public static void main(String[] args) {
		System.out.println("=====문제1=====");
		q1();
		System.out.println("=====문제2=====");
		q2();
		System.out.println("=====문제3=====");
		q3();
		System.out.println("=====문제4=====");
		q4();
		System.out.println("=====문제5=====");
		q5();
		System.out.println("=====문제6=====");
		q6();
		System.out.println("=====문제7=====");
		q7();
		System.out.println("=====문제8=====");
		q8();
		System.out.println("=====문제9=====");
		q9();
	}

}