import java.util.*;
public class StaticLearning {
   
	public 
    static int B,H;
	static boolean flag;
	static 
	{
		flag=false;
		Scanner sc = new Scanner(System.in);
		B=sc.nextInt();
		H=sc.nextInt();
		if(B*H>0)
		  flag=true;
		else
		 System.out.println("java.lang.Exception: Breadth and height must be positive");	
	   sc.close();
	}
	public static void main(String string[])
	{
		if(flag)
		{
			int area = B*H;
			System.out.print(area);
		}
	}
}
