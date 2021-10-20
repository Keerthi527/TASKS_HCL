import java.util.*;
import java.io.*;

public class Oops1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Address a1=new Address(null,null,0);
        Customer c1=new Customer("Yuva",a1);
        
        
        System.out.println("Enter the name");
        c1.setName(sc.nextLine());

        System.out.println("Enter the Address Details");
        
        System.out.println("Enter the street");
        a1.setStreet(sc.nextLine());
        
        System.out.println("Enter the city");
        a1.setCity(sc.nextLine());
        
        System.out.println("Enter the pincode");
        a1.setPincode(sc.nextInt());
        
        System.out.println(c1);
        
    }
}
class Customer{
    String name;
    Address address;

Customer (){
}

Customer(String name, Address address){
    this.name = name;
    this.address = address;
}
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return name+" "+address;
    }
}
class Address  {
    String street, city;
    int pincode;
    Address () {
    }
    Address (String street, String city, int pincode) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }
    public String getStreet()
    {
        return street;
    }
    public void setStreet(String street)
    {
        this.street=street;
    }
     public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
     public int getPincode()
    {
        return pincode;
    }
    public void setPincode(int pincode)
    {
        this.pincode=pincode;
    }
    public String toString()
    {
        return street+","+city+"-"+pincode;
    }
}