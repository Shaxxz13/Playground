import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int gcd2 = n3;
      int gcd1 = gcd_of_3(n1,n2);
      System.out.print(gcd_of_3(gcd1,n3));
	}
  public static int gcd_of_3(int n1,int n2)
  {
    int min,gcd;
    if(n1<n2)
    {
      min = n1;
    }
    else
    {
      min = n2;
    }
    while(min<=1)
    {
    if((n1 % min == 0) && (n2 % min == 0))
    {
      gcd = min;
    }
      else 
      {
        min --;
      }
    }
      return min;
    
}
}