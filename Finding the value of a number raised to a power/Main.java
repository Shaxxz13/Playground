import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int base = sc.nextInt();
      	int exp = sc.nextInt();
      int result = 1;
      for(int i = 0; i<exp;i++)
      {
		result = result * base;
      }
      System.out.print(result);
    }
}