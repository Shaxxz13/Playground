import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,sum=0;
      while(n>0){
        i = n%10;
        sum = sum + i;
        n = n/10;
      }
      System.out.println(sum);
	}
}