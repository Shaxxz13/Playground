import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int len = s.length();
    double befdec = 0;
    double aftdec = 0;
    int flag = 0;
    for(int i = 0; i<len; i++)
    {
	 if(s.charAt(i) == '.')
       flag = 1;
    }
    if(flag == 1)
    {
	for(int i = len -1; s.charAt(i)!= '.' && i>=0 ; i--)
    {
		aftdec = aftdec/10 + (s.charAt(i) - '0');
    }
      aftdec = aftdec/10;
      for(int i = 0; s.charAt(i)!='.';i++)
      {
		befdec = befdec*10 + (s.charAt(i) - '0');
      }
    }
    else 
    {
      for(int i = 0;i<len;i++)
      {
		befdec = befdec*10 + (s.charAt(i) - '0');
      }
    }
    double sum = (befdec+aftdec);
    System.out.print(sum);
  }
  

    
    
    
  }
