import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0, temp,r;
      temp = n;
      
      while(temp > 0)
      {
      r = temp % 10;
        sum = sum +(r*r*r);
        temp = temp /10;
      }
      if(n == sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}