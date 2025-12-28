
// deep copy


public class DriverExample4{

public static void main(String[] args) {
    //College add
    Address collegeAdd=new Address("Vadgaon-Ambegaon main campus","Pune",411046);
    College college=new College("NBNSTIC","nbnstic@gmail.com",987654323L,collegeAdd);

    //Centeres add
    Address centreAdd=new Address("Shivaji NAgar","pune",432153);
    Centres centres=new Centres("SPPU main branch","abcd@gmail.com",1234567890L,centreAdd);


   University oldUniversity=new University("SPPU","sppu@gmail.com",987654321L,college,centres);
    oldUniversity.displayUniversity();
System.out.println("\n copy constructor\n");
    University newUniversity=new University(oldUniversity);
    newUniversity.displayUniversity();

    System.out.println("\n after change in copy constructor \n");
    newUniversity.college.name="SKNCOA";
    
    newUniversity.displayUniversity();


}
}
class University{
    String name;
    String email;
    long contact;
    
    College college;

    Centres centres;

//parametrized cons
    University(String name,String email,long contact,College college,Centres centres){
        this.name=name;
        this.email=email;
        this.contact=contact;
    
    
        this.college=new College(college);
        this.centres=new Centres(centres);

    }
//deep copy
University( University oldUniversity){
        this.name=oldUniversity.name;
       this.email=oldUniversity.email;
        this.contact=oldUniversity.contact;
        
        
        this.college=new College(oldUniversity.college);
        this.centres=new Centres(oldUniversity.centres);

    }

//method

public  void displayUniversity(){
    System.out.println("University:"+name);
    System.out.println("Email:"+email);
    System.out.println("Contact:"+contact);
   college.displayCollege();
   centres.displayCentres();

}
}

//college class

class College{
    String name;
    String email;
    long contact;
    Address address;


    College(String name,
    String email,
    long contact,
    Address address){
    this.name=name;
    this.email=email;
    this.contact=contact;
    this.address=new Address(address);
}

College(College oldUniversity){
     this.name=oldUniversity.name;
    this.email=oldUniversity.email;
    this.contact=oldUniversity.contact;
    this.address=new Address(oldUniversity.address);
}
void displayCollege(){
    System.out.println("\n");
    System.out.println("College Info");
    System.out.println("College name:"+name);
    System.out.println("Contact:"+contact);
    System.out.println("email:"+email);
    address.displayAddress();

}

}


//centre class

class Centres{
    String name;
    String email;
    long contact;
    Address address;


    Centres(String name,
    String email,
    long contact,
    Address address){
    this.name=name;
    this.email=email;
    this.contact=contact;
    this.address=new Address(address);
}

Centres(Centres oldUniversity){
     this.name=oldUniversity.name;
    this.email=oldUniversity.email;
    this.contact=oldUniversity.contact;
    this.address=new Address(oldUniversity.address);
}
void displayCentres(){
    System.out.println("\n");
    System.out.println("Center Infoformation");
    System.out.println("Centre name:"+name);
    System.out.println("Contact:"+contact);
    System.out.println("email:"+email);
    address.displayAddress();

}

}
//Address classsssss
class Address{
    String location;
    String city;
    int pincode;



    Address(String location,
    String city,
    int pincode){
    this.location=location;
    this.city=city;
    this.pincode=pincode;
}

Address(Address oldUniversity){
     this.location=oldUniversity.location;
    this.city=oldUniversity.city;
    this.pincode=oldUniversity.pincode;
}
void displayAddress(){
   System.out.println("Location:"+location+"City:"+city+"Pincode:"+pincode);

}

}