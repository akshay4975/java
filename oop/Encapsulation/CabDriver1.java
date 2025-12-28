class CabDriver{
    private String name;
    private String vname;
    private long contact;
    private int rnumber;


    CabDriver(String name, String vname,long contact, int rnumber){
        this.name=name;
        this.vname=vname;
        this.contact=contact;
        this.rnumber=rnumber;
    }
// getter methods reads data only
    public String getName(){
        return name;
    }
    public String getvName(){
        return vname;
    }
    public long getContact(){
        return contact;
        }
        public int getrNumber(){
            return rnumber;
        }
        // setters methods:modify the data
        public void setName(String name){
        this.name=name;
    }
    public void setvName(String vname){
        this.vname=vname;
    }
    
public void displayDriver(){  
    System.out.println("name of cab driver:"+name);
        System.out.println("name of cab :"+vname);
        System.out.println("Contact Number of cab driver:"+contact);
        System.out.println("Vehicle Reg Number :"+rnumber);

}
    
}

class Cab{
    private String model;
    private int year;
    private long km ;

Cab(String model,int year,long km){
    this.model=model;
    this.year=year;
    this.km=km;
}
//getter method

public String getModel(){
    return model;
}
public int getyear(){
    return year;
}
public long getkm(){
    return km;
}
// setter method
public void setModel(String model){
    this.model=model;
}
public void displayCab(CabDriver obj){
     System.out.println("name of cab :"+obj.getvName());
        System.out.println("vehicle reg number :"+obj.getrNumber());
        System.out.println("Model of cab:"+model);
        System.out.println("Purchasing year of cab:"+year);
        System.out.println("total km of cab:"+km);
}
}





class Main{
    public static void main(String[] args) {
         CabDriver obj =new CabDriver("ramesh","toyota",12345678L,1727);
         Cab obj2=new Cab("HYNDAI",2020,23451234L);
        System.out.println("name of cab driver:"+obj.getName());
        System.out.println("name of cab :"+obj.getvName());
        System.out.println("Model of cab :"+obj2.getModel());



        obj.setName("mahesh kumar");
        obj.setvName("Swift Dezire");
        obj2.setModel("Maruti Suzuki");

        System.out.println("cab driver details");
        obj.displayDriver();
        System.out.println("cab details");
        obj2.displayCab(obj);


    }
}