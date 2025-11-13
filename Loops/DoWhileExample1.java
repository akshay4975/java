import java.util.Scanner;
class DoWhileExample1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
int fact=1;

do{
fact=fact*num;
num--;
}
while(num>=1);
System.out.println(fact);
}
}
