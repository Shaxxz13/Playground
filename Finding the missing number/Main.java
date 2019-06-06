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
      
      int missing = 0;
       for(int num = 1;num<=arr_size;num++)
       {
		boolean is_true = false;
         
			for(int index = 0;index<arr_size;index++)
            {
			if(arr[index] == num)
            {
				is_true = true;
               break;
            }
            }
           if(is_true == false)
           {
			missing = num;
           }
         }
         System.out.print(missing);
         
           
      
    }
}