import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
      	StringBuilder sb = new StringBuilder(str1);
      	int str_len = str1.length();
      	int start_index = 0;
      	int end_index = str_len-1;
       int start_idx = 0;
      reverse_string(sb,start_index,end_index);
      for(int idx = 0;idx<str_len;idx++)
      {
		if(sb.charAt(idx) == ' ')
        {	
          reverse_string(sb,start_idx,idx-1);
            start_idx = idx + 1;
        }
        else if(idx == (str_len -1))
        {
			reverse_string(sb,start_idx,idx);
              start_idx = idx+1;
        }
      }
      System.out.print(sb);
          
    }
  
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
		int end = end_idx;
      	int start = start_idx;
      	while(start<end)
        {
          char temp_ch = sb.charAt(start);
          sb.setCharAt(start,sb.charAt(end));
          sb.setCharAt(end,temp_ch);
          start++;
          end--;
        }
      
    }
          
      
    }
