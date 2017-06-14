import java.lang.*;
import java.util.Scanner;
public class MaxMinSubString {
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	int k = sc.nextInt();
    	String min1=s.substring(0,k);
    	String max1=s.substring(0,k);
    	for(int i=1;i+k-1<s.length();i++)
    	{
    		String temp=s.substring(i,i+k);
    		int z = temp.compareTo(max1);
    	    int z1 = temp.compareTo(min1);
    	    if(z1<0)
    	    {
    	    	min1=temp;
    	    }
    	    if(z>=0)
    	    {
    	    	max1=temp;
    	    }
    	}
    	System.out.println(min1+"\n"+max1);
    	sc.close();
    }
}
