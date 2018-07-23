package com.utils;

import java.util.Scanner;
//在控制台获取数字选项
public class consoleutil {
 public static int getnum(int low,int high){
	while(true){
		Scanner sc=new Scanner(System.in);
		//System.out.println("请选择");
		try {
			int num =sc.nextInt();
			if (num<low||num >high){
				System.out.println("超出选项范围，请重新选择");
				
			}else{
				return num;
			}
		} catch (Exception e) {
			System.out.println("非法字符，请重新选择");
		}	
	} 	 
 }
 
 public static int getid(){
			Scanner sc=new Scanner(System.in);
			int id =sc.nextInt();
			return id;
				
		 	 
	 }
 //在控制台得到合法字符串---用户名和密码；
 	public static String getString(){
 		while(true){
 			Scanner sc =new Scanner(System.in);
 			String str=sc.nextLine();
 			if(str!=null&&str.trim()!=null){
 				return str;
 			}else{
 				System.out.println("非法字符，请重新输入");
 			}
 			
 		}
 	}
 	
 	public static String getemail(){
 		while(true){
 			Scanner sc =new Scanner(System.in);
 			String email =sc.nextLine();
 			//1.必须有@，且只有一个
 			//2.@必须在.前面
 			//3.@不能开头或结尾
 			if(email.indexOf("@")==-1||email.indexOf(".")==-1){
 				System.out.println("@--.");
 			}else if(email.indexOf("@")!=email.lastIndexOf("@")||email.indexOf(".")!=email.lastIndexOf(".")){
 				System.out.println("duo@-.");
 			}else if(email.indexOf("@")>=email.indexOf(".")){
 				System.out.println("weizhi");
 			}else if(email.startsWith("@")||email.endsWith(".")){
 				System.out.println("touwei");
 			}else{
 				return email;
 			}
 		}
 	}
 	
}
