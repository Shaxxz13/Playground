import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int mul = 1;
      for(int i = 1; i<=n;i++)
      {
      mul = mul * i;
      }
      System.out.println(mul);
	}
}