class DoWhileExample2{
    public static void main(String[] args) {
        int i=100;
        int sum=0;
        do{
            if(i%2==0){
             System.out.println(i);
              sum+=i;
            }
                i--;
            
        }
        while(i>=1);
    }   
         System.out.println(+sum);
    
    
}
