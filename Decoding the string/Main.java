import java.util.Scanner;
class Main{
  public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
      String text = sc.nextLine();
      int key = sc.nextInt();
    StringBuilder str = new StringBuilder(text);
    int len = str.length();
    
    for(int index = 0;index<len;index++)
    {
		char ch = str.charAt(index);
      if(ch >= 'A' && ch <= 'Z')
        {
            ch = (char)(ch - key);
            if(ch < 'A')
            {
                ch = (char)(ch + 26);
            }
      }
     else if(ch >= 'a' && ch <= 'z')
        {
            ch = (char)(ch - key);
            if(ch < 'a')
            {
                ch = (char)(ch + 26);
            }
     }
      str.setCharAt(index,ch);
    }
    System.out.print(str);
  }
}