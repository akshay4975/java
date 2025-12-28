
// reverse number
class Example11{
    public static void main(String[] args) {
        int num=1234;

        int rev=reverseNumber(num,0);
        System.out.println(rev);


    }
       public static int reverseNumber(int num,int rev){
         if(num<=0){
            return rev;
        }
        int rem=num%10;
        rev=(rev*10)+rem;
       
      return reverseNumber(num/10,rev);
       }
    
        
    }
