import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
      for(int index = 0; index<= arr_size-1; index++)
      {
		arr[index] = sc.nextInt();
      }
  
    
		for(int index = 0;index < arr_size-1;index++)
        {
          for(int index_2 = index + 1; index_2 <= arr_size -1; index_2++)
              {
                for(int index_3 = index_2 + 1; index_3<= arr_size-1;index_3++)
                {
             System.out.print("(" + arr[index] + ", " + arr[index_2] + ", " + arr[index_3] + ") ");
                }
          }
          System.out.print("\n");
        }
    }
}