public class Example1{
    public static void main(String[]args){
        GooglePlayStore googlePlayStore=new GooglePlayStore("Akshay","Nabage","abc@gamil.com","male",987654321L,"12/12/2003","Abc123","abcd",123);
       googlePlayStore.displayGoogle();
       
       System.out.println();

        googlePlayStore.displayGooglePlayStore();

    }
}
class Google{
    String firstName;
    String lastName;
    String email;
    String gender;
    long contact;
    String dob;
    String password;

    public Google(String firstName,String lastName,String email,
        String gender,long contact,String dob,String password){
     
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.gender=gender;
        this.contact=contact;
        this.dob=dob;
        this.password=password;
    }
    public void displayGoogle(){
        System.out.println("Google   FistName:"+firstName+"Last Name:"+lastName+
        ",email id"+email+", gender"+gender+"contact"+contact+",DOB"+dob+",password"+password);
    }

}
class GooglePlayStore extends Google{

    String gameApp;
    int noOfApp;

    public GooglePlayStore(String firstName,String lastName,String email,
        String gender,long contact,String dob,String password,String gameApp,int noOfApp){

            super(firstName,lastName,email,gender,contact,dob,password);
            this.gameApp=gameApp;
            this.noOfApp=noOfApp;
            
        }
        public void displayGooglePlayStore(){
            System.out.println("Game Apps:"+gameApp+"No oF Apps "+noOfApp);
        }
    

}


class Googlepay extends Google{

    String loginId;
    int upiPin;

    public GooglePay(String firstName,String lastName,String email,
        String gender,long contact,String dob,String password,String loginId,int upiPin){

            super(firstName,lastName,email,gender,contact,dob,password);
            this.loginId=loginId;
            this.upiPin=upiPin;
            
        }
        public void displayGooglePay(){
            System.out.println("login id:"+gameApp+"No oF Apps "+noOfApp);
        }
    

}