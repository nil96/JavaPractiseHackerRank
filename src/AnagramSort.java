import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramSort {
   public static void main(String string[])
   {
	   Scanner sc = new Scanner(System.in);
	   String A = sc.next();
	   String B = sc.next();
	   char[] a=A.toLowerCase().toCharArray();
	   char[] b=B.toLowerCase().toCharArray();
	   Arrays.sort(a);
	   Arrays.sort(b);
	   boolean flag=Arrays.equals(a,b);
	   if(flag)
			  System.out.println("Anagrams");
		  else
			  System.out.println("Not Anagrams");
   }
}
