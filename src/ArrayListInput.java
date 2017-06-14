import java.lang.*;
import java.util.*;
public class ArrayListInput {
	public static void main(String args[])
	{
		ArrayList arr = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int z=sc.nextInt();
			//Integer obj=new Integer(z);
			arr.add(z);
		}
		int q = sc.nextInt();
		for(int i=0;i<q;i++)
		{
			String case1=sc.next();
			if(case1.equals("Insert"))
			{
				int a,b;
				a=sc.nextInt();
				b=sc.nextInt();
				//Integer obj=new Integer(b);
				arr.add(a,b);
			}
			else
			{
			    int c=sc.nextInt();
			    arr.remove(c);
			}
		}
		for(int i=0;i<arr.size();i++)
		{
			int temp =  (int)arr.get(i);
			System.out.printf("%d ", temp);
		}
		sc.close();
	}

}
