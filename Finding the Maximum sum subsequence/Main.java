import java.util.Scanner;
class Main{
  public static int sumsub(int arr[],int arr_size)
  {
	int running_sum,max_sum,index;
    running_sum = arr[0];
    max_sum = arr[0];
    for(index = 1;index<arr_size;index++)
    {
		if(arr[index] > arr[index-1])
        {
		running_sum = running_sum + arr[index];
        }
      else
      {
      running_sum = arr[index];
      }
      if(running_sum > max_sum)
      {
		max_sum = running_sum;
      }
    }
    return max_sum;
  }
    
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
    int arr_size = sc.nextInt();
    int arr[] = new int[arr_size];
    for(int index = 0;index<arr_size;index++)
    {
      arr[index] = sc.nextInt();
    }
    System.out.print(sumsub(arr,arr_size));
  }

}