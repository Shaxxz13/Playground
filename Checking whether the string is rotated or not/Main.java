import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     String str1 = sc.nextLine();
     String str2 = sc.nextLine();
      
      String temp = str1 + str1;
      Boolean is_found = temp.contains(str2);
      if(is_found == true)
      {
		System.out.print("Yes");
      }
      else 
      {
		System.out.print("No");
      }

    }
}