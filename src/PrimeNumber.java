import java.lang.*;
import java.math.BigInteger;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	BigInteger a=sc.nextBigInteger();
    	boolean flag=a.isProbablePrime(100);
    	if(flag)
    		System.out.println("prime");
    	else
    		System.out.println("not prime");
    	sc.close();
    }
	
}
