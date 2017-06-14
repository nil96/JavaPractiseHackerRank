import java.util.*;
public class Eof {
    public static void main(String string[])
    {
    	Scanner sc =  new Scanner(System.in);
    	int c=1;
    	while(sc.hasNext())
    	{
    		String x = sc.nextLine();
    		x = "" + c + " " + x;
    		c++;
    		System.out.println(x);
    	}
    	sc.close();
    }
}
