import java.lang.*;
import java.util.Scanner;
public class Token {
  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String buff=sc.nextLine();
		buff=buff.replaceAll(",", " ");
		buff=buff.replaceAll("'", " ");
		buff=buff.replaceAll("@", " ");
		buff=buff.replaceAll("_", " ");
		buff=buff.replaceAll("/."," ");
		String fg = "?"; 
		buff=buff.replaceAll(fg, " ");
		buff=buff.replaceAll("!", " ");
		String[] x = buff.split(" ");
		for(String str: x)
			System.out.println(str);
		
	}
}
