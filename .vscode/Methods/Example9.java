import java.util.Scanner;
class Example9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int num=sc.nextInt();
        int dup=num;
         int rev= reverseNumber(num);
        System.out.println(" Before : "+dup+" after : "+rev);
    }
    public static int reverseNumber( int num){
        int rev=0;
                    //123>0
        for(int i=num;num>0;num/=10){
            int rem=num%10;//123%10=3   12%10=2   1%10=1
            rev=rev*10+rem;//0*10+3=3    3*10+2=32   32*10+1=321
        

        }
        return rev;
    }
}
