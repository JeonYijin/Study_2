package com.ae1;

public class Test5 {
	
	public static void main(String[] args) {
		System.out.println("TEst5");
		/*int num = 5; //변수명은 메모리주소를 대신함
		
		num = num+1;
		//int num = 3;
		
		char ch = 'a';
		
		long num1 = 3L;
		int num2 = 5;
		*/
		
		int num1 = 3;
		long num2 = 9L;
		System.out.println(num1);
		num1 = (int)num2;
		System.out.println(num1);
		
		num1 =3;
		//num2 = (long)num1;
		num2 =num1;
		System.out.println(num2);
		
		
		char ch = 'a';
		int num3 = ch;
		System.out.println(num3);
		
		ch = (char)(num3+1);
		System.out.println(ch);
		
		long num4 = 10L;
		float f1 = num4;
		
	}

}
