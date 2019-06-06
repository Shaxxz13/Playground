import java.util.Scanner;

class Item
{
  private int price;
  
  public void setprice(int price)
  {
	this.price = price; 
  }
  public int getprice()
  {
	return price;
    
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  public void setproduct(String product)
  {
		this.product = product;
        }
public String getproduct()
{
	return product;
    }
public void setquantity(int quantity)
{
this.quantity = quantity;
}
public int getquantity()
{
return quantity;
}
}

class Bill extends Customer
{
  public int result(int p,int q)
  {
	int result = q*p;
    return result;
    }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String product = sc.nextLine();
    int price = sc.nextInt();
    int quantity = sc.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    i.setprice(price);
    c.setquantity(quantity);
    int q = c.getquantity();
    int p = i.getprice();
    int r = obj.result(p,q);
    System.out.println("Total Price is : " + r);
    
  }
}