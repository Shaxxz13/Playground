import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      for(int row=n;row>=1;row--)
      {
       
        for(int col=row;col>=1;col--)
        {
          System.out.print(col);
          
        }
        System.out.println();
      }
        
	}
}