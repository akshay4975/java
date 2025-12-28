//password program
import java.util.Scanner;
class Example3{
public static void main(String[] args)throws InterruptedException {
    Scanner sc=new Scanner(System.in);
    int duration=1000;
    int storePin=1234;
    
    outerLoop:
    for( ;  ; ){
        int attempts=3;

    do{
        System.out.print("Enter the pin:");
        int userPin=sc.nextInt();
    if( userPin==storePin){
        System.out.println("phone unlocked");
        break outerLoop;
    }
    else{
        System.out.println("Entered pin is wrong you have "+(attempts-1)+"attempts left");
        attempts--;
    }}
    while(attempts>=1);
    System.out.println("your phone is locked for "+duration/1000+"seconds");
    Thread.sleep(duration);
    duration*=2;

    }

    }
    

}