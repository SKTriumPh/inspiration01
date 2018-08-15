package com.practice;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入日期");
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		String[] sarry = s.trim().split(",");
		int year =Integer.parseInt(sarry[0]);
		int sum=0;
		int month =Integer.parseInt(sarry[1]);
		int data =Integer.parseInt(sarry[2]);
		int now =2018;
        Calendar c1 = Calendar.getInstance(); 
        Calendar c2 = Calendar.getInstance();
        Calendar c3 = Calendar.getInstance();
        c1.set(year, month, data); 
        c2.set(2018,05,13);
       // c2.setTime(new Date());
        int y = c1.get(Calendar.DAY_OF_YEAR);
        int n =c2.get(Calendar.DAY_OF_YEAR);
        //System.out.println(y+"天");
        //System.out.println(n+"天");
        for(int y1=year+1;y1<now;y1++){
        	c3.set(y1, 12, 31);
        	sum=sum+c3.get(Calendar.DAY_OF_YEAR);        	
        }
        System.out.println(sum+y+n+"天");
        if(month>=5&&year>=13){
        	System.out.println(now-year+"岁");
        }else {
        	System.out.println(now-year-1+"岁");
        }
        
	}

}
