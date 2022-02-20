package com.api.math;

import java.text.DecimalFormat;

/*
 * Math클래스의 올림, 반올림, 버림 메소드를 학습 후 풀어보세요.
 */
public class MathTest {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		String result = "";
		
		// 1. 3456.5324     => 올림해서 소수점 첫째자리까지 표현
		df = new DecimalFormat("0.0");
		double a = 3456.5324;
		result = df.format(Math.ceil(a * 10) / 10);
		System.out.println(a + " -> " + result);
		
		// 2. 577.26784     => 반올림해서 소수점 둘째자리까지 표현
		df = new DecimalFormat("0.00");
		double b = 577.26784;
		result = df.format(Math.round(b * 100) / 100);
		System.out.println(b + " -> " + result);
		
		// 3. 552.2987      => 올림해서 소수점 셋째자리까지 표현
		df = new DecimalFormat("0.000");
		double c = 552.2987;
		result = df.format(Math.ceil(c * 1000) / 1000);
		System.out.println(c + " -> " + result);
		
		// 4. -845.215      => 내림해서 소수점 첫째자리까지 표현
		df = new DecimalFormat("0.0");
		double d = -845.215;
		result = df.format(Math.floor(d * 10) / 10);
		System.out.println(d + " -> " + result);
		
		// 5. 324456.24497  => 올림해서 소수점 둘째자리까지 표현
		df = new DecimalFormat("0.00");
		double e = 324456.24497;
		result = df.format(Math.ceil(e * 100) / 100);
		System.out.println(e + " -> " + result);
	}

}
