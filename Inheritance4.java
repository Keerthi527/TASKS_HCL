TiketBooking
public class TicketBooking {
     private String stageEvent;
        private String customer;
   private int noOfSeats;
   //Constructors
   public TicketBooking(String stageEvent,String customer,int noOfSeats){
       this.stageEvent = stageEvent;
       this.customer = customer;
       this.noOfSeats=  noOfSeats;
   }
        //Getters and Setters
   
   public String getStageEvent(){
       return stageEvent;
   }
   public void setStageEvent(String stageEvent){
       this.stageEvent =stageEvent;
   }
   
   public String getCustomer(){
       return customer;
   }
   public void setCustomer(String customer){
       this.customer = customer;
   }
   
   public int noOfSeats(){
       return noOfSeats;
   }
   public void noOfSeats(int noOfSeats){
       this.noOfSeats = noOfSeats;
   }
   
   //Methods
   public void makePayment(Double amount){
       System.out.println("Amount " +amount +"paid in cash");
   }
   
   public void makePayment(String walletNumber,Double amount){
       System.out.println("Amount" +amount +"paid using wallet number "+walletNumber);
   }
        public void makePayment(String creditCard,String ccv,String name,Double amount){
            System.out.println("Holder name: "+name +"\nAmount "+amount +" paid using "+creditCard+" card"+"\nCCV:"+ccv);
   }
   @Override
   public String toString(){
       return "Stage event :"+stageEvent+"\nCustomer:"+ customer+ "\nNumber of seats: "+ noOfSeats;
   }
   
}
     --------------------------------------------------------------------
Main

import java.io.*;
import java.util.*;
public class Inheritance4 {
public static void main(String[] args) throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Booking details");
    String input=br.readLine();
StringTokenizer str=new StringTokenizer(input,",");
TicketBooking ticket=new TicketBooking(input, input, 0);

System.out.println("Payment mode");
System.out.println("1.Cash payment\n2.Wallet payment\n3.Credit card payment");
   Integer choice=Integer.parseInt(br.readLine());
if(choice==1)
{
while(str.hasMoreTokens())
{
String stageEvent=str.nextToken();
String customer=str.nextToken();
Integer noOfSeats=Integer.parseInt(str.nextToken());
TicketBooking t = new TicketBooking(stageEvent, customer, noOfSeats);
System.out.println("Enter the amount");
Double amount=Double.parseDouble(br.readLine());


System.out.println("Stage event:"+stageEvent+"\nCustomer:"+customer+"Number of seats:"+noOfSeats);
ticket.makePayment(amount);
break;
}

           
}
else if(choice==2)
{
while(str.hasMoreTokens()) {
String stageEvent = str.nextToken();
String customer =str.nextToken();
Integer noOfSeats = Integer.parseInt(str.nextToken());
TicketBooking t1 = new TicketBooking(stageEvent,customer,noOfSeats);
System.out.println("Enter the amount");
double amount =Double.parseDouble(br.readLine());
System.out.println("Enter the wallet number");
String s1 =br.readLine();
System.out.println("Stage event:"+stageEvent);
System.out.println("Customer :"+customer);
System.out.println("Number of seats :"+noOfSeats);
System.out.println("Amount"+amount+" paid using wallet number "+s1);
break;
}

}
else if (choice==3)
{
while(str.hasMoreTokens()) {
String stageEvent = str.nextToken();
String customer =str.nextToken();
Integer noOfSeats = Integer.parseInt(str.nextToken());
TicketBooking t1 = new TicketBooking(stageEvent,customer,noOfSeats);
System.out.println("Enter cardholder name");
String s1 =br.readLine();
System.out.println("Enter the amount");
double amount =Double.parseDouble(br.readLine());
System.out.println("Enter the credit card type");
String s2 =br.readLine();
System.out.println("Enter the CCV number");
String s3 =br.readLine();


System.out.println("Stage event:"+stageEvent);
System.out.println("Customer :"+customer);
System.out.println("Number of seats :"+noOfSeats);
System.out.println("Holder name: "+s1);
System.out.println("Amount"+amount+" paid using "+s2+"card");
System.out.println("CCV :"+s3);
break;

}
           
}
else
{
System.out.println("Invalid choice");
}

}

}