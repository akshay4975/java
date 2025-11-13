import java.util.*;
class Thread{
public static void main(String[]args) throws InterruptedException {
int time=400;
int cnt=0;
for(char ch='A';ch<='Z';ch++){
System.out.println(ch);
Thread.sleep(time);
if(cnt++ ==8){
time=200;
cnt=0;
}
time+=100;
}
}

}
