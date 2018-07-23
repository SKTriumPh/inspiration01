package com.start;

import com.menu.mainmenu;
import com.usermanger.Item;
import com.usermanger.Menu;

public class Strart {
	//用户管理系统
public static void main(String[] args) {
	//1.获取主菜单选项
	Menu menu =new mainmenu();
	
		while(menu!=null){
		//2.显示内容
		menu.showinfo();
		//3.提供选项
		Item item = menu.pickItem();
		//执行功能
		menu=item.execute();
		}
	
	System.out.println("谢谢使用，再见");			
	}
}		

