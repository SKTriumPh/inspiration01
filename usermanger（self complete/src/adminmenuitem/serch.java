package adminmenuitem;

import com.menu.adminmenu;
import com.menu.adminserchmenu;
import com.usermanger.Item;
import com.usermanger.Menu;

public class serch implements Item {

	@Override
	public Menu execute() {
		
		return new adminserchmenu();
	}

}
