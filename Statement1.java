import java.util.*;
public class Statement1
{
          private ArrayList<Integer> list=new ArrayList<Integer>();
          public ArrayList<Integer> storeEvenNumbers(int N)
          {
                     list=new ArrayList<Integer>();
                     for(int i=2;i<=N;i++)
                     {
                          if(i%2==0)
                          list.add(i);
                     }
                     return list;
          }
          public ArrayList<Integer> printEvenNumbers()
          {
                  ArrayList<Integer> newList=new ArrayList<Integer>();
                  for(int num : list)
                  {
                        newList.add(num*2);
                        System.out.println(num*2);
                  }
                  return newList;
           }


           public static void main(String[] args)
           {
                     Statement1 s=new Statement1();
                     s.storeEvenNumbers(10);
                     s.printEvenNumbers();
           }
}