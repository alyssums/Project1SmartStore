
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;


public class Controller{
	ProductDB db = new ProductDB();
    HashMap <String, Product> contents = new HashMap <String, Product>();
    Cart cart = new Cart();
    
    Controller(){       
        contents = db.loadInventory();
    }
    
    
    String getItemInfo(String key){
       // Get info for requested item
       return contents.get(key).toString(); 
    }
    
    String getItemInventory(){
        // Get info for all items
        Vector <String> keys = new Vector (contents.keySet());
        Collections.sort(keys);
        String msg = "";
        for (Enumeration <String> e = keys.elements(); e.hasMoreElements();){
            String key = e.nextElement();
            Product item = contents.get(key);  
            msg += item.name + ", " + item.qty + "\n";
        }
        return msg;
    }
    
   /* String removeItemFromCart(){
		cart.print("Select an item to remove: ");
		Scanner scanRemove = new Scanner(System.in);
		cart.remove(System.in);
		System.out.println ("You have removed: " + System.in);
		return null;
    	
    }*/
    

    
    public void addToCart(int productID){
        //in our controller we have contents (database) and cart available
        if(db.isInStock(productID)){
            Product p = contents.get(productID);
            cart.add(p);
        } else {
            System.out.println("This item is out of stock and can't be added to the cart!");
        }
    }
    
    public void removeFromCart(int productID){
    	if(db.isInCart(productID)){
    		Product p = contents.get(productID);
    		cart.remove(p);
    	} else {
    		System.out.println("Item not found in cart");
    	}
    }

    
}      