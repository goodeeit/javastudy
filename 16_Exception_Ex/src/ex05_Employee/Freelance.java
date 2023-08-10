package ex05_Employee;

// 프리랜서

public class Freelance extends Employee {

	private int hourlyWage;    // 시간당 임금
	private int workingHours;  // 근무한 시간
	
	public Freelance(String empNo, String name) {
		super(empNo, name);
	}

	public int getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
  @Override
  public void info() {
    super.info();  // Employee의 info 메소드 호출
    System.out.println("  [시간당 임금:" + hourlyWage + "원]");
    System.out.println("  [근무한 시간:" + workingHours + "시간]");
    System.out.println("  [급여:" + getPay() + "원]");
  }
  @Override
  public int getPay() {
    return (int)(hourlyWage * workingHours * 0.97);  // 프리랜서 급여는 시간당 임금 * 근무한 시간으로 계산한다. 세금은 편의상 3%로 한다.
  }
	
}
