class Example2{
    public static void main(String[] args)throws InterruptedException {
        int duration=100;
        int cnt=1;
        for(char ch='A';ch<='Z';ch++){
            duration+=100;
            if(cnt++ ==7){
                cnt=1;
                duration=100;
            }
            System.out.print(ch);
            Thread.sleep(duration);
        }
    }
}
      
       