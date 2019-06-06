import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
      	int arr_size = sc.nextInt();
      	int arr[] = new int[arr_size];
      	int start = 0;
        int end = arr_size-1;
        boolean is_pal = false;
      	for(int index = 0;index<arr_size;index++)
        {
			arr[index] = sc.nextInt();
        }
      while(start < end)
      {
         is_pal = false;
        	if(arr[start] != arr[end])
            {
              is_pal = true;
              break;
            }
		start++;
        end--;
      }
			if(is_pal==false)
            {
			System.out.print("Yes");
            }
		else
        {
          System.out.print("No");
        }

      
    }
}