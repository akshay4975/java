class Student{
     String name;
     String address;
     String education;
     int age;
    double cgpa;

    public  void displayStudent(){
        System.out.println("************ Student Info************");
        System.out.println("Student Name:"+name);
        System.out.println("Student Address:"+address);
        System.out.println("Student class:"+education);
        System.out.println("Student CGPA:"+cgpa);
    }

    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="akshay";
        s1.address="pune";
        s1.education="BEentc";
        s1.age=22;
        s1.cgpa=8.38;
        
        s1.displayStudent();

    }
}