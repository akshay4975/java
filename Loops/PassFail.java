import java.util.Scanner;
class PassFail{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks:");
double marks=sc.nextDouble();
String performance=" ";
char grade = ' ';
double per=marks/500*100;
if(marks<0||marks>500){
System.out.println("Invalid Marks");
}
else{
if(per>=90){
performance="Outstanding";
grade='O';
}
else if(per>=80 && per<90){
performance="First class with distinction";
grade='A';
}
else if(per>=60 && per<80){
performance="First class";
grade='B';
}
else if(per>=35 && per<60){
performance="Passed";
grade='P';
}
else{
performance="Fail";
grade='F';
}
System.out.printf("Student with %.2f percentage have a performance of %s and gets a %c grade",per,performance,grade);
}
}
}



