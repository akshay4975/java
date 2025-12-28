import java.util.Scanner;
import java.io.IOException;
class DataBaseConnection{
    private final String DATA_BASE_CONNECTION;
    private final String TABLE_NAME;
    private final String USER;
    private final String PASSWORD;
    private static DataBaseConnection obj;
    private DataBaseConnection(){

    }
    {
        this.DATA_BASE_CONNECTION=System.getenv("dataBaseName");
        this.TABLE_NAME=System.getenv("tableName");
        this.USER=System.getenv("user");
        this.PASSWORD=System.getenv("pass");

    }

    public void getConnection(String url, String user, String pass){
        System.out.println("\n Connnection Successfull \n");
    }

    public static DataBaseConnection getInstance(){
        if(obj != null){
            return obj;
        }
        obj = new DataBaseConnection();
        return obj;
    }


}

class UserAccount{
    String name;
    String password;
    String email;
    long conatact;
    String dob;

    UserAccount(String name, String password, String email, long contact, String dob){
        super();
        this.name = name;
        this.password = password;
        this.email = email;
        this.conatact = contact;
        this.dob = dob;
    }

    public void displayUserAccount(){
        System.out.println("\n USER INFO");
        System.out.println("Name :"+name);
        System.out.println("Pssword : "+password);
        System.out.println("Email : "+ email);
        System.out.println("Contact : "+conatact);
        System.out.println("DOB : "+dob);
    }

}

class Facebook{
    UserAccount user = null;

    {
        System.out.println("DEfore App launch DB should be conn");
        DataBaseConnection obj = DataBaseConnection.getInstance();
        String dataBaseName = System.getenv("user");
        String url = "jdbc:mysql://localhost:3306/"+dataBaseName;
        String user = System.getenv("user");
        String pass = System.getenv("pass");
        obj.getConnection(url, user, pass);


    }

    public void login(){
        if(user == null){
            System.out.println("User Account not created");
            return;
        }

        System.out.println("*** Login Module ***");
         System.out.println("Username : ");
         String username = new Scanner(System.in).next();
          System.out.println("Password : ");
          String password = new Scanner(System.in).next();


          String envUname = System.getenv("uname");
          String envUpass = System.getenv("upass");

          if (username.equals(envUname)&& password.equals(envUpass)) {
            System.out.println("Login successful");

            System.out.println("Do you want to save yout login cred");
            System.out.println("Yes/No");
            String resp = new Scanner(null)
          }
    }
}
