import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int matrix[][] = new int [row][col];
    int trans[][] = new int[col][row];
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
          trans[j][i] =	matrix[i][j];
        }
    }
     for(int i = 0;i<col;i++)
    {
      	for(int j = 0;j<row;j++)
        {
          System.out.print(trans[j][i]+" ");
        }
       System.out.println();
    }
  }
}