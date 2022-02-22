package com.io.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
//		t1.fileSave();
		t1.fileRead();
	}
	
	/*
	 * 실습문제 1
	 */
	public void fileSave() {
		String inputFileName = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = null;
		
		try {
			System.out.println("사용할 파일명을 입력하시오.");
			inputFileName = br.readLine();
			System.out.println("지정한 파일명 : " + inputFileName);
			
			String inputdata = null;
			bw = new BufferedWriter(new FileWriter(inputFileName));
			System.out.println("파일에 저장할 내용을 입력하시오.");

			while((inputdata = br.readLine()) != null) {
				if("exit".equals(inputdata)) break;
				bw.write(inputdata);
				bw.flush();
			}
			System.out.println("파일이 성공적으로 저장되었습니다.");
				
		} catch(IOException e) {
			e.getStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * 실습문제 2
	 */
	public void fileRead() {
		String inputFileName = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileReader fr = null;
		
		try {
			System.out.println("불러올 파일명을 입력하시오.");
			inputFileName = br.readLine();
			System.out.println("지정한 파일명 : " + inputFileName);
			
			fr = new FileReader(inputFileName);
			int data = 0;
			while((data = fr.read()) != -1) {
				StringBuilder sb = new StringBuilder();
				sb.append((char)data);
				String result = sb.toString();
				System.out.print(result);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
}
