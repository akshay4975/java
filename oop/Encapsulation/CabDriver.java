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
class Main{
    public static void main(String[] args) {
         CabDriver obj =new CabDriver("ramesh","toyota",12345678L,1727);
        System.out.println("name of cab driver:"+obj.getName());
        System.out.println("name of cab :"+obj.getvName());

        obj.setName("mahesh kumar");
        obj.setvName("Swift Dezire");

        System.out.println(".........");
        
        obj.displayDriver();


    }
}