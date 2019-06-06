import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int shape = sc.nextInt();
      	switch(shape)
        {
          case 1: 
            int side = sc.nextInt();
            side = side*4;
            System.out.print(side);
            break;
          case 2:
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            break;
          case 3:
            int base = sc.nextInt();
            int height = sc.nextInt();
            int result = ((base * height) / 2);
            System.out.println(result);
            break;
          case 4:
            double radius = sc.nextInt();
            double area = 3.14 * radius * radius;
            System.out.println(area);
            break;
          default:
            System.out.println("Invalid Input");
            break;
        }
        
    }
}