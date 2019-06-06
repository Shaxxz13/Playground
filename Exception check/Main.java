import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
      try {
        int n = sc.nextInt();
        System.out.println(n);
      }
     catch(Exception e)
     {
		System.out.println("Input Mismatch Exception occurred");
     }
        
   }
}