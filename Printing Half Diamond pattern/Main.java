import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int space = n;
      for(int row=1;row<=n;row++)
      {
        for(int i =1;i<=space-1;i++)
        {
          
          System.out.print(" ");
        }
        space--;
        for(int col=1; col<=2*row-1;col++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
	}
}