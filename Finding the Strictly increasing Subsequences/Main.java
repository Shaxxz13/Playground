import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  	Scanner sc = new Scanner(System.in);
    int arr_size = sc.nextInt();
    int arr[] = new int[arr_size];
    for(int i = 0; i<arr_size;i++)
    {
		arr[i] = sc.nextInt();
    }
    increasing_subseq(arr_size,arr);
  }
  
  public static void increasing_subseq(int arr_size,int arr[])
  {
	for(int index1 = 0;index1<arr_size;index1++)
    {
      int flag = 1;
      for(int index2 = index1 + 1;index2<arr_size;index2++)
      {
		if(arr[index1] < arr[index2])
        {
          	for(int index3 = index1;index3<=index2;index3++)
            {
				if(arr[index3] > arr[index2])
                {
				flag = 0;
                }
            }
                
                if(flag == 1)
                {
          	System.out.println(arr[index1] + "," + arr[index2]);
                }
          flag = 1;
        }
      }
    }
  }
  
  
}