package com.mainmenuitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.menu.adminmenu;
import com.menu.mainmenu;
import com.menu.normalmenu;
import com.utils.DButil;
import com.start.Strart;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.usermanger.Userinfo;
import com.utils.DButil;
import com.utils.consoleutil;

public class login implements Item {
public static Userinfo loginuser;
	@Override
	public Menu execute() {
		// TODO Auto-generated method stub
		System.out.println("ª∂”≠µ«¬º");
		System.out.println("----------");
		System.out.println("«Î ‰»Î”√ªß√˚");
		String username=consoleutil.getString();
		System.out.println("«Î ‰»Î√‹¬Î");
		String password=consoleutil.getString();
		
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=DButil.getinstance().getconnection();
			ps=con.prepareStatement("selsct *from userinfo where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("µ«¬º≥…π¶");
				int userlevel=login.loginuser.getPower();
				if(userlevel==0){
					return new normalmenu();
				}else if (userlevel==1){
					return new adminmenu();
				}
			}else{
				return new mainmenu();
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DButil.getinstance().close(con);
			DButil.getinstance().close(ps);
			DButil.getinstance().close(rs);
		}
		return null;		
	}
}
