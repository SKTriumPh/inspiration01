package com.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class test2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("请输入年份，天数");
		Scanner sc1 =new Scanner(System.in);
		//System.out.println("请输入年份");
		
		String s1 =sc1.next();
		String [] sarry=s1.trim().split(",");
		int days =Integer.parseInt(sarry[1]);
		int year =Integer.parseInt(sarry[0]);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
		Date d1=sf.parse(sarry[0]+"-1-1");
		Calendar c1 = Calendar.getInstance(); 
		c1.set(year,1, 1);
		int y=0;
		while(y<=days){
			  y = c1.get(Calendar.DAY_OF_YEAR);
		}
		System.out.println(d1);
		System.out.println("请输入今年的一月一日是星期几");
		Scanner sc2 =new Scanner(System.in);
		int z=sc2.nextInt();
		switch(z){
		case 1:System.out.println("今天是"+((days-6)/7/4+1)+"月");
		System.out.println(days%7);		
		}
	}
}
