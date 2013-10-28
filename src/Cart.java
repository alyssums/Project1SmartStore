import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Cart{

	/* "List" contents of cart, "add" items to cart (which removes from ProductDB), "remove" items from cart (which increases ProductDB) */
	static ArrayList <Product> contents = new ArrayList<Product>();
	Cart()
	{}
	
	public void add(Product newItem){
		contents.add(newItem);
	}
	
    public boolean remove(Product oldItem){
        if (contents.size() == 0){
            return false;
        } else {
            contents.remove(oldItem);
            return true;
        }
    }
	

	public static void print(String string) {
		// TODO Auto-generated method stub
		
	}

}
