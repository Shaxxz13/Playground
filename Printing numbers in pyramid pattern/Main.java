import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int space = n-1;
      int val = 1;
      for(int row =1;row<=n;row++)
      {
        for(int i =1; i<=space; i++)
        {
          System.out.print(" ");
        }
        space--;
        for(int col=1;col<=row;col++)
      {
          System.out.print(val+" ");
          val++;
        }
        System.out.println();
      }
        
}
}