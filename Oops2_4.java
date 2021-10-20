import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Oops2_4 {

 public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Username :");
        String username = bf.readLine();
        System.out.println("Password :");
        String password = bf.readLine();
        
        UserBO u = new UserBO();
        boolean what = u.validate(username,password);
        
        if(what){
            System.out.println("Login Successfull");
        }
        else{
            System.out.println("Incorrect username/password");
        }
  

 }

}
**************************************
**************************************

public class UserBO {
 public User[] getUsers() {
  User[] users = new User[5];

  users[0] = new User(1, "Louis", "rxfsuzA2345");
  users[1] = new User(2, "Messie", "hpphmf1:");
  users[2] = new User(3, "Steve", "opefKt");
  users[3] = new User(4, "Kallis", "23456778");
  users[4] = new User(5, "Wipro", "A$%");

  return users;
 }

 private String encryptPassword(String value) {
        char[] temp = value.toCharArray();
        char[] newArray = new char[temp.length];
        
        for(int i=0;i<temp.length;i++){
            int asc = temp[i];
            int newAsc = asc+1;
            newArray[i] = (char)newAsc;
        }
        
  String returnString = String.valueOf(newArray);
        
        return returnString;
 }


 public boolean validate(String username, String password) {
        User[] usersArray = getUsers();
        int flag=0;
  for(int i=0;i<usersArray.length;i++){
         if((usersArray[i].getUsername()).compareTo(username)==0){
                if((usersArray[i].getPassword()).compareTo(encryptPassword(password))==0){
                    flag = 1;
                }   
         }   
  }
        
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
 }
}

***********************************************
***********************************************

public class User {
    private int id;
    private String username;
    private String password;
    
    
    public User(Integer id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    public User(){
        this(null,null,null);
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    
    
}

