import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print(sumnum(num));
  }
  public static int sumnum(int num)
  {
	if(num > 1)
    {
		return num * sumnum(num-1);
    }
    else
    {
	return num;
      
    }
  }

}