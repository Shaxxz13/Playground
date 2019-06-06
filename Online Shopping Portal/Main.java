public class Main {
	public static void main(String[] args) {
		Customers customerObj1 = new Customers(1001,"Saakshi",9000000000l,"Bangalore","16-Jul-1990",'F',"Lakme Kajal, Salwar");
		Customers customerObj2 = new Customers(1008,"Rahul",9000000001l,"Chennai","27-Jan-1992",'M',"T-Shirt, Jeans");
		Suppliers supplierObj1 = new Suppliers(7901,"ABC Traders",8000000000l,"Mumbai",10,"Paid",4.75f);
		Suppliers supplierObj2 = new Suppliers(7972,"XYZ Enterprises",8000000900l,"Kolkata",7, "Unpaid",4.35f);
		
		//Task 1
		
		customerObj1.displayProfileDetails();
		customerObj2.displayProfileDetails();
		supplierObj1.displayProfileDetails();
		supplierObj2.displayProfileDetails();
		
		//Task 2
		
		customerObj1.editAddress("Coimbatore");
		supplierObj1.editAddress("Delhi");
		
		//Task 3
		
		customerObj1.placeOrder();
		
		//Task 4
		
		supplierObj1.increaseStockLevel(5);
		supplierObj2.increaseStockLevel(10);
    }	
}

class Users {
		int id;
  		String name;
  		long mobilenumber;
  		String address;
  public void editAddress(String newAddress) {
		System.out.println(name+", "+address);
		address = newAddress;
		System.out.println(name+", "+address);
	}
	
	public void displayProfileDetails(){
		System.out.println(name+", "+mobilenumber);
	}
}

class Customers extends Users{
		String dateofbirth;
  		char gender;
  		String orderhistory;
  public Customers(int id,String name,long mobilenumber,String address,String dateofbirth,char gender,String orderhistory)
  {
   this.id = id;
    this.name = name;
    this.mobilenumber = mobilenumber;
    this.address = address;
    this.dateofbirth = dateofbirth;
    this.gender = gender;
    this.orderhistory = orderhistory;
    
    
  }
  public void placeOrder() {
		System.out.println("Order placed successfully!");
	}

}


class Suppliers extends Users {
		int itemstock;
  		String paymentstatus;
  		float feedbackrating;
  public Suppliers(int id,String name,long mobilenumber,String address,int itemstock,String paymentstatus,float feedbackrating)
  {
    this.id = id;
    this.name = name;
    this.mobilenumber = mobilenumber;
    this.address = address;
    this.itemstock = itemstock;
    this.paymentstatus = paymentstatus;
    this.feedbackrating = feedbackrating;
    
  }
  
  public void increaseStockLevel(int newStock) {		
		System.out.println(name+", "+(itemstock+newStock));		
	}
}