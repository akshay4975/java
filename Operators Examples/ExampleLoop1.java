import java.util.Scanner;
class ExampleLoop1
{
	public static void main(String[]args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int sum=0;
	
	for(int i=num;i>0;i=i/10){
	int rem=i%10;
	sum=sum+rem;
		}
	System.out.println(num+":"+sum);
}
}

	