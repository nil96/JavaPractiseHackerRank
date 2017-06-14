import java.lang.*;
import java.util.*;
public class Game {
   
   public static boolean dfs(int ind,int k,int[] arr,int[] vis)
   {   
	   if(ind>=arr.length)
		   return true;
	   int[] mov={1,-1,k};
	   vis[ind]=1;
	   boolean flag=false;
	   for(int i=0;i<mov.length;i++)
	   {
	       int z=ind+mov[i];
	       if(z<0)
	    	   continue;
	       if(z>=arr.length)
	       {
	    	   flag=true;
	    	   continue;
	       }
	       if(z>=0 && vis[z]==0 && arr[z]==0)
	       {
	    	   flag=flag || dfs(z,k,arr,vis);
	       }
	   }
	   return flag;
   }
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   int q = sc.nextInt();
	   for(int i1=0;i1<q;i1++)
	   {
		   int n=sc.nextInt();
		   int k=sc.nextInt();
		   int[] vis=new int[n];
		   int[] arr=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   int z=sc.nextInt();
			   vis[i]=0;
			   arr[i]=z;
		   }
		   boolean flag=dfs(0,k,arr,vis);
		   if(flag)
			   System.out.println("YES");
		   else
			   System.out.println("NO");
	   }
	   sc.close();
   }
}
