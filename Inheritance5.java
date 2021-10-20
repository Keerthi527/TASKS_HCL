Stage Event
public class StageEvent extends Event{
private Integer noOfShows;
private Integer noOfSeatsPerShow;
public StageEvent(String name, String detail, String ownerName,Integer noOfShows,Integer noOfSeatsPerShow)
{
super(name,detail,ownerName);
this.noOfShows = noOfShows;
this.noOfSeatsPerShow = noOfSeatsPerShow;
}
public double projectedRevenue()
{
return noOfShows*noOfSeatsPerShow*50.0;
}
}--------------------------------------------------

Main
import java.io.IOException;
import java.util.Scanner;

 

public class Inheritance5 {
    public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the name of the event:");
         String name=sc.nextLine();
         System.out.println("Enter the detail of the event:");
         String detail=sc.nextLine();
         System.out.println("Enter the owner name of the event:");
         String owner=sc.nextLine();      
         System.out.println("Enter the type of the event:\n1.Exhibition\n2.StageEvent");
         int n=sc.nextInt();
         switch (n)
         {
            case 1:
                System.out.println("Enter the number of stalls:");
                int stall=sc.nextInt();
                Event e=new Exhibition(name,detail,owner,stall);
                System.out.println("The projected revenue of the event is "+e.projectedRevenue());
                break;
            case 2:
                System.out.println("Enter the number of shows:");
                int show=sc.nextInt();
                System.out.println("Enter the number of seats per show:");
                int seat=sc.nextInt();
                Event s=new StageEvent(name,detail,owner,show,seat);
                System.out.println("The projected revenue of the event is "+s.projectedRevenue());
                break;
         }
    }
}
----------------------------------------------------------------------------------------------
exhibition

public class Exhibition extends Event{

private Integer noOfStalls;
public Exhibition()
{
}
public Exhibition(String name, String detail, String ownerName,Integer noOfStalls)
{
super(name,detail,ownerName);
this.name = name;
this.detail = detail;
this.ownerName = ownerName;
this.noOfStalls = noOfStalls;
}
@Override
public double projectedRevenue()
{
double revenue = noOfStalls * 10000;
return revenue;
}
}
------------------------------------------------------------------------------
Event

public abstract class Event {
protected String name;
protected String detail;
protected String ownerName;
public Event(){
}
public Event(String name, String detail, String ownerName)
{
this.name = name;
this.detail = detail;
this.ownerName = ownerName;
}
public double projectedRevenue(){
return 0.0;
}
}