import java.util.Scanner;
class CurrencyConverter{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
for( ; ; ){
System.out.println("\n      WELCOME      \n");
System.out.printf("%-5s  %-10s  %-10s%n","SrNo","Currency","Rate");

System.out.printf("%-5d  %-10s  %-10f%n",1,"USD",88.0956);

System.out.printf("%-5d  %-10s  %-10f%n",2,"GBP",118.298);

System.out.printf("%-5d  %-10s  %-10f%n",3,"kwd",288.107);
 
System.out.printf("%-5d  %-10s  %-10f%n",4,"PKR",0.311783);

System.out.printf("%-5d  %-10s  %-10f%n",5,"AED",24.024);

System.out.printf("%-5d  %-10s  %-10f%n",6,"AFN",1.292408);

System.out.printf("%-5d  %-10s  %-10f%n",7,"AUD",57.8321);

System.out.printf("%-5d  %-10s  %-10f%n",8,"BDT",0.72452);

System.out.printf("%-5d  %-10s  %-10f%n",9,"LKR",0.2922);

System.out.printf("%-5d  %-10s  %-10f%n",10,"CNY",12.364415);

System.out.println("Enter the amount in INR:");
double inr= sc.nextDouble();
System.out.println("Enter the Currency:");
int opt=sc.nextInt();
double conv=0;
String curr=" ";

if(opt==1){
conv=inr/88.0956;
curr="USD";
}
else if(opt==2){
conv=inr/118.298;
curr="GBP";
}
else if(opt==3){
conv=inr/288.107;
curr="KWD";
}
else if(opt==4){
conv=inr/0.311783;
curr="PKR";
}
else if(opt==5){
conv=inr/24.024;
curr="AED";
}
else if(opt==6){
conv=inr/1.29;
curr="AFN";
}
else if(opt==8){
conv=inr/0.72234;
curr="BDT";
}
else if(opt==7){
conv=inr/57.8322;
curr="AUD";
}
else if(opt==9){
conv=inr/0.2922;
curr="LKR";
}
else if(opt==10){
conv=inr/12.3644;
curr="CNY";
}
else{
System.out.println("INVALID CURRENCY");
}
//System.out.println("Amount in INR"+inr+"="+conv+"("+curr+")");
System.out.printf("Amount in INR %.2f = %.2f (%s)",inr,conv,curr);
break;
}}}