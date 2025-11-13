import java.util.Scanner;
class Calculator{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter num1:");
int num1=sc.nextInt();
System.out.println("Enter num2:");
int num2=sc.nextInt();
System.out.println("Enter Operator:");
char op=sc.next().charAt(0);
 double results=0;
boolean assump=true;
if(op=='+'){
results=num1+num2;
}
else if(op=='-'){
results=num1-num2;
}
else if(op=='*'){
results=num1*num2;
}
else if(op=='/'){
results=num1/num2;
}
else if(op=='%'){
results=num1%num2;
}
else{
assump=false;
System.out.println("Invalid Operator");
}
if(assump){
//System.out.println(num1 +op +num2+ "=" +results);
System.out.printf("%d %c %d = %.2f ",num1,op,num2,results);
}}
}




