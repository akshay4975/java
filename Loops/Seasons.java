import java.util.Scanner;
enum Month{
    JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
}
class Seasons{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the month:");
        String month=sc.next().toUpperCase();
        if(month.length()>3){
            month=month.substring(0, 3);
        }     Month key = Month.valueOf(month);
        String result=switch(key){
            
        
        case FEB,MAR,APR,MAY -> "its a summer";
        case JUN,JUL,AUG,SEP ->"its a mansoon";
        case OCT,NOV,DEC,JAN ->"is a winter";
        default -> "INVALID MONTH";

        };
        System.out.println(month+":"+result);
    
    }
}
