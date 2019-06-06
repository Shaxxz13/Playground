import java.util.Scanner;
class Main
{
  public static void main(String args[])
  	{
		Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	int arr[] = new int[size];
    for(int i = 0;i<size;i++)
    {
      	arr[i] = sc.nextInt();
    }
    int start = 0;
    int end = size/2;
    for(int j = 0;j<size-1;j++)
    {
    for(int i = start; i<=end-2;i++)
    {
      if(arr[i] > arr[i+1])
      {
		int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
      
    }
    for(int i = 0;i<size;i++)
    {
      	System.out.print(arr[i]+" ");
    }
    
  	}
}