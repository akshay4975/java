//factorial 
import java.util.Scanner;

class Example2{
      static int num;
      static int factorial=1;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        factorial();
     System.out.printf("Factorial of %d is %d ",num,factorial );
        
    }
    public static void factorial(){
       
        for(int i=1;i<=num;i++){
            factorial= factorial*i;

        }

    }
}
