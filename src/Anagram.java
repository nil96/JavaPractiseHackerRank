import java.lang.*;
import java.util.Scanner;
public class Anagram {
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  String buff = sc.nextLine();
	  String buff1 = sc.nextLine();
	  sc.close();
	  int[] arr= new int[100];
	  for(int i=0;i<100;i++)
		arr[i]=0;
	  for(int i=0;i<buff.length();i++)
	  {
		 int ind=(buff.charAt(i)-'a');
		 arr[ind]++;
	  }
	  for(int i=0;i<buff1.length();i++)
	  {
		  int ind=(buff1.charAt(i)-'a');
		  arr[ind]--; 
	  }
	  boolean flag=true;
	  for(int i=0;i<='z'-'a';i++)
	  {
		  if(arr[i]!=0)
		  {
			  flag=false;
			  break;
		  }
	  }
	  if(flag)
		  System.out.println("Anagrams");
	  else
		  System.out.println("Not Anagrams");
	  
	  
  }
	
}
