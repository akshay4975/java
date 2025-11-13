//Factors
import java.util.Scanner;

class Example1 {
      static int num;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        factors();
        
    }
    public static void factors(){
        for(int i=1;i<=num;i++){
            if(num%i==0)
            System.out.println(i);
        }
    }

}
