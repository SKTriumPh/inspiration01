package com.practice1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer o3=new customer();
		judge o4=new judge();
		random o5=new random();
		System.out.println("欢迎购买双色球");
		System.out.println("请付款，一注两元");
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		money money =new money();
		money.pay(p);
		int flag=1;
		if(money.extra>=0){
			System.out.println("购买成功，总额"+money.m+"余额"+money.extra);
		}else{
			System.out.println("余额不足");
			flag=0;
		}
		if(flag==1){
			o4.prize();
		}
		
		
		
	}
}
