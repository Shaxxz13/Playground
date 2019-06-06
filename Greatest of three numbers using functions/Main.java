import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
         System.out.print(greatest(n1,n2,n3));
      
	}
  public static int greatest(int n1,int n2,int n3)
  {
 int great;
    if(n1>n2)
    {
      great = n1;
    }
    else 
    {
      great = n2;
    }
    if(great<n3)
    {
     great = n3;
    }
   return great;
  }
      
      
    
}