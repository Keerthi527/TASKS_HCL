import java.io.*;
import java.util.*;
public class Pythagorean_triplet
{
    static void pythagoreanTriplet(int n)
    {
        for (int i = 1; i <= n / 3; i++)
        {
            for (int j = i + 1; j <= n / 2; j++)
            {
                int k = n - i - j;
                if (i * i + j * j == k * k)
                {
                    System.out.print(i + ", "+j + ", " + k);
                    return;
                }
            }
        }
        System.out.print("No Triplet");
    }
    public static void main(String arg[])
    {
        int n = 1000;
        pythagoreanTriplet(n);
    }
}