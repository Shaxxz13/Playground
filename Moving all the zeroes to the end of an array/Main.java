import java.util.Scanner;
class Main{
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      int zeros[] = new int[arr_size];
      int num[] = new int[arr_size];
      int z =0;
      int n =0;
      
      for(int index = 0;index<=arr_size-1;index++)
      {
			arr[index] = sc.nextInt();
      }
      for(int index = 0;index<= arr_size-1;index++)
      {
        	if(arr[index] == 0)
            {
              	zeros[z] = arr[index];
              z++;
            }
        if(arr[index] != 0)
        {
          num[n] = arr[index];
          n++;
        }
      }
      for(int index = 0; index <= arr_size-1;index++)
      {
		arr[index] = num[index];
        System.out.print(arr[index]+ " ");
      }
      
    
    }
}