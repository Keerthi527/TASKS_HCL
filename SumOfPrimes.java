import java.io.*;
import java.util.*;
public class SumOfPrimes  
{  
public static void main(String args[])   
{  
int number = 1, count, sum = 0;  
//executes until the condition becomes false  
while(number <= 10)  
{  
count = 0;  
int i = 2;  
while(i <= number/2 )  
{  
if(number % i == 0)  
{  
count++;  
break;  
}  
i++;  
} //end of while  
if(count == 0 && number != 1 )            
{  
sum = sum + number;  
} 
number++;  
} 
System.out.println("The Sum of Prime Numbers is " + sum);  
} 
} 