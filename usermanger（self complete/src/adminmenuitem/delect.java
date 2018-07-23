package adminmenuitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.menu.adminmenu;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.DButil;
import com.utils.consoleutil;

public class delect implements Item {

	@Override
	public Menu execute() {
		int id=-1;	
		System.out.println("请输入要删除用户的ID号");
		try {
			id=consoleutil.getid();
		} catch (Exception e) {
			System.out.println("ID不符合规范");
			return new adminmenu();
		}
		 
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=DButil.getinstance().getconnection();
			ps=con.prepareStatement("delete *from userinfo where id=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("删除成功");
			}else{
				System.out.println("ID不存在，请重新输入");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DButil.getinstance().close(con);
			DButil.getinstance().close(ps);
			DButil.getinstance().close(rs);
		}
		
		
		return new adminmenu();
	}

}
