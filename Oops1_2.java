import java.io.*;
import java.util.*;
public class Oops1_2
{
	public static void main(String[] args)
    throws Exception, IOException 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Customer Details");
        
        System.out.println("Enter the name");
        String customerName=sc.nextLine();
        
        System.out.println("Enter the email");
        String customerEmail=sc.nextLine();
        
        System.out.println("Enter the type");
        String customerType=sc.nextLine();
        
        System.out.println("Enter the location");
        String customerAddress=sc.nextLine();
        
        Customer ob=new Customer(customerName,customerEmail,
        customerType,customerAddress);
        ob.displayDetails();
	}
}


public class Customer
{
    public String customerName;
    public String customerEmail;
    public String customerType;
    public String customerAddress; 
    
    Customer(String customerName, String customerEmail,
    String customerType, String customerAddress)
    {
        this.customerName=customerName;
        this.customerEmail=customerEmail;
	    this.customerType=customerType;
	    this.customerAddress=customerAddress;
    }
	public void displayDetails()
    {
        System.out.println("Name: "+customerName);
        System.out.println("E-mail: "+customerEmail);
        System.out.println("Type: "+customerType);
        System.out.println("Location: "+customerAddress);
	}	
}
