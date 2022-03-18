package com.Test3;

public class StudentTest {

	public static void main(String[] args) {
		
		Student[] studentArray = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 170, 80);
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].studentInfo());
		}
		
		System.out.println();
		
		Student maxAge = studentArray[0];
		Student maxHeight = studentArray[0];
		Student maxWeight = studentArray[0];
		
		Student minAge = studentArray[0];
		Student minHeight = studentArray[0];
		Student minWeight = studentArray[0];

		double sumAge = 0;
		double sumHeight = 0;
		double sumWeight = 0;
		
		for(int i = 0; i < studentArray.length; i++) {
			
			// 나이가 가장 많은 학생 구하기
			if(maxAge.getAge() < studentArray[i].getAge())
				maxAge = studentArray[i];
			
			// 나이가 적은 많은 학생 구하기
			if(minAge.getAge() > studentArray[i].getAge())
				minAge = studentArray[i];
			
			// 신장이 가장 큰 학생 구하기
			if(maxHeight.getHeight() < studentArray[i].getHeight())
				maxHeight = studentArray[i];
			
			// 신장이 가장 작은 학생 구하기
			if(minHeight.getHeight() > studentArray[i].getHeight())
				minHeight = studentArray[i];

			// 몸무게가 가장 많이 나가는 학생 구하기
			if(maxWeight.getWeight() < studentArray[i].getWeight())
				maxWeight = studentArray[i];

			// 몸무게가 가장 적게 나가는 학생 구하기
			if(minWeight.getWeight() > studentArray[i].getWeight())
				minWeight = studentArray[i];
			
			sumAge += studentArray[i].getAge();
			sumHeight += studentArray[i].getHeight();
			sumWeight += studentArray[i].getWeight();
		}
		
		System.out.printf("나이 평균 : %.3f%n"
						+ "신장 평균 : %.3f%n"
						+ "몸무게 평균 : %.3f%n%n"
						+ "나이가 가장 많은 학생 : %s%n"
						+ "나이가 적은 많은 학생 : %s%n"
						+ "신장이 가장 큰 학생 : %s%n"
						+ "신장이 작은 큰 학생 : %s%n"
						+ "몸무게가 가장 많이 나가는 학생 : %s%n"
						+ "몸무게가 가장 적게 나가는 학생 : %s%n",
						sumAge / studentArray.length,
						sumHeight / studentArray.length,
						sumWeight / studentArray.length,
						maxAge.getName(), minAge.getName(),
						maxHeight.getName(), minHeight.getName(),
						maxWeight.getName(), minWeight.getName());
	}

}
