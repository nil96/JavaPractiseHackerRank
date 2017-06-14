//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Map{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      HashMap<String,Integer> map = new HashMap<String,Integer>();
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         Integer phone=new Integer(in.nextInt());
         map.put(name, phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         Integer z=map.get(s);
         if(z==null)
         {
        	 System.out.printf("Not found\n");
         }
         else
         {
        	 System.out.println(s+"="+z);
         }
      }
      in.close();
   }
}

