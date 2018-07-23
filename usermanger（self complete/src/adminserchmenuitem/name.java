package adminserchmenuitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mainmenuitem.login;
import com.menu.adminserchmenu;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.DButil;
import com.utils.consoleutil;

public class name implements Item {

	@Override
	public Menu execute() {
		System.out.println("请输入ID");		
		String username=consoleutil.getString();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=DButil.getinstance().getconnection();
			ps=con.prepareStatement("select *from userinfo where name like ?");
			ps.setString(1,"%"+username+"%");
			rs=ps.executeQuery();
			if(rs.next()){
				login.loginuser.setId(rs.getInt(1));
				login.loginuser.setUsername(rs.getString(2));
				login.loginuser.setPassword(rs.getString(3));
				login.loginuser.setEmail(rs.getString(4));
				login.loginuser.setPower(rs.getInt(5));
				System.out.println(login.loginuser);
			}else{
				System.out.println("用户不存在，请重新输入");
			}	
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		DButil.getinstance().close(con);
		DButil.getinstance().close(ps);
		DButil.getinstance().close(rs);
	}
		return new adminserchmenu();
  }
}


