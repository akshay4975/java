import java.util.Scanner;
class IfElseExample{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter age of boy:");
int age=sc.nextInt();
System.out.println("ENter the surname of boy:");
String name=sc.next();
System.out.println("ENter the income of boy:");
long income=sc.nextLong();

if(age>21 && income>10000000 && name=="AMBANI"){
System.out.println("Boy is eligible for marring");
}
else{
System.out.println("Boy is NOT eligible for marring");
}
}
}

