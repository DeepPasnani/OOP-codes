class Vehicle 
{
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) 
    {
        this.vehicleNumber = vehicleNumber;
        this.brand         = brand;
        this.fuelType      = fuelType;
    }

    void displayDetails() 
    {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Brand          : " + brand);
        System.out.println("Fuel Type      : " + fuelType);
    }
}

class Car extends Vehicle 
{
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) 
    {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable   = ACavailable;
    }

    void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available   : " + (ACavailable ? "Yes" : "No"));
    }
}

class ElectricCar extends Car 
{
    private double batteryCapacity; 
    private double chargingTime;    

    ElectricCar(String vehicleNumber, String brand, int numberOfSeats, boolean ACavailable, double batteryCapacity, double chargingTime) 
    {
        super(vehicleNumber, brand, "Electric", numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime    = chargingTime;
    }

    void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time   : " + chargingTime    + " hrs");
    }
}

public class Program4_2 
{
    public static void main(String args[]) 
    {
        System.out.println("========== Vehicle ==========");
        Vehicle v1 = new Vehicle("V001", "Tata", "Diesel");
        v1.displayDetails();

        System.out.println();

        System.out.println("========== Car ==========");
        Car c1 = new Car("C001", "Maruti", "Petrol", 5, true);
        c1.displayDetails();

        System.out.println();

        System.out.println("========== Electric Car ==========");
        ElectricCar ec1 = new ElectricCar("EC001", "Tesla", 5, true, 100.0, 8.5);
        ec1.displayDetails();

        System.out.println();

        System.out.println("========== Upcasting (Vehicle ref -> Car) ==========");
        Vehicle v2 = new Car("C002", "Honda", "Petrol", 4, false);
        v2.displayDetails(); // calls Car's overridden displayDetails()

        System.out.println();

        System.out.println("========== Downcasting with instanceof ==========");
        if (v2 instanceof Car) 
        {
            Car c2 = (Car) v2;  
            System.out.println("Downcast successful!");
            System.out.println("Seats (via downcast): " + c2.numberOfSeats);
            System.out.println("AC    (via downcast): " + (c2.ACavailable ? "Yes" : "No"));
        }

        System.out.println();

        System.out.println("========== instanceof checks ==========");
        System.out.println("ec1 instanceof ElectricCar : " + (ec1 instanceof ElectricCar));
        System.out.println("ec1 instanceof Car         : " + (ec1 instanceof Car));
        System.out.println("ec1 instanceof Vehicle     : " + (ec1 instanceof Vehicle));
        System.out.println("v1  instanceof Car         : " + (v1  instanceof Car));
    }
}
