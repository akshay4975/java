import java.util.Scanner;
class Example13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int cnt=isPrime(num);
        if(cnt==2) System.out.println(num+" is is a prime number");
        else System.out.println(num+" is is not a prime number");
    }
    public static int isPrime(int num) {
        int cnt=0;
        for(int i=1;i<=num;i++){
            if(num%i==0) cnt++;
        } return cnt;
    }
}