import java.lang.*;
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       String x=sc.nextLine();
       int n = x.length();
       boolean flag=true;
       for(int i=0,j=n-1;i<n;i++,j--)
       {
    	   if(x.charAt(i)!=x.charAt(j))
    	   {
    		   flag=false;
    		   break;
    	   }
       }
       sc.close();
       if(flag)
    	   System.out.println("Yes");
       else
    	   System.out.println("No");
    }
}
