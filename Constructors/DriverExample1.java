//shallow copy
public class DriverExample1 {
    public static void main(String[] args) {

        Address custAddress = new Address("katraj", 0321446, "pune");
        Address supAddress = new Address("navi mumbai", 5432230, "mumbai");

        // ❌ WRONG: you used variables before creating them
        // Product oldProduct=new Product("HP","Pavallion",54000.00,customer,supplier,delivery);

        // 🟩 FIX: create customer, supplier, delivery first
        Customer customer = new Customer("ramesh kumar", "abc@gmail.com", 987654321L, custAddress);
        Supplier supplier = new Supplier("mukesh kumar", "dfg@gmail.com", 123456789L, supAddress);
        Delivery delivery = new Delivery("BlueDart", "blue@gmail.com", 9988776655L, supAddress);

        // ❌ WRONG: 'product' (lowercase) is not a class
        // Product newProduct=new product(oldProduct);

        // 🟩 FIX:
        Product oldProduct = new Product("HP", "Pavilion", 54000.00, customer, supplier, delivery);
        Product newProduct = new Product(oldProduct);

        oldProduct.displayProduct();
        System.out.println("Copy COns");
        newProduct.displayProduct();

        
System.out.println("After change in copy");
        newProduct.customer.name = "XYZ";
        newProduct.displayProduct();
        oldProduct.displayProduct();

  
    }
}

class Product {
    String brand;
    String name;
    double price;
    Customer customer;
    Supplier supplier;
    Delivery delivery;

    // parametrized cons
    public Product(String brand, String name, double price, Customer customer, Supplier supplier, Delivery delivery) {
        this.brand = brand;
        this.name = name;
        this.price = price;

        // ❌ WRONG: wrong variable names (capital letter)
        // this.Customer = customer;
        // this.Supplier = supplier;
        // this.Delivery = delivery;

        // 🟩 FIX:
        this.customer = customer;
        this.supplier = supplier;
        this.delivery = delivery;
    }

    // copy cons
    public Product(Product oldProduct) {
        this.brand = oldProduct.brand;
        this.name = oldProduct.name;
        this.price = oldProduct.price;

        // ❌ SAME MISTAKE:
        // this.Customer = oldProduct.customer;
        // this.Supplier = oldProduct.supplier;
        // this.Delivery = oldProduct.delivery;

        // 🟩 FIX:
        this.customer = oldProduct.customer;
        this.supplier = oldProduct.supplier;
        this.delivery = oldProduct.delivery;
    }

    public void displayProduct() {
        System.out.println();
        System.out.println("******Product Information************");
        System.out.println("Product Brand:" + brand);
        System.out.println("Product Name:" + name);
        System.out.println("Product price:" + price);
        System.out.println("*************");

        // ❌ WRONG: calling like static functions
        // Customer.customerDisplay();
        // Supplier.supplierDisplay();
        // Delivery.deliveryDisplay();

        // 🟩 FIX:
        customer.displayCustomer();
        supplier.displaySupplier();
        delivery.displayDelivery();
    }
}

class Address {
    String address;
    int pincode;
    String city;

    Address(String address, int pincode, String city) {
        this.address = address;
        this.pincode = pincode;
        this.city = city;
    }

    public void displayAddress() {
        System.out.println("Address:" + address + " PINCODE:" + pincode + " City:" + city);
    }
}

class Customer {
    String name;
    String email;
    long contact;
    Address address;

    // ❌ WRONG: address not being passed
    // Customer(String name,String email,long contact){
    //     this.name=name;
    //     this.email=email;
    //     this.contact=contact;
    //     this.address=address;  // address is null → ERROR
    // }

    // 🟩 FIX:
    Customer(String name, String email, long contact, Address address) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
    }

    public void displayCustomer() {
        System.out.println("*****Customer details******");
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
        System.out.println("Customer contact: " + contact);
        address.displayAddress();
    }
}

class Supplier {
    String name;
    String email;
    Address address;
    long contact;

    // ❌ WRONG: address not passed
    // Supplier(String name,String email,long contact){
    //     this.name=name;
    //     this.email=email;
    //     this.contact=contact;
    //     this.address=address;
    // }

    // 🟩 FIX:
    Supplier(String name, String email, long contact, Address address) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
    }

    public void displaySupplier() {
        System.out.println("*****Supplier Details*******");
        System.out.println("Supplier Name: " + name);
        System.out.println("Supplier Email: " + email);
        System.out.println("Supplier contact: " + contact);
        address.displayAddress();
    }
}

class Delivery {
    String company;
    String email;
    long contact;
    Address address;

    // ❌ WRONG:
    // public Delivery(String name,String email,long contact){
    //     this.company=company;   // wrong variable name
    //     this.email=email;
    //     this.contact=contact;
    //     this.address=address;   // address was not passed
    // }

    // 🟩 FIX:
    public Delivery(String company, String email, long contact, Address address) {
        this.company = company;
        this.email = email;
        this.contact = contact;
        this.address = address;
    }

    // ❌ WRONG method name:
    // public void displaySupplier(){

    // 🟩 FIX:
    public void displayDelivery() {
        System.out.println("*****Delivery Details*******");
        System.out.println("Delivery company: " + company);
        System.out.println("Email: " + email);
        System.out.println("Contact: " + contact);
        address.displayAddress();
    }
}
