import java.util.ArrayList;


public class Cart{

	/* "List" contents of cart, "add" items to cart (which removes from ProductDB), "remove" items from cart (which increases ProductDB) */
	ArrayList <Controller> contents = new ArrayList<Controller>();
	Cart()
	{}
	
	public void add(Controller newItem){
		contents.add(newItem);
	}
	
	public boolean remove(Controller oldItem){
		if (contents.size() == 0){
			return false;
		} else {
			contents.remove(oldItem);
			return true;
		}
	}

}
