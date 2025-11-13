import java.util.Scanner;
class SumOfMinMax{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number;");//987654
int num=sc.nextInt();
int dup=num;

int max=0;
int min=9;
while(num>0){
int rem=num%10;
if(rem<min){
min=rem;
}
if(rem>max){

max=rem;
}
num=num/10;
}
int sum=max + min;
System.out.println(dup+" : "+min);
System.out.println(dup+" : "+max);

System.out.println("The sum of largest and smallest number is:" +sum);
}
}
