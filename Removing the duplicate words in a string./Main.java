import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder s = new StringBuilder(str);
    int len = s.length();
   
    String[] words = str.split(" ");
    for(int i = 0;i<words.length;i++)
    {
    if(words[i] != null)
    {
      for(int j = i+1;j<words.length;j++)
      {
        	
        	if(words[i].equals(words[j]))
            {
              
			  words[j] = null;
            }
      }
    }
    }
    for(int i = 0;i<words.length;i++)
    {
      if(words[i]!=null)
    {
      
      	System.out.print(words[i]+" ");
    }
    }
    
  }
}