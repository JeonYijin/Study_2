package com.ae1;

import java.util.Scanner;

public class Tset10 {
	public static void main(String[] args) {
		System.out.println("Test10");
		//941223-1234567 주민등록번호
		// 1 -> 1 2 -> 2 4 ->10 7 -> 13 8 -> 20
		//프로그램 실행 중에 데이터를 키보드로부터 입력받을 준비
		Scanner sc = new Scanner(System.in);
		
		int num =8;
		int result = 0;
		
		System.out.println("숫자를 입력하세요. : ");
		num = sc.nextInt();
		
		
		result = num + 6*(num/4);
		//result = num/4*10+num%4;
		
		
		
		System.out.println(result);
		
		
		
		
	}

}
