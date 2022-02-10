package com.oop.employee.controller;

import com.oop.employee.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.printEmployee();
		
		Employee emp2 = new Employee();
		emp1.setEmpNo(1);
		emp1.setName("홍길동");
		emp1.setGender('남');
		emp1.setPhone("010-7777-7777");
		emp1.printEmployee();
		
//		Employee emp2 = new Employee(1, "홍길동", '남', "010-7777-7777");
//		emp2.printEmployee();
		
		Employee emp3 = new Employee();
		emp2.setEmpNo(2);
		emp2.setName("유관순");
		emp2.setGender('여');
		emp2.setPhone("010-3131-3131");
		emp2.setDept("영업부");
		emp2.setSalary(3000000);
		emp2.setBonusPct(0.15);
		emp2.printEmployee();
		
//		Employee emp2 = new Employee(2, "유관순", '여', "010-3131-3131",
//									"영업부", 3000000, 0.15);
//		emp2.printEmployee();
	}

}
