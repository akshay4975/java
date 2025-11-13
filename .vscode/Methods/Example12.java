import java.util.Scanner;
class Example12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("factorial of "+num+" is :");
         int fact=factorial(num);
        System.out.println(fact); //24
      
    }
        
    public static int factorial( int num){
        int fact=1;
                    //i<=4
        for(int i=1;i<=num;i++){
            fact=fact*i;//1 2 6 24 
        } return fact;
    }
}