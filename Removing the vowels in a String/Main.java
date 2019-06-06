import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder s = new StringBuilder(str);
    int len = str.length();
    for(int i =0;i<len;i++)
    {
      	if(s.charAt(i) == 'a' || s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u')
        {
          s.deleteCharAt(i);
          len--;
        }
    }
    System.out.print(s);
    
  }
}