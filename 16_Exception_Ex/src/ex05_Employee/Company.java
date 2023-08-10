package ex05_Employee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Company {

	private List<Employee> employees = new ArrayList<Employee>();
	private Scanner sc = new Scanner(System.in);
	
	public Company() {
		
	}
	
	public void addEmployee() throws InputMismatchException, RuntimeException {
		System.out.println("===== 고용 =====");
		System.out.print("고용 형태 선택(1.정규 2.프리랜서) >>> ");
		String kind = sc.next();
		String empNo = null;
		String name = null;
		switch(kind) {
		case "1":
			System.out.print("사원번호 입력 >>> ");
			empNo = sc.next();
			System.out.print("사원명 입력 >>> ");
			name = sc.next();
			System.out.print("기본급 입력 >>> ");
			int salary = sc.nextInt();
			Regular regular = new Regular(empNo, name);
			regular.setSalary(salary);
			employees.add(regular);
			break;
		case "2":
			System.out.print("사원번호 입력 >>> ");
			empNo = sc.next();
			System.out.print("사원명 입력 >>> ");
			name = sc.next();
			System.out.print("시간당 임금 입력 >>> ");
			int hourlyWage = sc.nextInt();		
			System.out.print("근무한 시간 입력 >>> ");
			int workingHours = sc.nextInt();
			Freelance freelance = new Freelance(empNo, name);
			freelance.setHourlyWage(hourlyWage);
			freelance.setWorkingHours(workingHours);
			employees.add(freelance);
			break;
		default: 
			throw new RuntimeException("잘못된 고용 형태입니다. 다시 시도하세요.");
		}
		System.out.println("사원 등록이 완료되었습니다. 현재 등록된 사원은 " + employees.size() + "명입니다.");
	}
	
	public void dropEmployee() throws RuntimeException {
		System.out.println("===== 해고 =====");
		if(employees.isEmpty()) {
			throw new RuntimeException("등록된 사원이 없습니다.");
		}
		System.out.print("삭제할 사원번호 입력 >>> ");
		String empNo = sc.next();
		for(int i = 0, size = employees.size(); i < size; i++) {
			if(empNo.equals(employees.get(i).getEmpNo())) {
				Employee emp = employees.remove(i);
				System.out.println("다음 사원이 삭제되었습니다.");
				emp.info();
				return;
			}
		}
		System.out.println("사원번호 " + empNo + "인 사원은 존재하지 않습니다.");
	}
	
	public void findEmployee() throws RuntimeException {
		System.out.println("===== 조회 =====");
		if(employees.isEmpty()) {
			throw new RuntimeException("등록된 사원이 없습니다.");
		}
		System.out.print("조회할 사원번호 입력 >>> ");
		String empNo = sc.next();
		for(int i = 0, size = employees.size(); i < size; i++) {
			if(empNo.equals(employees.get(i).getEmpNo())) {
				System.out.println("사원 조회 성공!");
				employees.get(i).info();
				return;
			}
		}
		System.out.println("사원번호 " + empNo + "인 사원은 존재하지 않습니다.");
	}
	
	public void printAllEmployee() throws RuntimeException {
		System.out.println("===== 전체조회 =====");
		if(employees.isEmpty()) {
			throw new RuntimeException("등록된 사원이 없습니다.");
		}
		int totalPay = 0;  // 전체 사원의 급여 합계
		int empCount = employees.size();
		System.out.println("전체 사원(" + empCount + "명)");
		System.out.println("------------------");
		for(int i = 0; i < empCount; i++) {
			Employee emp = employees.get(i);
			emp.info();
			System.out.println("------------------");
			if(emp instanceof Regular) {
				totalPay += ((Regular) emp).getSalary();
			} else if(emp instanceof Freelance) {
				totalPay += ((Freelance) emp).getHourlyWage() * ((Freelance) emp).getWorkingHours();
			}
		}
		System.out.println("  [사원 전체 급여:" + totalPay + "원]");
	}
	
	public void manage() {
		System.out.println("===== 사원관리프로그램 시작 =====");
		while(true) {
			try {
				System.out.print("\n1.고용 2.해고 3.조회 4.전체조회 0.종료 >>> ");
				String choice = sc.next();
				switch(choice) {
				case "1": addEmployee(); break;
				case "2": dropEmployee(); break;
				case "3": findEmployee(); break;
				case "4": printAllEmployee(); break;
				case "0": System.out.println("===== 사원관리프로그램 종료 ====="); return;
				default: throw new RuntimeException("잘못된 요청입니다. 다시 시도하세요.");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}
