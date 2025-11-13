import java.util.*;
class Marker{
String name;
Marker(String name){
this.name=name;
}
public String toString(){
return name;
}
}
class Demo{
public static void main(String[]args){
String str=new String("HELLO JAVA");
System.out.println(str);
System.out.println(str.toString());
Marker obj=new Marker("Camlin");
System.out.println(obj);
System.out.println(obj.toString());
}
}
