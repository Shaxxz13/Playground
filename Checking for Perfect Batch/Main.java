import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int arr[] = new int[n];
        boolean is_perfect = true;
    	int batch_sum=0;
    	for(int index = 0; index<=n-1;index++)
        {
          arr[index] = sc.nextInt();
        }
    	int sum = arr[0] + arr[1] + arr[2];
     for(int index = 3;index<=n-1;index = index + 3)
     {
       batch_sum = arr[index] + arr[index+1] + arr[index+2];
       
       if(batch_sum != sum)
       {
			is_perfect = false;
       }
     }
    if(is_perfect == true)
    {
			System.out.print("Perfect Batch");
    }
    if(is_perfect == false)
    {
      		System.out.print("Not a Perfect Batch");
    }
     
  }
}