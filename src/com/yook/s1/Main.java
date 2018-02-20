package com.yook.s1;

public class Main {
	/*
	메서드명 start
	return x
	내용
	1. 학생등록 2. 성적입력 3. 성적조회 4. 전체조회 5. 프로그램 종료
	*/
	
	public static void main(String[] args) {
		SchoolController schoolcontroller = new SchoolController();
		schoolcontroller.start();
		System.out.println("program start");
	}

}
