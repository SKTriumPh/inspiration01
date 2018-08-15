package com.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test3 {

	
		public static void main(String[] args) throws ParseException {
			// TODO Auto-generated method stub
			int sum=0;
			Scanner sc=new  Scanner(System.in);
			System.out.println("请输入年-月-日, 年-月-日 ");
			String s1=sc.next();
			String[]  sarry =s1.trim().split(",");
		    //int year=Integer.parseInt(s2arr[0]);
			//int month=Integer.parseInt(s2arr[1]);
			//int day=Integer.parseInt(s2arr[2]);
			
			//时间类型
			//求当天是今年的第几天
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");	
				Date d1=sf.parse(sarry[0].trim());	     
				Date d2=sf.parse(sarry[1].trim());
				long b=1000;
				long y =b*24*60*60*365;
				long m=b*24*60*60*30;
				long d =b*24*60*60;
				System.out.println((d1.getTime()-d2.getTime())/y);
				//当前距离1970年一月一日8时的毫秒数
				System.out.println((d1.getTime()-d2.getTime())%y/m);
				System.out.println((d1.getTime()-d2.getTime())%y%m/d);	
		}

}
