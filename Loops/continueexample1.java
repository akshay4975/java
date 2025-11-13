//WAP to print odd numbers between 1 to 20 using continue.....
/*class continueexample1 {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i%2==0)continue;
            System.out.println(i);
        }
    }
}
*/
class ContinueExample1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            i++;
            if (i % 2 == 0) 
                continue;
            System.out.println(i);
        }
    }
}
