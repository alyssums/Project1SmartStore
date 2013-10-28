
public class Product 
{
    String ID, name, desc;
    int qty;
    
    Product()
    {}
    
    Product (String ID)
    {
        this.ID = ID;
    }
    
    Product (String ID, String name)
    {
        this(ID);
        this.name = name;
    }
    
    Product(String ID, String name, String desc)
    {
        this(ID, name);
        this.desc = desc;
    }
    
    public String toString()
    {
      String msg = "";
      msg += "ID: " + this.ID + "\n";
      msg += "Name: " + this.name + "\n";
      msg += "Description: " + this.desc + "\n";
      msg += "Quantity: " + this.qty;
      return msg;
    }

	public void incrementQuantity() {
		// TODO Auto-generated method stub
		
	}
    
}
