//Multiplication table
import java.util.Scanner;
class Example7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int num=sc.nextInt();
        multiplicationTable(num,1);
    }
       
    public static void multiplicationTable(int num,int i){
     
        System.out.println(num+"X"+i+"="+(num*i));
      
        if(i>=10)return;
   multiplicationTable(num,++i);


    }
    
}
