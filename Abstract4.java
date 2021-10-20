public class ExecutiveStall implements Stall{
    private String stallName;
private int cost;
private String ownerName;
private int screen;

//Constructors
public ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
super();
this.stallName = stallName;
this.cost = cost;
this.ownerName = ownerName;
this.screen = screen;
}

//getter and Setters
public String getStallName() {
return stallName;
}
public void setStallName(String stallName) {
this.stallName = stallName;
}
public int getCost() {
return cost;
}
public void setCost(int cost) {
this.cost = cost;
}
public String getOwnerName() {
return ownerName;
}
public void setOwnerName(String ownerName) {
this.ownerName = ownerName;
}
public int getScreen() {
return screen;
}
public void setScreen(int screen) {
this.screen = screen;
}

@Override
public void display() {
System.out.println("Stall Name: "+stallName);
System.out.println("Cost: Rs."+cost);
System.out.println("Owner Name: "+ownerName);
System.out.println("Number of Screens: "+screen);

}

}

-------------------------------------------------------------------
Main
import java.util.*;

public class Abstract4{
    public static void main(String[] args){
        Scanner br = new Scanner(System.in);
        System.out.println("Choose Stall Type");
        System.out.println("1)Gold Stall");
        System.out.println("2)Premium Stall");
        System.out.println("3)Executive Stall");
       
        int type = Integer.parseInt(br.nextLine());
       
        switch(type)
        {
            case 1:
                System.out.println("Enter Stall details in comma-separated(Stall Name, Stall Cost, Owner Name, Number of TV sets)");
                String st1=br.nextLine();
                String[] str1=st1.split(",");
                GoldStall gd = new GoldStall(str1[0],Integer.parseInt(str1[1]),str1[2],Integer.parseInt(str1[3]));
                gd.display();
                break;
           
            case 2:
                System.out.println("Enter Stall details in comma-separated(Stall Name, Stall Cost, Owner Name, Number of Projectors)");
                String st2=br.nextLine();
                String[] str2=st2.split(",");
                PremiumStall pm = new PremiumStall(str2[0],Integer.parseInt(str2[1]),str2[2],Integer.parseInt(str2[3]));
                pm.display();
                break;
           
            case 3:
                System.out.println("Enter Stall details in comma-separated(Stall Name, Stall Cost, Owner Name, Number of Screens)");
                String st3=br.nextLine();
                String[] str3=st3.split(",");
                ExecutiveStall ex = new ExecutiveStall(str3[0],Integer.parseInt(str3[1]),str3[2],Integer.parseInt(str3[3]));
                ex.display();
                break;
               
            default:
                System.out.println("Invalid Stall Type");
                break;
           
        }
              
    }
}

------------------------------------------------------------
GoldStall


public class GoldStall implements Stall{
    private String stallName;
private int cost;
private String ownerName;
private int tvSet;
//Constructors
public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
super();
this.stallName = stallName;
this.cost = cost;
this.ownerName = ownerName;
this.tvSet = tvSet;
}
// Getters and Setters
public String getStallName() {
return stallName;
}
public void setStallName(String stallName) {
this.stallName = stallName;
}
public int getCost() {
return cost;
}
public void setCost(int cost) {
this.cost = cost;
}
public String getOwnerName() {
return ownerName;
}
public void setOwnerName(String ownerName) {
this.ownerName = ownerName;
}
public int getTvSet() {
return tvSet;
}
public void setTvSet(int tvSet) {
this.tvSet = tvSet;
}
@Override
public void display() {
// TODO Auto-generated method stub
System.out.println("Stall Name: "+stallName);
System.out.println("Cost: Rs."+cost);
System.out.println("Owner Name:"+ownerName);
System.out.println("Number of TV sets: "+tvSet);

}





}
------------------------------------
Stall

public abstract interface Stall {
   
abstract void display();

}

-------------------------------------
Premium Stall


public class PremiumStall implements Stall {
    private String stallName;
private int cost;
private String ownerName;
private int projector;


//Constructors

public PremiumStall(String stallName, int cost, String ownerName, int projector) {
super();
this.stallName = stallName;
this.cost = cost;
this.ownerName = ownerName;
this.projector = projector;
}
//Getters and Setters

public String getStallName() {
return stallName;
}
public void setStallName(String stallName) {
this.stallName = stallName;
}

public int getCost() {
return cost;
}
public void setCost(int cost) {
this.cost = cost;
}

public String getOwnerName() {
return ownerName;
}
public void setOwnerName(String ownerName) {
this.ownerName = ownerName;
}

public int getProjector() {
return projector;
}
public void setProjector(int projector) {
this.projector = projector;
}

@Override
public void display() {
System.out.println("Stall Name:"+stallName);
System.out.println("Cost: Rs."+cost);
System.out.println("Owner Name:"+ownerName);
System.out.println("Number of Projectors:"+projector);

}

}