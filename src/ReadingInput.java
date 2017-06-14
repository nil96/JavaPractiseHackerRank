import java.util.*;
public class ReadingInput {
   public static void main(String string[])
   {
	   Scanner scanner = new Scanner(System.in);
	   int i;
	   for(i=0;i<3;i++)
	   {
	      int myInt = scanner.nextInt();
	      System.out.println(myInt);
	   }
	   scanner.close();
   }
   
}
