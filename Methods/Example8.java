// no argu method for stud info
import java.util.Scanner;
class Example8 {
     static String name;
     static String email;
     static long contact;
     static int  yop;
     static double cgpa;
    public static void main(String[] args) {
      
myInfo();
  System.out.println("name of student:"+name);
  System.out.println("email of student:"+email);
  System.out.println("contact number of student:"+contact);
  System.out.println("yop of student:"+yop);
  System.out.println("cgpa of student:"+cgpa);

    }
    public static void myInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
          name=sc.next();
        System.out.println("Enter the email:");
          email=sc.next();
        System.out.println("Enter the contact number:");
         contact=sc.nextLong();
        System.out.println("Enter the cgpa:");
         cgpa=sc.nextDouble();
        System.out.println("Enter the yop:");
        yop=sc.nextInt();

    }
    
}
