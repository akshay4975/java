//converting number to string using switch.
import java.util.Scanner;
class Example6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        numberToString(num);
      
    }
    public static void numberToString( int num)
    {
        String words="";
         int temp=num;
        while(num>0)//123>0
        {
            int rem=num%10;//123%10=3
            switch (rem) {
                case 0:
                    words="Zero"+words;
                    break;
                        case 1:
                    words="One"+words;
                    break;
                        case 2:
                    words="Two"+words;
                    break;
                        case 3:
                    words="Three"+words;
                    break;
                        case 4:
                    words="Four"+words;
                    break;
                        case 5:
                    words="Five"+words;
                    break;
                        case 6:
                    words="Six"+words;
                    break;
                        case 7:
                    words="Seven"+words;
                    break;
                        case 8:
                    words="Eight"+words;
                    break;
                        case 9:
                    words="Nine"+words;
                    break;
                     
            }
            num/=10; //123/=10=12

        }
        System.out.println(temp+" : "+words);
    }

}
