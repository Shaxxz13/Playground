import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
      	int num = sc.nextInt();
       //int sum = 0;
      System.out.print(sumnum(num));
      
    }
  public static int sumnum(int num)
  {
    if(num != 0)
    {
      	return num + sumnum(num -1);
    }
    else 
    {
      return num;
    }
  }


}