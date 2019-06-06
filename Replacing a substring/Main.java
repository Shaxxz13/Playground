import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String rep = sc.nextLine();
      String include = sc.nextLine();
      String result = str.replace(rep,include);
      System.out.print(result);
      
    }
}