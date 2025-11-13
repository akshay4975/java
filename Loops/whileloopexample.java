import java.util.Scanner;
class WhileLoopExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            
            System.out.println("1.factorial");
             System.out.println("2.sum of digits");
              System.out.println("3.product of digit");
               System.out.println("4.spy number");
                System.out.println("5.neon number");
                 System.out.println("6.exit");
                 System.out.print("enter your choice:");
                 int choice=sc.nextInt();
        
        switch (choice) {
            case 1:{
                System.out.println("factorial");
                System.out.println("Enter a number");
                int num=sc.nextInt();
                int fact=1;
                
                while(num>0){
                    fact=num*fact;
                   num--;
                }
                System.out.println("Factorail of number is:"+fact);
            }
             break;
             case 2:{
                System.out.println("Sum of digits");
                System.out.println("Enter a number:");
                int num=sc.nextInt();
                 int sum=0;
                for(;num>0;num/=10){
                   sum+=num%10;
                }
                   System.out.println("sum of digits:"+sum);
                

             }break;
             case 3:{
                System.out.println("Product of a digits");
                System.out.println("Enter a number:")
                int num=sc.nextInt();
                int product=1;
                for(;num>0;num/10){
                    product=product*num%10;
                }System.out.println("Product of digits is:"+product);

             }break;

             case 4:{
                System.out.println("Spy Number");
                System.out.println("Enter a number:");
                int num=sc.nextInt();
                int sum=0;
                int product=1;
                for(;num>0;num/=10){
                    sum+=num%10;
                    product*=num%10;
                }
                    if(product==sum){
                        System.out.println("It is a spy number");
                    }
                    else
                    System.out.println("It is not a spy number");
                    
                
                
             }
             break;
             case 5:{
                System.out.println()
             }

        
            
        }
          
        }
    }
    
}
