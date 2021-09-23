import java.io.*;
import java.util.*;
public class Function
{
   public static void main(String args[])
   {
       int r=0,r1=0,a=50,b=40;
       Function obj= new Function();
       r=obj.findMax(a,b);
       r1=obj.findMin(a,b);
       System.out.println("Maximum of two numbers is "+r);
       System.out.println("Minimum of two numbers is "+r1);
   }
   public static int findMax(int a,int b)
   {
      if(a>b)
      {
      return a;
      }
      else
      {
          return b;
      }
   }
      public static int findMin(int a,int b)
   {
      if(a<b)
      {
        return a;
      }
      else
      {
        return b;
      }
   }
}