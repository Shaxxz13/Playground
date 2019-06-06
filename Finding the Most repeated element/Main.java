import java.util.Scanner;
class Main
{
  public static int max(int arr[],int arr_size,int freq[])
  {
    int max_count_index = 0;
    int count = 1;
    for(int index = 0;index <arr_size;index++)
    {
		for(int j = index+1;j<arr_size;j++)
        {
			if(arr[index] == arr[j])
            {
			count++;
            }
        }
    
      freq[index] = count;
      count = 1;
    }
      for(int index = 0;index<arr_size;index++)
      {
		if(freq[index]>freq[max_count_index])
        {
			max_count_index = index;
        }
      }
        return arr[max_count_index];
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
    int freq[] = new int[arr_size];
    System.out.print(max(arr,arr_size,freq));
  }
}