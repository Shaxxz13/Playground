import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      	String str1 = sc.nextLine();
      	int str_len = str1.length();
      	int first = 0;
        int last = str_len-1;
      	boolean is_same = true;
      	while(first<last)
        {	is_same = true;
			if(str1.charAt(first) != str1.charAt(last) )
            {
              is_same = false;
              break;
            }
         first++;
         last--;
        }
      	if(is_same == true)
        {
			System.out.println("Yes");
        }
		else
        {
			System.out.println("No");
          
        }    
    } 
}