import java.util.*;
public class LargetPrimeFactor
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int i;
        long number=sc.nextLong();
        long copyOfInput = number; 
        for (i = 2; i <= copyOfInput; i++) 
        { 
            if (copyOfInput % i == 0)
            { 
                copyOfInput /= i; 
                i--; 
            } 
        }
        System.out.println(i);
    }
}
