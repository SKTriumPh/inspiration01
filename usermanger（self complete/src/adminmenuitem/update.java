package adminmenuitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mainmenuitem.login;
import com.menu.adminmenu;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.DButil;
import com.utils.consoleutil;

public class update implements Item {

	@Override
	public Menu execute() {
		int id=-1;
		System.out.println("请输入id");
		try {
			 id=consoleutil.getid();
		} catch (Exception e) {
			System.out.println("ID不符合规范");
		}
		System.out.println("请输入用户名");
		String username=consoleutil.getString();
		System.out.println("请输入密码");
		String password=consoleutil.getString();
		System.out.println("请输入邮箱");
		String email=consoleutil.getemail();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=DButil.getinstance().getconnection();
			ps=con.prepareStatement("select *from userinfo where  id=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next()){
				con=DButil.getinstance().getconnection();
				ps=con.prepareStatement("select *from userinfo where username=?, id!=?");
				ps.setString(1, username);
				ps.setInt(2, id);
				rs=ps.executeQuery();
				if(rs.next()){
					System.out.println("用户名已存在");
				}else{
					ps=con.prepareStatement("update userinfo set username = ?,password = ?,email = ?where id=?"); 
					ps.setString(1, username);
					ps.setString(2, password);
					ps.setString(3, email);
					ps.setInt(4, id);
					System.out.println("修改成功");
					login.loginuser.setId(id);
					login.loginuser.setUsername(username);
					login.loginuser.setPassword(password);
					login.loginuser.setEmail(email);
				}
			}else{
				System.out.println("ID不存在");
			}
			
		return new adminmenu();
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		DButil.getinstance().close(con);
		DButil.getinstance().close(ps);
		DButil.getinstance().close(rs);
	}
		return new adminmenu();
	}

}
