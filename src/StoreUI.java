
import java.util.Scanner;

public class StoreUI {
    StoreUI(){
        Controller ctrl = new Controller();
        boolean done = false;
        while (!done){
            System.out.println("Menu");
            System.out.println("1 - List");
            System.out.println("2 - Details");
            System.out.println("3 - Cart");
            System.out.println("4 - Add");
            System.out.println("5 - Return");
            System.out.println("6 - Help");
            System.out.println("7 - Quit");
            System.out.println("Enter selection > ");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();{
            
            if (input.equals("List") | input.equals("list")){
                System.out.println(ctrl.getItemInventory());
            } else if (input.equals("Cart") | input.equals("cart")){
            	System.out.println(Cart.contents);
            } else if (input.equals ("Add") | input.equals("add")){
            	System.out.print("Key code > ");
            	//Scanner productID = new Scanner (System.in);
            	//String key = productID.nextLine().toUpperCase();
            	//Take that info, add item to cart
            } else if (input.equals ("Remove") | input.equals("remove")){
            	System.out.print("Key code > ");
            	//Scanner scan
            	//String key = scan.nextLine().toUpperCase();
            	//Take that info, remove item from cart
            } else if (input.equals ("Help") | input.equals ("help")){
            	System.out.println("");
            } else if (input.equals ("Details") | input.equals ("details")){
               System.out.print("Key code > ");
               Scanner scanKey = new Scanner(System.in);
               String key = scanKey.nextLine().toUpperCase();
               System.out.println(ctrl.getItemInfo(key)); 
            } else if (input.equals("Quit") | input.equals("quit")){
                   System.out.print("Are you sure (y/n)?>");
                   Scanner scan1 = new Scanner(System.in);
                   String input1 = scan1.nextLine().toLowerCase();
                   	if (input1.equals("y"))
                       done = true;
                   	else 
                   		continue;
                   
                   scan1.close();
            } else {
            	System.out.println("I don't understand command '" + input + "'.");
            
            }
            }
        }
    }
}
