import java.util.Scanner;
class ExampleOddEven
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneterr a num:");
	
	int num =sc.nextInt();
	 String op1 = (num/2==num/2.0)?(num+" is even"):(num+ "is odd");
	 
	 String op2 = ((num/2)*2==num)?(num+" is even"):(num+ "is odd");
	

	 System.out.println(op1);

	 System.out.println(op2);
	}
}