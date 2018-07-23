package com.menu;

import com.mainmenuitem.exit;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.consoleutil;

import adminserchmenuitem.all;
import adminserchmenuitem.byid;
import adminserchmenuitem.name;

public class adminserchmenu implements Menu {

	@Override
	public void showinfo() {
		System.out.println("请选择查询方式");
		System.out.println("查询全部用户----------1");
		System.out.println("通过ID查询用户--------2");
		System.out.println("通过姓名查询用户-------3");
		System.out.println("退出----------------4");
	}

	@Override
	public Item pickItem() {
		Item item=null;
		int option=consoleutil.getnum(1, 4);
		switch (option) {
		case 1:
			item=new all();
			break;
		case 2:
			item=new byid();
			break;
		case 3:
			item=new name();
			break;
		case 4:
			item=new adminserchmenuitem.exit();
			break;
		}
		return item;
	}

}
