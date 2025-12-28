class Student{
     String name;
     String address;
     String education;
     int age;
     double cgpa;
    //parametrized constructor
    Student(String name,String address,String education,int age,double cgpa){
        this.name=name;
        this.address=address;
        this.education=education;
        this.age=age;
        this.cgpa=cgpa;
    }
    //copy constructor
    Student(Student oldObj){
        this.name=oldObj.name;
        this.address=oldObj.address;
        this.education=oldObj.education;
        this.age=oldObj.age;
        this.cgpa=oldObj.cgpa;
    }

    


    public  void displayStudent(){
        System.out.println("");
        System.out.println("************ Student Info************");
        System.out.println("Student Name:"+name);
        System.out.println("Student Address:"+address);
        System.out.println("Student class:"+education);
        System.out.println("Student Age:"+age);
        System.out.println("Student CGPA:"+cgpa);
    }


    public static void main(String[] args) {
        Student oldObj=new Student("akshay","Ahilyanagar","BEENTC",21,8.39);
        oldObj.displayStudent();
        
        
        Student copyObj=new Student(oldObj);
        copyObj.displayStudent();

    }
}