import java.util.Scanner;
class Palindrome{
    static String str="";
        static String rev="";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:\n");
        str=sc.next();
        isPalindromic();
        if(str.equals(rev)){
            System.out.println("It is a palindromic string");
        }  else{
            System.out.println("It is not a palindromic string");
            }
        }
    
    public static void isPalindromic(){
        for(int i=0;i<str.length();i++){
      
                rev=str.charAt(i)+rev;
            
        }
      
        }


    }
