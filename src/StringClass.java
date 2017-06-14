import java.lang.*;
import java.util.Scanner;
public class StringClass {
   public static void main(String strng[])
   {
	   Scanner sc = new Scanner(System.in);
	   String s=sc.nextLine();
	   int beginIndex=sc.nextInt();
	   int endIndex=sc.nextInt();
	   System.out.println(s.substring(beginIndex, endIndex));
   }
}
