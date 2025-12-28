class Example1{
    public static void main(String[] args)throws InterruptedException {
        String name= new java.util.Scanner(System.in).next();
        for(int i=0;i<name.length();i++){
        System.out.println(name.charAt(i));
        Thread.sleep(200);
        }
}
}