abstract class Vehicle 
{
    protected String brand;
    protected String vehicleNumber;

    Vehicle(String brand, String vehicleNumber) 
    {
        this.brand = brand;
        this.vehicleNumber = vehicleNumber;
    }

    abstract String fuelType();
    abstract int    noOfWheels();

    void displayDetails() 
    {
        System.out.println("Brand: " + brand);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Fuel Type: " + fuelType());
        System.out.println("No. of Wheels: " + noOfWheels());
    }
}

class Car extends Vehicle 
{
    private String fuelChoice; 
    private int    numberOfSeats;

    Car(String brand, String vehicleNumber, String fuelChoice, int numberOfSeats) 
    {
        super(brand, vehicleNumber);
        this.fuelChoice    = fuelChoice;
        this.numberOfSeats = numberOfSeats;
    }

    String fuelType() 
    {
        return fuelChoice;          
    }

    int noOfWheels() 
    {
        return 4;
    }

    void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Seating Cap.: " + numberOfSeats);
    }
}

class Bike extends Vehicle 
{
    private String bikeType;   

    Bike(String brand, String vehicleNumber, String bikeType) 
    {
        super(brand, vehicleNumber);
        this.bikeType = bikeType;
    }

    String fuelType() 
    {
        return "Petrol";
    }

    int noOfWheels()
    {
        return 2;
    }

    void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Bike Type: " + bikeType);
    }
}

public class Program5_2 
{
    public static void main(String args[]) 
    {

        System.out.println("========== Car 1 (Petrol) ==========");
        Car car1 = new Car("Maruti Swift", "GJ06 AB 1234", "Petrol", 5);
        car1.displayDetails();

        System.out.println();

        System.out.println("========== Car 2 (Diesel) ==========");
        Car car2 = new Car("Tata Nexon", "GJ06 CD 5678", "Diesel", 5);
        car2.displayDetails();

        System.out.println();

        System.out.println("========== Bike 1 (Sports) ==========");
        Bike bike1 = new Bike("KTM Duke", "GJ06 EF 9101", "Sports");
        bike1.displayDetails();

        System.out.println();

        System.out.println("========== Bike 2 (Commuter) ==========");
        Bike bike2 = new Bike("Honda Activa", "GJ06 GH 1121", "Commuter");
        bike2.displayDetails();

        System.out.println();

        System.out.println("========== Polymorphic Array Demo ==========");
        Vehicle[] vehicles = { car1, car2, bike1, bike2 };

        for (Vehicle v : vehicles) 
        {
            System.out.println("--------------------------------------------");
            System.out.printf("%-15s | Fuel: %-8s | Wheels: %d%n", v.brand, v.fuelType(), v.noOfWheels());
        }
        System.out.println("--------------------------------------------");

        System.out.println();

        System.out.println("========== instanceof Checks ==========");
        for (Vehicle v : vehicles) 
        {
            if (v instanceof Car) 
            {
                System.out.println(v.brand + " -> Car  (4 wheels, " + v.fuelType() + ")");
            } 
            else if (v instanceof Bike) 
            {
                System.out.println(v.brand + " -> Bike (2 wheels, " + v.fuelType() + ")");
            }
        }
    }
}
