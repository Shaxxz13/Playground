import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int matrix[][] = new int[row][col];
    int matrix2[][]= new int[row][col];
    boolean is_true= true;
    for(int i = 0;i<row;i++)
    {
		for(int j = 0;j<col;j++)
        {
			matrix[i][j] = sc.nextInt();
        }
    }
    for(int i = 0;i<row;i++)
    {
		for(int j = 0;j<col;j++)
        {
			matrix2[i][j] = sc.nextInt();
        }
    }
    for(int i = 0;i<row;i++)
    {
		for(int j = 0;j<col;j++)
        {
			if(matrix[i][j] != matrix2[i][j])
            {
			is_true = false;
            }
        }
    }
	if(is_true == false)
    {
      System.out.print("No");
    }
      else
      {
		System.out.print("Yes");
      }

		
  }
}