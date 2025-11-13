class Example3{
    static int num=1;
    public static void main(String[] args) {
 printNumber();       
    }
    public static void  printNumber(){
       if(num%2==0) System.out.print(num+" ");
        if(num++ >100)return;
       printNumber();       

    }
}