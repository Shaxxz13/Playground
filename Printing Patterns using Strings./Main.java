import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
		Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	int len = str.length();
    	int mid = len/2;
    	for(int i = len -1;i>=0;i--)
        {
			int count = 0;
          for(int s = 0; s<i;s++)
          {
			System.out.print(" ");
            count++;
          }
		if(i>len/2)
        {
			int j = len/2;
          while(count<len)
          {
			System.out.print(str.charAt(j++));
            count++;
          }
        }
          else
          {
			int j = len/2;
            while(count<=len/2+i)
            {
			System.out.print(str.charAt(j++));
              count++;
            }
            j =0;
            while(count<len)
            {
			System.out.print(str.charAt(j++));
              count++;
            }
          } 
          System.out.println();
        }
        
  }
}