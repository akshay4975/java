import java.util.Scanner;
import java.util.*;
import java.util.Random;
class Lables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand =new Random();
        System.out.println("Enter a number:");
        int num=rand.nextInt(100)+1;

        outerLoop:
        for(int i=1;i<=3;i++){
            if(i==1){
                System.out.println("this is your first attempt you have 2 attempts left");}
            if(i==2){
            System.out.println("this is your second attempt you have 1 attempt left");
        }
            if(i==3){
            System.out.println("this is your third attempt you have 0 attempts left");}
           //first try 
            System.out.println("Enter your first try:");
            int num1=sc.nextInt();
            if(num==num1) {
                System.out.println("you found a correct match you won");
                break outerLoop;
            }
            //second try
            System.out.println("Enter your second try:");
            int num2=sc.nextInt();
            if(num==num2) {
                System.out.println("you found a correct match you won");
                break outerLoop;
            }
            //third try
            System.out.println("Enter your third try:");
            int num3=sc.nextInt();
            if(num==num3) {
            System.out.println("you found a correct match you won");
            break outerLoop;
            }

        }
            
            
        
       

    }
    
}
            