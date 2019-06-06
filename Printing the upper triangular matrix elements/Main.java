import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int matrix[][]= new int [row][col];
  for(int i = 0;i<row;i++)
    {
	for(int j = 0;j<col;j++)
		{
      	matrix[i][j] = sc.nextInt();
    }

  }
    int k;
    for( k = 0;k<col;k++)
    {
		for(int i = 0,j=k;j<col;i++,j++)
        {
			System.out.print(matrix[i][j] + " ");
        }

    }
          
	
  }
}