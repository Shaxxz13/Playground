import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
	reverse(str);
  }
  public static void reverse(String str)
  {
	String[] words = str.split(" ");
    String revstr = "";
    for(int i = 0; i<words.length;i++)
    {
      	String word = words[i];
      	String revword = "";
      for(int j = word.length()-1;j>=0;j--)
      {
		revword = revword + word.charAt(j);
      }
		revstr = revstr + revword + " ";
    }
    System.out.print(revstr);
  }
}