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
    super.info();  // Employee의 info 메소드 호출
    System.out.println("  [기본급:" + salary + "원]");
    System.out.println("  [급여:" + getPay() + "원]");
  }
  @Override
  public int getPay() {
    return (int)(salary * 0.9);  // 직원은 salary가 급여이다. 세금은 편의상 10%로 한다.
  }
	
}
