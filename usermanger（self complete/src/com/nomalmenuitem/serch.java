package com.nomalmenuitem;

import com.mainmenuitem.login;
import com.menu.normalmenu;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.consoleutil;

public class serch implements Item{

	@Override
	public Menu execute() {
		System.out.println(login.loginuser.getId()+"  "+login.loginuser.getUsername()+"  "+login.loginuser.getPassword()
		+" "+login.loginuser.getEmail()+"  "+login.loginuser.getPower());
		return new normalmenu();
	}

}
