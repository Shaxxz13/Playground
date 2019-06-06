import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
      	String str = sc.nextLine();
      	StringBuilder sb = new StringBuilder(str);
      	int len = str.length();
      	int arr[] = new int[26];
      	for(int i = 0;i<=25;i++)
        {
		arr[i] = 0;
        }
      for(int p = 0; p<=len-1;p++)
      {
        if(sb.charAt(p) >= 'A' && sb.charAt(p) <= 'Z')
        {
			int low = sb.charAt(p) - 'A';
          	char ch = (char) ( 'a' + low);
            sb.setCharAt(p,ch);
        }
        
        if(sb.charAt(p)>= 'a' && sb.charAt(p) <= 'z')
        {
          int offset = sb.charAt(p) - 'a';
          arr[offset]++;
        }
      }
      for(int p = 0;p<=len-1;p++)
      {
			if(arr[sb.charAt(p)- 'a'] != 0)
           {
             System.out.print(sb.charAt(p) +""+ arr[sb.charAt(p) - 'a']+" ");
              arr[sb.charAt(p) - 'a'] = 0;
           }
                   
      }
         
        
      	
      
    }
}