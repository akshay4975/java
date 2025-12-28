// parametrized method: palindromic string
import java.util.Scanner;
class Example10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        String rev=isPalindromicString(str);
        if (str.equals(rev)) {
            System.out.println(rev+" it is a palindromic string");
            
        }
        else System.out.println(rev+" it is not a palindromic sgtring");
    }
    public static String isPalindromicString(String str){
    String rev="";
    // for(int i=0;i<str.length();i++){
    //     rev=str.charAt(i)+rev;
        for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);

    } return rev;
}
    
}
