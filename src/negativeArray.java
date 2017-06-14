import java.lang.*;
import java.util.Scanner;
public class negativeArray {
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int[] arr =new int[n];
	   for(int i=0;i<n;i++)
		   arr[i]=sc.nextInt();
	   sc.close();
	   int ans=0;
	   for(int i=0;i<arr.length;i++)
	   {
		  int k=0,x=0;
		  for(int j=i;j<n;j++)
		  {
			  k=k+arr[j];
			  if(k<0)
				  x++;
		  }
		  ans=ans+x;
		  
	   }
	   System.out.println(ans);
	   
   }
}
