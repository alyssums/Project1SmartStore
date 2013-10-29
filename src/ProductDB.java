import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Vector;


public class ProductDB {

	/*List available inventory, remove from ProductDB (which adds to Cart), add to ProductDB (which removes from Cart)*/
	
	 HashMap <String, Product> inventory = new HashMap <String, Product>();
     
     ProductDB(){
          Book book1 = new Book();
          book1.ID = "PL";
          book1.qty = 1;
          book1.author = "Michael Crighton";
          book1.name = "Pirate Latitudes";
          book1.genre = "Adventure";
          book1.numberPages = "320";
          book1.desc = "The Caribbean, 1665.  A remote colony of the English Crown...";

          inventory.put(book1.ID, book1);

          Book book2 = new Book();
          book2.ID = "CSH";
          book2.qty = 2;
          book2.author = "Sir Arthur Conan Doyle";
          book2.name = "The Complete Sherlock Holmes";
          book2.genre = "Who Done It";
          book2.numberPages = "944";
          book2.desc = "A collection of Sherlock Holmes' adventures";
          inventory.put(book2.ID, book2);
          
          Book book3 = new Book();
          book3.ID = "HPDH";
          book3.qty = 3;
          book3.author = "J.K. Rowling";
          book3.name = "Harry Potter and the Deathly Hallows";
          book3.genre = "Wizarding";
          book3.numberPages = "784";
          book3.desc = "Harry has started on his final journey to defeat Voldemort for good.";
          inventory.put(book3.ID, book3);

          Music music1 = new Music();
          music1.ID = "HWGA";
          music1.qty = 3;
          music1.name = "Here We Go Again";
          music1.desc = "Wynton Marsalis does it again";
          music1.artist = "Wynton Marsalis";
          music1.format = "Audio CD";
          music1.genre = "Blues";
          inventory.put(music1.ID, music1);
          
          Music music2 = new Music();
          music2.ID = "MC";
          music2.qty = 2;
          music2.name = "McCartney";
          music2.desc = "Paul's newest hits";
          music2.artist = "Paul McCartney";
          music2.format = "MP3 Download";
          music2.genre = "Rock";
          inventory.put(music2.ID, music2);
          
          Video video1 = new Video();
          video1.ID = "KS";
          video1.qty = 3;
          video1.name = "The King's Speech";
          video1.desc = "Based on the true story of King George VI.";
          video1.principleActors = "Colin Firth, Helena Bonham Carter, Geoffrey Rush, Guy Pearce, Tom Hooper";
          video1.rating = "R (language)";
          video1.format = "DVD";
          video1.year = "2010";
          video1.runningTime = "119 minutes";
          inventory.put(video1.ID, video1);
          
          Video video2 = new Video();
          video2.ID = "HW";
          video2.qty = 1;
          video2.name = "The Horse Whisperer";
          video2.desc = "A man speaks sweet nothings to Sarah Jessica Parker";
          video2.principleActors = "Robert Redford, Kristin Scott Thomas, Robert Richardson";
          video2.rating = "PG-13";
          video2.format = "Blu-ray";
          video2.year = "1998";
          video2.runningTime = "169 minutes";
          inventory.put(video2.ID, video2);
          
          Video video3 = new Video();
          video3.ID = "RHPS";
          video3.qty = 2;
          video3.name = "Rocky Horror Picture Show";
          video3.desc = "Strange things happen in a mysterious mansion";
          video3.principleActors = "Tim Curry, Susan Sarandon, Barry Bostwick, Richard O'Brien";
          video3.rating = "R";
          video3.format = "DVD";
          video3.year = "1975";
          video3.runningTime = "100 minutes";
          inventory.put(video3.ID, video3);
          
          Video video4 = new Video();
          video4.ID = "LOTR";
          video4.qty = 3;
          video4.name = "The Lord of the Rings";
          video4.desc = "A hobbit goes on a journey to destroy a ring";
          video4.principleActors = "Elijah Woods, Ian McKellen, Viggo Mortensen, Orlando Bloom";
          video4.rating = "PG-13";
          video4.format = "Blu-ray";
          video4.year = "2001";
          video4.runningTime = "178 minutes";
          inventory.put(video4.ID, video4);
          
          
     }

     public boolean addProduct(int productID){
         Product p = inventory.get(productID);
         if(p != null){
             //We have a product of that type in the database, lets increment its qty
             p.incrementQuantity(); //qty++;
             return true;
         } else {
             System.out.println("Product does not exist in database!");
             return false;
         }
     }
     public boolean removeProduct(int productID){
    	 Product p = inventory.get(productID);
    	 if(p != null){
    		 p.decrementQuantity();
    		 return true;
    	 } else {
    		 System.out.println("Product does not exist in database!");
    		 return false;
    	 }
     }
     
public boolean isInStock(int productID){
   Product p = inventory.get(productID);
         
      return (p.qty == 0);
     }

public boolean isInCart(int productID) {
	// TODO Auto-generated method stub
	return false;
}
public HashMap<String, Product> loadInventory() {
	// TODO Auto-generated method stub
	return inventory;
	}

public boolean isInStock(String productID) {
	// TODO Auto-generated method stub
	return false;
}

public boolean isInCart(String productID) {
	// TODO Auto-generated method stub
	return false;
}

}


