import java.util.Scanner;
class Example11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("factors of "+num+" are :");
        factors(num);
        
      
    }
      
public static void factors(int num){
    
    for(int i=1;i<=num;i++){
        if(num%i==0){
        System.out.println(i);
        }
    } 
   
}
    
}
