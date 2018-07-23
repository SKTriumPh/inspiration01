package com.mainmenuitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.menu.mainmenu;
import com.menu.normalmenu;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.DButil;
import com.utils.consoleutil;

public class reg implements Item {
	 
	@Override
	public Menu execute() {
		// TODO Auto-generated method stub
		System.out.println("注册界面");
		System.out.println("----------------");
		System.out.println("请输入用户名");
		String username=consoleutil.getString();
		System.out.println("请输入邮箱");
		String email =consoleutil.getemail();
		System.out.println("请输入用户权限");
		int power=consoleutil.getnum(1, 2);
		System.out.println("请输入密码");
		String password =consoleutil.getString();
		
		//jdbc检查用户是否合法
		Connection con = null;
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		try {
			 con=DButil.getinstance().getconnection();
			 ps=con.prepareStatement("select *from userinfo where username=?");
			ps.setString(1, username);
			rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("用户名已被注册");
			}else{
				con.setAutoCommit(false);
				ps = con.prepareStatement("insert into userinfo(username,password,email,power) values(?,?,?,?)");
				ps.setString(1,username);
				ps.setString(2,password);
				ps.setString(3,email);
				ps.setInt(4,power);
				ps.executeUpdate();
				con.commit();
				System.out.println("恭喜注册成功");
				return new normalmenu();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null){
				DButil.getinstance().close(con);
			}
			if(ps!=null){
				DButil.getinstance().close(ps);
			}
			if(rs!=null){
				DButil.getinstance().close(rs);
			}
		} 
		
		return new mainmenu();
	}

}
