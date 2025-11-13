class Example{
static float a;//global var:static 
int b=3;//global var:non static
public static void main(String[]args){
int c=4;//local var
System.out.println(a);//static var is printed:0.0
Example obj=new Example();//obj is created for printing non static var
System.out.println(obj.b);//non static var is printed:3
System.out.println(c);//local var is printed:4
	}
}