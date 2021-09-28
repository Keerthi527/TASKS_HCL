import java.io.*; 
import java.util.*;
public class SumOfEvenFibo 
{ 
    public static void main (String[] args)  
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        long f1 = 0, f2 = 2; 
        long s = f1 + f2; 
        long f3=0;
        while (f2 <= l) 
        {
            f3 = 4 * f2 + f1;
            if (f3 > l) 
                break;
            f1 = f2; 
            f2 = f3; 
            s += f2; 
        } 
        System.out.println(s); 
    } 
} 
 