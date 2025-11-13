import java.util.Scanner;
class MaxNumber{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int num=sc.nextInt();

int dup=num;

int max=0;
while(num>0){

int rem=num%10;
if(rem>max){
max=rem;
}
num=num/10;

}
System.out.println(dup+":"+max);
}
}

