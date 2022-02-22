package com.io.employee.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.io.employee.model.vo.Employee;

/*
 * 실습문제 3
 */
public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeTest et = new EmployeeTest();
		et.saveEmployee();
		et.loadEmployee();
	}
	
	/*
	 * 3개의 Employee 객체생성 후 ObjectOutputStream을 통해서 empoloyee.dat에 쓰기
	 */
	public void saveEmployee() {
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee(1, "김기획", '남', "01011112222", "기획부", 2_800_000, 0.12);
		empArr[1] = new Employee(2, "이영업", '여', "01012122121", "영업부", 3_000_000, 0.15);
		empArr[2] = new Employee(3, "박홍보", '남', "01022221111", "홍보부", 3_000_000, 0.20);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"));) {
			for(int i = 0; i < empArr.length; i++) {
				oos.writeObject(empArr[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * employee.dat 파일의 내용을 ObjectInputStream을 이용해서 읽어와
	 * Employee 객체에 저장하고 화면 출력 확인하기
	 */
	public void loadEmployee() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"));) {
			for(int i = 0; i < 3; i++) {
				Employee emp = (Employee)ois.readObject();
				emp.printEmployee();
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
	
}
