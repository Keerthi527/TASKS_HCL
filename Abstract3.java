StageEvent



public class StageEvent extends Event {
   
private int noOfShows;
private double costPerShow;
//Constructors
public StageEvent(String name, String detail, String type, String organiser, int noOfShows, double costPerShow) {
super(name, detail, type, organiser);
this.noOfShows = noOfShows;
this.costPerShow = costPerShow;
}
//Getters and Setters
public int getNoOfShows() {
return noOfShows;
}
public void setNoOfShows(int noOfShows) {
this.noOfShows = noOfShows;
}
public double getCostPerShow() {
return costPerShow;
}
public void setCostPerShow(double costPerShow) {
this.costPerShow = costPerShow;
}
@Override
double calculateAmount() {
// TODO Auto-generated method stub
return noOfShows*costPerShow;
}






}
-----------------------------------------------------------
Event
public abstract class Event {
    protected String name;
protected String detail;
protected String type;
protected String organiser;

//Constructer
public Event(String name, String detail, String type, String organiser) {
super();
this.name = name;
this.detail = detail;
this.type = type;
this.organiser = organiser;
}

//Getters and Setters
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}

public String getDetail() {
return detail;
}
public void setDetail(String detail) {
this.detail = detail;
}

public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}

public String getOrganiser() {
return organiser;
}
public void setOrganiser(String organiser) {
this.organiser = organiser;
}


abstract double calculateAmount();





}
--------------------------------------------------------------
Exhibition

public class Exhibition extends Event {
   
private int noOfStalls;
private double rentPerStall;
//Constructors
public Exhibition(String name, String detail, String type, String organiser, int noOfStalls, double rentPerStall) {
super(name, detail, type, organiser);
this.noOfStalls = noOfStalls;
this.rentPerStall = rentPerStall;
}

//getters and Setters
public int getNoOfStalls() {
return noOfStalls;
}
public void setNoOfStalls(int noOfStalls) {
this.noOfStalls = noOfStalls;
}
public double getRentPerStall() {
return rentPerStall;
}
public void setRentPerStall(double rentPerStall) {
this.rentPerStall = rentPerStall;
}

@Override
double calculateAmount() {
// TODO Auto-generated method stub
return noOfStalls*rentPerStall;
}

}
----------------------------------------------------------
Main
import java.util.Scanner;

public class Abstract3 {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in).useDelimiter("\n");
System.out.println("Enter your choice\n1.Exhibition\n2.StageEvent");
String eventType=sc.next();

Event event=null;
if(Integer.parseInt(eventType.trim())==1){
System.out.println("Enter the details in CSV format");
String input=sc.next();
String[] inputs=input.split(",");

event=new Exhibition(inputs[0].trim(), inputs[1].trim(), inputs[2].trim(), inputs[3].trim(), Integer.parseInt(inputs[4].trim()), Double.parseDouble(inputs[5].trim()));
            System.out.println("Exhibition Details");
            System.out.println("Event Name:"+event.name);
       System.out.println("Detail:"+event.detail);
   System.out.println("Type:"+event.type);
   System.out.println("Organiser Name:"+event.organiser);
   System.out.println("Total Cost:"+String.format("%.1f", event.calculateAmount()));
}
else if(Integer.parseInt(eventType.trim())==2){
System.out.println("Enter the details in CSV format");
String input=sc.next();
String[] inputs=input.split(",");
event=new StageEvent(inputs[0].trim(), inputs[1].trim(), inputs[2].trim(), inputs[3].trim(), Integer.parseInt(inputs[4].trim()), Double.parseDouble(inputs[5].trim()));
            System.out.println("Stage Event Details");
            System.out.println("Event Name:"+event.name);
            System.out.println("Detail:"+event.detail);
   System.out.println("Type:"+event.type);
   System.out.println("Organiser Name:"+event.organiser);
   System.out.println("Total Cost:"+String.format("%.1f", event.calculateAmount()));
}
else{
System.out.println("Invalid choice");
}

}
}
