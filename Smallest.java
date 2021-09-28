public class Smallest
{
    public static void main(String[] args)
    {
    int counter = 1, i = 2, val = 0;
    while (true)
    {
        if ( counter % i == 0 )
        {
            i += 1;
            if(i==20)
            val = counter;
        }
        else
        {
            counter++ ;
            i = 2; 
        }
        if(i==20) 
        break;
    }
    System.out.println(""+counter );
    }
}