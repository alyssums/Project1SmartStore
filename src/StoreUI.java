
import java.util.Scanner;

public class StoreUI {
    StoreUI(){
        Controller ctrl = new Controller();
        boolean done = false;
        while (!done){
            System.out.println("Menu");
            System.out.println("1 - List inventory");
            System.out.println("2 - Specify item code");
            System.out.println("Enter selection > ");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            
            if (input.equals("1"))
                System.out.println(ctrl.getItemInventory());
            else{
               System.out.print("Key code > ");
               Scanner scanKey = new Scanner(System.in);
               String key = scanKey.nextLine().toUpperCase();
               System.out.println(ctrl.getItemInfo(key)); 
            }
        }
    }
}
