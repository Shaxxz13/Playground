import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      for(int index = 0;index <=arr_size-1; index++)
      {
        arr[index] = sc.nextInt();
      }
      int value = sc.nextInt();
      for(int index = 0; index <= arr_size-1;index++)
      {
        for(int index_2 = index+1; index_2 <= arr_size-1;index_2++)
        {
          if((arr[index] + arr[index_2]) == value)
          {
            System.out.println(arr[index] + ", " + arr[index_2]);
          }
        }
      }
      
    }
}