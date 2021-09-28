import java.io.*;
import java.util.*;
 public class SumOfNaturalNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m= (n * (n + 1) * (2 * n + 1)) / 6;
        System.out.println(m);
        int i, sum = 0;  
        for(i = 1; i <= n; ++i)  
        { 
            sum = sum + i;
        }
        int s=sum*sum;
        System.out.println(s);
        int d=s-m;
        System.out.println(d);
    }
}