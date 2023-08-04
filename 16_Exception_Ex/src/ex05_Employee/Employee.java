package ex05_Employee;

// 사원 (직원 + 프리랜서)

public abstract class Employee {  // 추상 메소드 getPay()를 가졌기 때문에 추상 클래스로 작성함

	private String empNo; // 사원번호
	private String name;  // 사원명
	
	public Employee(String empNo, String name) {
		super();
		this.empNo = empNo;
		this.name = name;
	}

	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void info() {
		System.out.println("  [사원번호:" + empNo + "]");
		System.out.println("  [사원명:" + name + "]");
	}
	public abstract int getPay();  // 급여를 반환하는 추상 메소드. 직원/프리랜서에 따라 계산법이 다르기 때문에 추상 메소드로 작성한다.
	
}