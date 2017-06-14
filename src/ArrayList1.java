import java.lang.*;
import java.util.*;
public class ArrayList1 {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList[] arr=new ArrayList[10000];
		for(int i=0;i<n;i++)
		{
			int z = sc.nextInt();
			arr[i]=new ArrayList();
			for(int j=0;j<z;j++)
			{
				int x=sc.nextInt();
				arr[i].add(x);
			}
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			int a,b;
			a=sc.nextInt();
			b=sc.nextInt();
			a--;b--;
			if(a<n && b<arr[a].size() && a>=0 && b>=0)
			    System.out.println(arr[a].get(b));
			else
				 System.out.println("ERROR!");
		}
		sc.close();
	}
}
