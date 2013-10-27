
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Vector;


public class Controller{
    HashMap <String, Product> contents = new HashMap <String, Product>();
    
    Controller(){
        ProductDB db = new ProductDB();
        contents = db.loadDatabase();
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
    
}      