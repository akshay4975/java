// deep copy
public class DriverExample3 {
    public static void main(String[] args) {

        // Owner Location
        Location ownLoc = new Location("Kothrud", "Pune", 411038);
        Owner owner = new Owner("Akshay Patil", "akshay@gmail.com", 9876543210L, ownLoc);

        // Manufacturer Location
        Location manLoc = new Location("Andheri", "Mumbai", 400053);
        Manufacturer manufacturer = new Manufacturer("Tata Motors", "tata@gmail.com", 7896541230L, manLoc);

        // Insurance Details
        Insurance insurance = new Insurance(
                "Bajaj Allianz",
                "bajaj@gmail.com",
                9988776655L,
                "01/01/2025",
                "01/01/2026"
        );

        // Original Vehicle Object
        Vehicle oldVehicle = new Vehicle(
                "Tata Nexon",
                "Petrol",
                950000.00,
                owner,
                manufacturer,
                insurance
        );

        oldVehicle.displayVehicle();

        System.out.println("\n================== COPY OBJECT ==================\n");

        // Deep Copy
        Vehicle newVehicle = new Vehicle(oldVehicle);
        newVehicle.displayVehicle();
        System.out.println(">>>>>>>>>>..");
        System.out.println("After change in copy constructor");
        newVehicle.manufacturer.company="THAR 4*4";
        newVehicle.displayVehicle();
        System.out.println("Org object\n");
        oldVehicle.displayVehicle();
        System.out.println("\n");
        newVehicle.displayVehicle();

    }
}

/*------------------ LOCATION ------------------------*/

class Location {
    String area;
    String city;
    int pincode;

    Location(String area, String city, int pincode) {
        this.area = area;
        this.city = city;
        this.pincode = pincode;
    }

    // Deep copy constructor
    Location(Location old) {
        this.area = old.area;
        this.city = old.city;
        this.pincode = old.pincode;
    }

    void displayLocation() {
        System.out.println("Location: " + area + ", " + city + ", " + pincode);
    }
}

/*------------------ OWNER ------------------------*/

class Owner {
    String name;
    String email;
    long contact;
    Location location;

    Owner(String name, String email, long contact, Location location) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.location = new Location(location); // deep copy
    }

    // Deep copy constructor
    Owner(Owner old) {
        this.name = old.name;
        this.email = old.email;
        this.contact = old.contact;
        this.location = new Location(old.location); // deep copy
    }

    void displayOwner() {
        System.out.println("\n--- Owner Details ---");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Contact : " + contact);
        location.displayLocation();
    }
}

/*------------------ MANUFACTURER ------------------------*/

class Manufacturer {
    String company;
    String email;
    long contact;
    Location location;

    Manufacturer(String company, String email, long contact, Location location) {
        this.company = company;
        this.email = email;
        this.contact = contact;
        this.location = new Location(location);
    }

    // Deep copy constructor
    Manufacturer(Manufacturer old) {
        this.company = old.company;
        this.email = old.email;
        this.contact = old.contact;
        this.location = new Location(old.location);
    }

    void displayManufacturer() {
        System.out.println("\n--- Manufacturer Details ---");
        System.out.println("Company : " + company);
        System.out.println("Email : " + email);
        System.out.println("Contact : " + contact);
        location.displayLocation();
    }
}

/*------------------ INSURANCE ------------------------*/

class Insurance {
    String company;
    String email;
    long contact;
    String startDate;
    String endDate;

    Insurance(String company, String email, long contact, String startDate, String endDate) {
        this.company = company;
        this.email = email;
        this.contact = contact;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Deep copy constructor
    Insurance(Insurance old) {
        this.company = old.company;
        this.email = old.email;
        this.contact = old.contact;
        this.startDate = old.startDate;
        this.endDate = old.endDate;
    }

    void displayInsurance() {
        System.out.println("\n--- Insurance Details ---");
        System.out.println("Company : " + company);
        System.out.println("Email : " + email);
        System.out.println("Contact : " + contact);
        System.out.println("Valid From : " + startDate + " To : " + endDate);
    }
}

/*------------------ VEHICLE (DEEP COPY) ------------------------*/

class Vehicle {
    String model;
    String fuelType;
    double price;
    Owner owner;
    Manufacturer manufacturer;
    Insurance insurance;

    Vehicle(String model, String fuelType, double price,
            Owner owner, Manufacturer manufacturer, Insurance insurance) {

        this.model = model;
        this.fuelType = fuelType;
        this.price = price;

        // DEEP COPY
        this.owner = new Owner(owner);
        this.manufacturer = new Manufacturer(manufacturer);
        this.insurance = new Insurance(insurance);
    }

    // Deep Copy Constructor
    Vehicle(Vehicle old) {
        this.model = old.model;
        this.fuelType = old.fuelType;
        this.price = old.price;
        this.owner = new Owner(old.owner);
        this.manufacturer = new Manufacturer(old.manufacturer);
        this.insurance = new Insurance(old.insurance);
    }

    void displayVehicle() {
        System.out.println("\n******** VEHICLE DETAILS ********");
        System.out.println("Model : " + model);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Price : " + price);

        owner.displayOwner();
        manufacturer.displayManufacturer();
        insurance.displayInsurance();
    }
}
