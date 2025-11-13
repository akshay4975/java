 class Example5 {
   public static void main(String[] args) {
    findFactors(10,1);
   }
   public static void findFactors(int num,int i) {
    if (num%i==0) 
        System.out.println(i+" ");
        i++;
        if (i>num) return;
             findFactors(num,i);
        
        
    
   }
    
}
