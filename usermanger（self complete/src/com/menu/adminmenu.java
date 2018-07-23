package com.menu;

import com.mainmenuitem.login;
import com.nomalmenuitem.serch;
import com.nomalmenuitem.update;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.consoleutil;

import adminmenuitem.add;
import adminmenuitem.delect;
import adminmenuitem.exit;

public class adminmenu implements Menu {

	@Override
	public void showinfo() {
		// TODO Auto-generated method stub
		String loginname=login.loginuser.getUsername();
		System.out.println("-------------");
		System.out.println("欢迎登陆主窗体");
		System.out.println(loginname+"您好                    您的权限是:管理员");
		System.out.println("查询用户-------1");
		System.out.println("删除用户-------2");
		System.out.println("修改用户-------3");
		System.out.println("添加用户-------4");
		System.out.println("退出------------5");
	}

	@Override
	public Item pickItem() {
		Item item=null;
		int option=consoleutil.getnum(1, 5);
		switch (option) {
		case 1:
			item=new serch();
			break;
		case 2:
			item=new delect();	
			break;
		case 3:
			item=new update();
			break;
		case 4:
			item=new add();
			break;
		case 5:
			item=new exit();
			break;
		}
		return item;
	}

}
