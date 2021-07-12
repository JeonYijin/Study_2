package com.ae1;

public class Test8 {
	
	public static void main(String[] args) {
		System.out.println("TEST8");
	
		//물건의 합계 price, 손님이 낸 돈 money, 거스름돈 don
		int price;
		int money;
		int don;
		
		//물건값의 합계보다 손님이 낸돈이 더 많다라는 가정
		
		//1. 물건값의 합계, 손님이 낸 돈, 거스름돈 각각 출력
		
		price = 17880;
		money = 60000;
		don = money - price;
		
		System.out.println("물건값의 합계는 "+ price);
		System.out.println("손님이 낸 돈은 "+ money);
		System.out.println("거스름돈은 "+ don);
		
		//만원짜리 개수를 담을 변수 man
		int man;
		//천원짜리 개수를 담을 변수 cheon
		int cheon;
		//백원짜리 개수를 담을 변수 back
		int back;
		//십원짜리 개수를 담을 변수 sip;
		int sip;
		
		//2.거스름돈으로 각각의 지폐와 동전을 몇 개 주어야 하는지 계산
		//만원 ?장 ,천원 ?장, 백원 ?개, 십원 ?개 출력하기
		
		man = don/10000;
		cheon = (don%10000)/1000;
		back = (don%1000)/100;
		sip = (don%100)/10;
		
		
		System.out.println("만원은 " +man+"장");
		System.out.println("천원은 " +cheon+"장");
		System.out.println("백원은 " +back+"개");
		System.out.println("십원은 " +sip+"개");
		
		
		
		
		
	}
}
