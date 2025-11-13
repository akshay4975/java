import java.util.Scanner;
class IfElseExample1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the salary of employee:");
int salary=sc.nextInt();
System.out.println("Enter the score of employee:");
int score=sc.nextInt();

if(score>90){
salary=(salary+salary*3/100);
System.out.println("New Salary of employee is :"+salary);
}
else{
salary=(salary+salary*1/100);
System.out.println("New Salary of employee is :"+salary);
}
}
}
