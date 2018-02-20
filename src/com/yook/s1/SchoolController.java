package com.yook.s1;

import java.util.Scanner;

public class SchoolController {
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 학생등록 2. 성적입력 3. 성적조회 4. 전체조회 5. 프로그램 종료");
		int select = sc.nextInt();
		boolean check=true;
		
		if(select==1) {
			System.out.println("학생등록코드");
		} else if(select==2) {
			System.out.println("성적입력코드");
		} else if(select==3) {
			System.out.println("성적조회코드");
		} else if(select==4) {
			System.out.println("전체조회코드");
		} else if(select==5) {
			System.out.println("프로그램 종료");
			check=!check;
		} else {
			System.out.println("잘못누르셨습니다.");
		}
	}

}
