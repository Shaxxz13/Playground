import java.util.Scanner;
class Main{
  public static int cal(int n,int p)
    {
      int sum = 1;
    for(int i = 1; i<=p;i++)
    {
      
       sum = sum * n;
    }
     return sum;
  }
    
  public static void main(String args[])
      {
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
    int p = in.nextInt();
   
      int total = cal(n,p);
    System.out.print(total);
    
      
      
	}
  
}