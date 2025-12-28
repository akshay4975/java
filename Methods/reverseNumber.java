class reverseNumber{
    static int num=1234;
   public static void main(String[] args) {
   System.out.println("after:"+num);
   reverseNumber();
   System.out.println("before:"+num);
    
   }
  public static void reverseNumber() {
    int rev=0;
    for(int i=1;num>0;i++){
        int rem=num%10;
        rev=rev*10+rem;
        num/=10;
    }
    num=rev;
  
    
  }


}