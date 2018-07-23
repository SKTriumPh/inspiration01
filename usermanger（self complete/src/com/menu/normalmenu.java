package com.menu;

import com.mainmenuitem.login;
import com.nomalmenuitem.exit;
import com.nomalmenuitem.serch;
import com.nomalmenuitem.update;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.consoleutil;

public class normalmenu implements Menu {

	@Override
	public void showinfo() {
		String loginname=login.loginuser.getUsername();
		System.out.println("-------------");
		System.out.println("欢迎登陆主窗体");
		System.out.println(loginname+"您好                    您的权限是:普通用户");
		System.out.println("查询自己的信息-------1");
		System.out.println("修改自己的信息-------2");
		System.out.println("退出登录------------3");
		
	}

	@Override
	public Item pickItem() {
		Item item=null;
		int option=consoleutil.getnum(1, 3);
		switch (option) {
		case 1:
			item=new serch();
			break;
		case 2:
			item=new update();
			break;
		case 3:
			item=new exit();
			break;
		}
		return item;
	}

}
