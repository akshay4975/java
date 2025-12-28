//prime number 
import java.util.Scanner;

class Example3{
      static int num;
      static int cnt;
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        factorial();
        if(cnt==2){
                System.out.println(num+"  is a prime number");
            } 
            else
            System.out.println(num+"  is not a prime number");

        
    }
    public static void factorial(){
       
        for(int i=1;i<=num;i++){
            if(num%i==0) cnt++;
           
        }

    }
}
