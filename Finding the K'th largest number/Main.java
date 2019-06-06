import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
	  Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      for(int index = 0;index<arr_size;index++)
      {
		arr[index] = sc.nextInt();
      }
      int k = sc.nextInt();
      Arrays.sort(arr);
      System.out.print(arr[arr_size - k]);
      
      
    }   
}