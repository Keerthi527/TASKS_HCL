public class Mutiples35
{
    public static void main(String args[])
    {
        int n=1000;
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(i%3==0||i%5==0)
            {
                s=s+i;
            }
        }
         System.out.println(s);
    }
}