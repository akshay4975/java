// parametrized methods 
//power

import java.util.Scanner;


class Example4 {

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number");
   int num=sc.nextInt();
    System.out.print("Enter the power");
    int pow=sc.nextInt();

   

 int result=power(num ,pow);
System.out.println(num+":"+result);


}
public static int power(int num,int pow){
    int result=1;
    for(int i=1;i<=pow;i++){
  result=result*num;
  
    }  return result;
}
    
}