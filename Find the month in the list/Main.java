import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList ll = new LinkedList();
      	String months = br.readLine();
      	String dupe = br.readLine();
      
      	String arr[] = months.split(",");
      	for(int i = 0;i<arr.length;i++)
        {
		ll.add(arr[i]);
        }
      	System.out.println(ll);
      	System.out.println("Size of the linked list: " + ll.size());
      	System.out.println("Is LinkedList empty? " + ll.isEmpty());
      	System.out.println("Does LinkedList contains " + dupe + "?");
      	System.out.println(ll.contains(dupe));
    }
}