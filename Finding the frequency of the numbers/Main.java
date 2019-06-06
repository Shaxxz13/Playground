import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
      	int arr_size = sc.nextInt();
      	int k = sc.nextInt();
      	int arr[] = new int[arr_size];
      	for(int index = 0;index<arr_size;index++)
        {
			arr[index] = sc.nextInt();
          	
        }
      Arrays.sort(arr);
      for(int i = 1;i<=k;i++)
      {
        int count  = 0;
        	for(int index = 0;index<arr_size;index++)
            {
              if(arr[index] == i)
              {
                count++;
              }
            }
        System.out.println(i + " " + count);
      }
		
      
		
    }
}