class Student{
     String name;
     String address;
     String education;
     int age;
     double cgpa;

    Student(String name,String address,String education,int age,double cgpa){
        this.name=name;
        this.address=address;
        this.education=education;
        this.age=age;
        this.cgpa=cgpa;
    }


    public  void displayStudent(){
        System.out.println("........................");
        System.out.println("************ Student Info************");
        System.out.println("Student Name:"+name);
        System.out.println("Student Address:"+address);
        System.out.println("Student class:"+education);
        System.out.println("Student Age:"+age);
        System.out.println("Student CGPA:"+cgpa);
    }

    public static void main(String[] args) {
        Student s1 =new Student("akshay","Ahilyanagar","BEENTC",21,8.39);
        Student s2 =new Student("Mayur PAWALE","PUNE","BECS",20,9.23);

        
        System.out.println("\n");
        s1.displayStudent();
          System.out.println("\n");
        s2.displayStudent();

    }
}