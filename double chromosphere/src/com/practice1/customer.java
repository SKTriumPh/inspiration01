package com.practice1;

import java.util.Scanner;

public class customer {
	int []s2arry =new int [7];
	
	public void buy(){
		Scanner sc =new Scanner(System.in);
		System.out.println("«Î—°∫≈");
		String s1=sc.next();
		String s1arry[] = s1.trim().split(",");
		for(int i=0;i<7;i++){
			s2arry[i] = Integer.parseInt(s1arry[i]);	
			//System.out.println(s2arry[i]);
		}
	}
}
