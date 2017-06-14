import java.math.BigDecimal;
import java.util.*;
import java.math.*;

public class BigNumberSort{
 
   public static void main(String args[])
   {
	  class BigNumberSort1
	  {
		  public
		   BigDecimal a;
		   String s; 
		   
	  }
	  Scanner sc =  new Scanner(System.in);
	   int n= sc.nextInt();
	   BigNumberSort1[] arr= new BigNumberSort1[n];
	   for(int i=0;i<n;i++){
		   arr[i]=new BigNumberSort1();
		   arr[i].s = sc.next();
           BigDecimal m = new BigDecimal((arr[i].s).toCharArray());
           arr[i].a= m;
	   }
	   Arrays.sort(arr,0,n,new Comparator<BigNumberSort1>()
			   {
		               public int compare(BigNumberSort1 x,BigNumberSort1 y)
		               {
		            	  BigDecimal z= y.a;
		            	  return (z.compareTo(x.a));
		            	  // return 1;
		            	 // return 0;
		               }
			   });
	   for(BigNumberSort1 temp :arr)
	   {
		   System.out.println(temp.s);
	   }
	   sc.close();
	  
	   //System.out.println(a);
   }
	
}