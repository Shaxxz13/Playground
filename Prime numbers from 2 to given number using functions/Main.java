import java.util.Scanner;
class Main{
  public static boolean is_prime(int m)
      {
        boolean is_prime = true;
        for(int num =2; num<=m/2;num++)
        if(m % num == 0)
        {
         is_prime = false;
          break;
        }
        
          return is_prime;
      }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      for(int i = 2;i<=n;i++)
      {
        if(is_prime(i))
        {
        System.out.println(i);
        }
      }
      
      
	}
}