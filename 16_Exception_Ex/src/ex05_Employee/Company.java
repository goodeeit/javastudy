package ex05_Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

	private List<Employee> employees = new ArrayList<Employee>();
	private Scanner sc = new Scanner(System.in);
	
	public Company() {

	}
	
	public void addEmployee() {
		System.out.println("===== 고용 =====");
		
	}
	
	public void dropEmployee() {
		System.out.println("===== 해고 =====");
		
	}
	
	public void findEmployee() {
		System.out.println("===== 조회 =====");
		
	}
	
	public void printAllEmployee() {
		System.out.println("===== 전체조회 =====");
		
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
