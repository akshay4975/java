class Demo1{
    public static void main(String[] args) {
        System.out.println("main Starts\n");
        int op=ramesh(123);
        System.out.println(op);
        System.out.println("main ends"); 
    }
        public static int ramesh(int num){
            System.out.println("Ramesh starts ");
            suresh();
            System.out.println("ramesh ends");
            return 10;
        }

        public static void suresh(){
            System.out.println("suressh starts \n");
            System.out.println("suresh ends");
        }
    }
