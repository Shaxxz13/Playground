import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
    
      for(int index =0; index <= arr_size-1;index++)
      {
        arr[index] = in.nextInt();
      }
      int max = arr[0];
      for(int index = 1; index<= arr_size-1;index++)
      {
        if(arr[index]>max)
        {
         max = arr[index];
        }
    }
      System.out.print(max);
}
}