public class SwitchExample {
    public static void main(String[] args) {
        
    
    byte key=1;
   final int num=128;

switch(num){
case 1:System.out.println("case 1");break;
case 2:System.out.println("Case 127");break;
case num:System.out.println("Case 127");break;
}
    }   
}
