import java.lang.*;
import java.util.Scanner;
public class StringLearn {
    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	String a = sc.nextLine(),b = sc.nextLine();
    	sc.close();
    	int c = a.length()+b.length();
    	a=a.toLowerCase();
    	b=b.toLowerCase();
    	System.out.println(c);
    	int z=a.compareTo(b);
    	a=a.substring(0,1).toUpperCase() +a.substring(1);
    	b=b.substring(0,1).toUpperCase() +b.substring(1);
    	if(z<=0)
    	  System.out.println("No");
    	else
    	  System.out.println("Yes");
    	System.out.println(a+" "+b);
    }
}
