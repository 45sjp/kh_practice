package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {

	public static void main(String[] args) {
		EmpTest et = new EmpTest();
		et.mainMenu();
	}
	
	public void mainMenu() {
		Employee employee = new	Employee();
		Scanner sc = new Scanner(System.in);
		
		String menu = "********** 사원 정보 관리 프로그램 **********\n"
				+ "1. 새 사원 정보 입력\n"
				+ "2. 사원 정보 수정\n"
				+ "3. 사원 정보 삭제\n"
				+ "4. 사원 정보 출력\n"
				+ "9. 끝내기\n"
				+ "****************************************\n"
				+ "입력 : ";
		
		int choice = 0;
		
		do {
			
			System.out.print(menu);
			choice = sc.nextInt();
			
			re:
			switch(choice) {
			case 1: employee.empInput(); break;
			case 2: modifyMenu(employee); break;
			case 3: employee = null; break;
			case 4: 
				if(employee == null) {
					System.out.println("입력된 사원정보가 없습니다.");
					break re;
				}
				else {
					employee.empOutput();
				}
				break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.println();
			
			System.out.print("계속 진행하시겠습니까?(y/n) : ");
			char yn = sc.next().toLowerCase().charAt(0);
			if(yn == 'n') {
				System.out.println("프로그램을 종료합니다.");
				break;
			}	
			
			System.out.println();
			
		} while(true);
	}
	
	public void modifyMenu(Employee e) {
		Scanner sc = new Scanner(System.in);
		
		String menu = "********** 사원 정보 수정 메뉴 **********\n"
				+ "1. 이름 변경\n"
				+ "2. 급여 변경\n"
				+ "3. 부서 변경\n"
				+ "4. 직급 변경\n"
				+ "5. 이전 메뉴로 이동\n"
				+ "****************************************\n"
				+ "입력 : ";
		
		int choice = 0;
		
		do {
			System.out.print(menu);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("이름 변경 : ");
				e.setEmpName(sc.next());
				break;
			case 2:
				System.out.print("급여 변경 : ");
				e.setSalary(sc.nextInt());
				break;
			case 3:
				sc.nextLine();
				System.out.print("부서 변경 : ");
				e.setDept(sc.nextLine());
				break;
			case 4:
				sc.nextLine();
				System.out.print("직급 변경 : ");
				e.setJob(sc.nextLine());
				break;
			case 5:
				System.out.println("이전 메뉴로 이동합니다.");
				return;
			}
			
		} while(true);
	}
	
}
