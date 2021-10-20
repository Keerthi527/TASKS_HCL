import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Oops1_4 {
    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    public static void main(String []args) throws IOException
	{
		String name = null,street = null,city = null;
		int pincode = 0,i=0,n;
		boolean result = false ;
		Customer []data = new Customer[100];
        System.out.println("Enter number of customers");
        n = Integer.parseInt(br.readLine());
		for(i=0;i<n;i++){
			System.out.println("Enter the Customer Details "+(i+1));
			System.out.println("Enter the name");
			name = br.readLine();
			System.out.println("Enter the Address Details");
			System.out.println("Enter the street");
			street = br.readLine();
			System.out.println("Enter the city");
			city = br.readLine();
			System.out.println("Enter the pincode");
			pincode = Integer.parseInt(br.readLine());
			data[i] = new Customer(name,new Address(street,city,pincode));
		}
		for(int j=0;j<n;j++){
			for(int k=0;k<n && k!=j;k++){
				result |= data[j].equals(data[k]);
				if(result){
                    k=i+1;j=i+1;
					break;
				}
			}
		}
		if(result)
		System.out.println("\nThe identical Customer Details are\n"+"1"+")"+
        "Name:"+name+"\n"+"Address:"+street+","+city+"-"+pincode);
		else
		System.out.println("\nNo duplicate details");
	}
}

import java.text.*;
import java.util.Objects;
class Address{
    private String street;
    private String city;
    private int pincode;
    public Address()
    {
    }
    public Address(String street,String city,int pincode)
    {
        this.street=street;
        this.city=city;
        this.pincode=pincode;
    }
    public boolean equals(Object ob)
    {
        if(this==ob)
        return true;
        if(this==null)
        return false;
        if (getClass()!=ob.getClass())
        return false;
        Address oth=(Address) ob;
        return Objects.equals(city,oth.city)&&pincode==oth.pincode&&
        Objects.equals(street,oth.street);
    }
    public String toString()
    {
        return "Address:"+street+","+city+"-"+pincode;
    }
}

import java.util.Objects;
import java.util.*;
public class Customer
{
    private String name;
    private Address address;
    static private int i=0;
    public Customer(){}
    public Customer(String name,Address address)
    {
        this.name=name;
        this.address=address;
    }
    public boolean equals(Object ob)
     {
        if(this==ob)
        return true;
        if(this==null)
        return false;
        if(getClass()!=ob.getClass())
        return false;
        Customer oth=(Customer) ob;
        return Objects.equals(address,oth.address)&&
        Objects.equals(name,oth.name);
    }
    public String toString()
    {
        return ++i+")"+"Name:"+name+"\n"+address;
    }
}
