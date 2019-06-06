import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int max;
    for(int i =0;i<=n-1;i++)
    {
      arr[i]= sc.nextInt();
    }
    if(arr[0]>arr[1])
    {
	max = 0;
    }
    else
    {
	max = 1;
    }
    for(int i = 2;i<=n-1;i++)
    {
      if(arr[max] < arr[i])
      {
	max = i;
      }
    }
    System.out.println(max);
    
  }
}