//even numbers
class Example6 {
    public static void main(String[] args) {
        findEvenNumber(1,100);
    }
       
    public static void  findEvenNumber(int num1,int num2){
        if(num1%2==0)
        System.out.println(num1+" ");
        num1++;
        if(num1>num2)return;
        findEvenNumber(num1,num2);


    }
    
}
