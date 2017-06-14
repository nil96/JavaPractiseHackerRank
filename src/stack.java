//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
public class stack {
   public static char reverse(char a)
   {
	   if(a==')')
		   return '(';
	   if(a=='}')
		   return '{';
	   return '[';
   }
   public static void main(String args[])
   {
	   Scanner sc= new Scanner(System.in);
	   Stack st= new Stack();
	   while(sc.hasNext())
	   {
           boolean flag=true;
		   st.clear();
		   String input=sc.nextLine();
		   int n=input.length();
		   for(int i=0;i<n;i++)
		   {
			   char c=input.charAt(i);
			   if(c=='{' || c=='(' || c=='[' )
				   st.push(c);
			   else if(c=='}' || c==')' || c==']')
			   {
				   while(true)
				   {
					    if(st.empty())
					    {
					      flag=false;
					      break;
					    }
					    char z=(char)st.peek();
					    char z1=reverse(c);
					    if(z!=z1)
					    {
						   st.pop();
					    }
					    if(z==z1)
					    {
						   st.pop();
						   break;
					    }  
				    }
			   
			   }   
		   }
		   if(!st.empty())
			   flag=false;
		   if(flag==true)
			   System.out.println("true");
		   else
			   System.out.println("false");
	   }
	   sc.close();
   }
}
