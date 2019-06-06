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
    int mid = size/2;
    for(int i = 0;i<size-1;i++)
    {
      for(int j = 0;j<mid-1;j++)
      {
        if(arr[j] > arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
       }
      for(int j = mid;j<size-1;j++)
      {
        if(arr[j] < arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
       }
     }
    for(int i = 0;i<size;i++)
    {
	System.out.print(arr[i] + " ");
    }
    
  }
  
    
  }
