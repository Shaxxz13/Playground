import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = a/100;
      int c = a%10;
      int d = b + c;
      System.out.println(d);
	}
}