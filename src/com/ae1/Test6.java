package com.ae1;

public class Test6 {
	
	public static void main(String[] args) {
		System.out.println("TEST6");
		
		int num = 5;
		double num2 =3.12;
		num = (int)(num + num2); 
		//또는 (int)(num2)로 미리 int로 변환해서 계산
		System.out.println("Num: "+num);
		
		//국영수 - 0~100 int
		int kor = 63;
		int eng = 35;
		int math = 53;
		
		//총점을 구하시오.
		
		int total = kor+eng+math;
		
		System.out.println("총점은: " + total);
		
		//double avg = total/3 ;
		// 나누기를 하면 몫만 구하기 때문에 뒤에 소수점은 0으로 표시
		// total 값은 정수형이기 때문에 미리 바꾸어야 double로 계산 됨. 
		double avg = (double)(total)/3; //둘 중 하나만 double이면 됨
		//3.0으로 바꾸는 방법
		
		System.out.println("평균은: " + avg);
		
		double num3 = 5.124; //int화 하면 .이후는 다 버림
		int result = (int)num3;
		System.out.println(result);
		
		
		
	}

}
