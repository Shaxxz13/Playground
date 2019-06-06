import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int arr[][] = new int[num][num];
      int val = 1;
      int row_min = 0;
      int row_max = num -1;
      int col_min = 0;
      int col_max = num-1;
      while(row_min <= row_max && col_min<= col_max)
      {
      for(int i = col_max; i>= col_min; i--)
      {
		arr[row_min][i] = val++;
      }
      for(int i = row_min + 1;i<=row_max;i++)
      {
		arr[i][col_min] = val++;
      }
		for(int i = col_min + 1;i<= col_max;i++)
        {
		arr[row_max][i] = val++;
        }
		for(int i = row_max-1; i>= row_min+1;i--)
        {
		arr[i][col_max] = val++;
        }
        row_min++;
        row_max--;
        col_min++;
        col_max--;
        
      }
          for(int i = 0;i<num;i++)
          {
		for(int j = 0;j<num;j++)
        {
		System.out.print(arr[i][j]+ " ");
        }
            System.out.println();
          }
          
    }
}