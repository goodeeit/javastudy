package ex05_Employee;

// 직원

public class Regular extends Employee {

	private int salary;  // 기본급

	public Regular(String empNo, String name) {
		super(empNo, name);
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void info() {
	  // [사원번호:0001]
	  // [사원명:김두한]
	  // [기본급:3000000원]
	  // [급여:2700000원]
	}
	@Override
	public int getPay() {
		return 0;  // 직원 급여는 기본급이다. 세금은 편의상 10%로 한다.
	}
	
}
