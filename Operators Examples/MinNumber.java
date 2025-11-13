import java.util.Scanner;
class MinNumber{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number;");//987654
int num=sc.nextInt();
int dup=num;
int min=9;
while(num>0){
int rem=num%10;
if(rem<min){
min=rem;
}
num=num/10;
}

System.out.println(dup+" : "+min);
}
}
