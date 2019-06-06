import java.util.Scanner;

class Faculty
{
  public void salary(int basic)
  {
    System.out.println("Base Salary: " + basic);
  }
}
class CSE extends Faculty
{
  public void salary(int basic)
  {
    System.out.println("CSE Faculty: " + (basic+3000));
  }
}
class IT extends CSE
{
  public void salary(int basic)
  {
System.out.println("IT Faculty: " + (basic+5000));  }
}
class ECE extends IT
{
  public void salary(int basic)
  {
System.out.println("ECE Faculty: " + (basic+4500));  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int basic = sc.nextInt();
    if(basic > 0)
    {
    Faculty obj4 = new Faculty();
    CSE obj1 = new CSE();
    IT obj2 = new IT();
    ECE obj3 = new ECE();
    obj4.salary(basic);
    obj1.salary(basic);
    obj2.salary(basic);
    obj3.salary(basic);
    }
    else
    {
      System.out.println("null");
    }
    //implement your required concept here
  }
}