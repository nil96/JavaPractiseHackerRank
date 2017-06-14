import java.lang.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
public class Java2dArray {
  public static int getValue(int a,int b,int arr[][])
  {
	  int ans=0;
	  int mask[][]={{1,1,1},{0,1,0},{1,1,1}};
	  for(int i=a,x=0;i<a+3;i++,x++)
	  {
		  for(int j=b,y=0;j<b+3;j++,y++)
		  {
			  ans=ans+arr[i][j]*mask[x][y];
		  }
	  }
	  return ans;
  }
  public static void main(String args[])
  {
	  int arr[][]=new int[6][6];
	  Scanner sc=new Scanner(System.in);
	  for(int i=0;i<6;i++)
		  for(int j=0;j<6;j++)
			  arr[i][j]=sc.nextInt();
	  sc.close();
	  int ans=-10000000;
	  for(int i=0;i<6;i++)
	  {
		  for(int j=0;j<6;j++)
		  {
			  if(i+2<6 && j+2<6)
			  {
				 int z=getValue(i,j,arr);
				 ans=Integer.max(ans, z);
			  }
		  }
	  }
	  System.out.println(ans+"\n");
	  
  }
}
