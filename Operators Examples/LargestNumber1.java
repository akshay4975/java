import java.util.Scanner;
class LargestNumber1
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num1:");
	int a=sc.nextInt();

	System.out.println("Enter num2:");
	int b=sc.nextInt();
	System.out.println("Enter num3:");
	int c=sc.nextInt();


	 int Smallest =(a<b)?(a<c?a:c):(b<c?b:c);
	 System.out.println("smallest number"+Smallest);
	 int Largest =(a>b)?(a>c?a:c):(b>c?b:c);
	 System.out.printf("Largest number %d",Largest);


		}
}