package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcDday {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputDay = "";
		int year;
		int month;
		int day;
		
		while(true) {
			System.out.printf("D-day 8자리를 입력하세요. 예) 20220219%n> ");
			inputDay = sc.next();
			
			if(inputDay.length() != 8) {
				System.out.printf("잘못 입력하셨습니다.%n다시 입력하시겠습니까? (y/n) > ");
				char yn = sc.next().toLowerCase().charAt(0);
				if(yn == 'n') {
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			}
			else if(inputDay.length() == 8) {
				year = Integer.parseInt(inputDay.substring(0, 4));
				month = Integer.parseInt(inputDay.substring(4, 6)) - 1;
				day = Integer.parseInt(inputDay.substring(6, 8));
				
				Calendar today = new GregorianCalendar();
				Calendar dday = new GregorianCalendar(year, month, day);
				
				long _today = today.getTimeInMillis();
				long _dday = dday.getTimeInMillis();
				
				double diff = ((double)(_dday - _today) / 1000 / 60 / 60 / 24);
				int count = (int)Math.ceil(diff);
				
				if(count == 0) {
					System.out.println("D-DAY입니다.");
					break;
				}
				else {
					System.out.println(Math.abs(count) + (count > 0 ? "일 남았습니다." : "일 지났습니다."));
					break;
				}
			}
		}
	}
	
}
