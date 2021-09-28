import java.io.*;
import java.util.*;
public class PrimeNumber
{
    public static void main(String[] args)
 {
        int counter = 0;
        int primeNum = 0;
        for (int num = 2; num < 10000000; num++) 
	{
            boolean isPrime = true;
            for (int factor = 2; factor < num; factor++) 
	    {
                if (num % factor == 0)
		{
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNum = num;
                counter++;
            }
            if (counter == 10001) {
                break;
            }
        }
        System.out.println(primeNum);
    }
}