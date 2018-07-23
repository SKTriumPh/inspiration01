package adminserchmenuitem;

import com.menu.adminserchmenu;
import com.usermanger.Item;
import com.usermanger.Menu;

public class exit implements Item {

	@Override
	public Menu execute() {
		// TODO Auto-generated method stub
		return new adminserchmenu();
	}

}
