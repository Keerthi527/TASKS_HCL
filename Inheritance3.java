public class SilverStall {
//fill your code here
protected String name;
protected String detail;
protected String owner;
protected Integer cost;

public SilverStall(){}
public SilverStall(String name, String detail, String owner, Integer cost){
    this.name=name;
    this.detail=detail;
    this.owner=owner;
    this.cost=cost;
}
public String getName(){
     return name;  
    }
    public void setName(String name){
    this.name=name;
    }
    public String getDetail(){
     return detail;  
    }
    public void setDetail(String detail){
    this.detail=detail;
    }
    public String getOwner(){
     return owner;  
    }
    public void setOwner(String owner){
    this.owner=owner;
    }
    public int getCost(){
     return cost;  
    }
    public void Cost(int cost){
}
public int totalCost(){
return cost;    
}
}
--------------------------------------------------------
Main
import java.io.*;
    import java.util.*;
public class Inheritance3 {
public static void main(String[] args) throws IOException
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Choose Stall Type");
       System.out.println("1.Silver Stall\n2.Gold Stall\n3.Platinum Stall");
       Integer choice=Integer.parseInt(br.readLine());
if(choice==1)
       {
       System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");
String input=br.readLine();
StringTokenizer str=new StringTokenizer(input,",");
//TicketBooking ticket=new TicketBooking(null,null,0);
while(str.hasMoreTokens())
{
String name=str.nextToken();
String details=str.nextToken();
           String owner=str.nextToken();
Integer cost=Integer.parseInt(str.nextToken());
       
SilverStall s=new SilverStall(name,details,owner,cost);
               System.out.println("Stall Name:"+name+"\nDetails:"+details+"\nOwner Name:"+owner+
                    "\nTotal Cost:"+s.totalCost());
               break;
}
       }
if(choice==2)
       {
       System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");
String input=br.readLine();
StringTokenizer str=new StringTokenizer(input,",");
//TicketBooking ticket=new TicketBooking(null,null,0);
while(str.hasMoreTokens())
{
String name=str.nextToken();
String details=str.nextToken();
           String owner=str.nextToken();
Integer cost=Integer.parseInt(str.nextToken());
Integer tvSet=Integer.parseInt(str.nextToken());
GoldStall g=new GoldStall(name,details,owner,cost,tvSet);
               System.out.println("Stall Name:"+name+"\nDetails:"+details+
                    "\nOwner Name:"+owner+"\nTV Sets:"+tvSet+"\nTotal Cost:"+g.totalCost());
               break;
}
       }
if(choice==3)
       {
       System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
String input=br.readLine();
StringTokenizer str=new StringTokenizer(input,",");
//TicketBooking ticket=new TicketBooking(null,null,0);
while(str.hasMoreTokens())
{
String name=str.nextToken();
String details=str.nextToken();
           String owner=str.nextToken();
Integer cost=Integer.parseInt(str.nextToken());
Integer tvSet=Integer.parseInt(str.nextToken());
Integer projector=Integer.parseInt(str.nextToken());
PlatinumStall p=new PlatinumStall(name,details,owner,cost,tvSet,projector);
               System.out.println("\nStall Name:"+name+"\nDetails:"+details+"\nOwner Name:"+owner+
                    "\nTV Sets:"+tvSet+"\nProjectors:"+projector+"\nTotal Cost:"+p.totalCost());
               break;
}
       }
}
}
---------------------------------------------------------------------------------
Goldstall
public class GoldStall extends SilverStall{
    //fill your code here
    private Integer tvSet;

public GoldStall(){
}
public GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet){
    this.name=name;
    this.detail=detail;
    this.owner=owner;
    this.cost=cost;
    this.setTvSet(tvSet);
}
@Override
public int totalCost()
{
int total =cost+(getTvSet() * 100);
return total;
}
public Integer getTvSet() {
return tvSet;
}
public void setTvSet(Integer tvSet) {
this.tvSet = tvSet;
}
}

------------------------------------------------------------------------
Platninum Stall
public class PlatinumStall extends GoldStall{
    //fill your code here
    private Integer projector;

public PlatinumStall(){}
public PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector){
    this.name=name;
    this.detail=detail;
    this.owner=owner;
    this.cost=cost;
    this.setTvSet(tvSet);
    this.projector=projector;
}
@Override
public int totalCost()
{
int total =cost+((getTvSet() * 100)+(projector * 500));
return total;
}
}
