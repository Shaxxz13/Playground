import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    int first = number/100;
    int second = (number/10)%10;
    int third = number%10;
    int reverse = (third*100)+(second*10)+first;
    System.out.println(reverse);
  }
}