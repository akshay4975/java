import java.util.Scanner;
import java.util.Arrays;
class Example5{
public static void main(String[]args)throws InterruptedException

{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a String:");
String str=sc.next();
for(int i=0;i<str.length();i++){
 char op=charAt(str,i);
System.out.print(op+" ");
}
}
public static char charAt(String str,int indx){
char[]arr=str.toCharArray();
 return arr[indx];
}
}




