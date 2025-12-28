class Parent {
    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls Parent constructor
        System.out.println("Child");
    }
}

class Example1 {
    Example1() {
        System.out.println("Example1");
    }

    public static void main(String[] args) {
        // Create objects to see constructor chaining
        // Parent p = new Parent();   // prints "Parent"
        Child c = new Child();     // prints "Parent" then "Child"
        // Example1 e = new Example1(); // prints "Example1"
    }
}
