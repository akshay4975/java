//WAP to print even numbers between 1 to 20 using continue....

/*class continueexample2 {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i%2==1)continue;
            System.out.println(i);
        }
    }
    
}
    */
    class continueexample2{
        public static void main(String[] args) {
            int i=1;
            while(i<=20){
                i++;
                if(i%2!=0)continue;
                System.out.println(i);
            }
        }
    }
