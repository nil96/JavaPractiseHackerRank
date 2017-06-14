import java.lang.*;
import java.util.Scanner;
import java.math.*;
public class BigNumber {
  
	public static void main(String str[])
	{
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		String b1 = sc.next();
		BigInteger a = new BigInteger(a1);
		BigInteger b = new BigInteger(b1);
		BigInteger sum =a.add(b);
		BigInteger mul =a.multiply(b);
		System.out.println(sum);
		System.out.println(mul);
	}
}
