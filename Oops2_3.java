
import java.util.Scanner;


public class Oops2_3
 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of Item Type");
        int total = sc.nextInt();
        sc.nextLine();
        
        ItemType[] itemtype = new ItemType[total];
        
        for(int i=0;i<total;i++){
            System.out.println("Enter the Item Type "+(i+1)+" Name");
            String name = sc.nextLine();
            System.out.println("Enter the Deposit Amount");
            Double deposit = sc.nextDouble();
            System.out.println("Enter the Cost per day");
            Double costPerDay = sc.nextDouble();
            sc.nextLine();
            ItemType temp = new ItemType(name,deposit,costPerDay);
            
            itemtype[i] = temp;
            
            System.out.println("New item added successfully");
            
        }
        ItemTypeBO itbo = new ItemTypeBO();
        itbo.display(itemtype);
        
        System.out.println("Enter the Name of the item to be searched");
        String toBeSearched = sc.nextLine();
        
        
        itbo.search(toBeSearched,itemtype);
        
 }
}

*********************************************************
*********************************************************

public class ItemTypeBO {
    
 public void add(ItemType n1,ItemType[] itemTypeArray,Integer index){
        
  for(int i =9;i>=index;i--){
         itemTypeArray[i+1] = itemTypeArray[i];   
  }
        
        itemTypeArray[index] = n1;
 }
    
 public void search(String search,ItemType[] itemTypeArray){
        int flag=0;
        for(int i=0;i<itemTypeArray.length;i++){
            if((itemTypeArray[i].getName()).compareTo(search)==0){
                flag=1;
                System.out.println("Searched Item Type is:");
                System.out.println("Name:"+itemTypeArray[i].getName());
                System.out.println("Deposit Amount:"+itemTypeArray[i].getDeposit());
                System.out.println("Cost Per Day:"+itemTypeArray[i].getCostPerDay());
            }
        }
        
        if(flag == 0){
            System.out.println("Searched Item Type not found");
        }
  
 }
 public void display(ItemType[] itemTypeArray){
  
        for(int i=0;i<itemTypeArray.length;i++){
            
            System.out.println("Item Type Number "+(i+1)+":");
            System.out.println("Name:"+itemTypeArray[i].getName());
            System.out.println("Deposit Amount:"+itemTypeArray[i].getDeposit());
            System.out.println("Cost Per Day:"+itemTypeArray[i].getCostPerDay());
        }
        
 }
}

************************************************************
************************************************************

public class ItemType {
 private String name;
    private Double deposit;
    private Double costPerDay;
    
    public ItemType(String name,Double deposit,Double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }
    
}