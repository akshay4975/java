//converting number to string using switch Expression.
import java.util.Scanner;
class Example7{
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
            words=switch (rem) {
                case 0->"Zero"+words;
                 case 1->"One"+words;
                  case 2->"Two"+words;
                   case 3->"Three"+words;
                    case 4->"Four"+words;
                     case 5->"Five"+words;
                      case 6->"Six"+words;
                       case 7->"Seven"+words;
                        case 8->"Eight"+words;
                         case 9->"Nine"+words;
                         default->"";
        
                
            };
            num/=10; //123/=10=12

        }
        System.out.println(temp+" : "+words);
    }

}
