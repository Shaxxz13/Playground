import java.util.Scanner;

class Main
{
 public static void main(String args[])
 {
  
 Scanner in = new Scanner(System.in);
   int i = in.nextInt();
   int last;
   while(i>=100)
   {
   i = i/10;
   }
   last = i%10;
   System.out.println(last);
 }
  
  
  
  
  
}