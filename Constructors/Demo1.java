class ExampleDriverThis{
  String str="Global var";
    public static void main(String[] args) {
        System.out.println("main");
        new ExampleDriverThis().m1();

    }
    public void m1(){
        System.out.println("m1 non static");
        System.out.println(this.str);
        this.m2();
    }
    public void m2(){
        System.out.println("m2() non static");
    }
}