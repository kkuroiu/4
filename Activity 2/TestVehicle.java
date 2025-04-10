import java.util.Scanner;

// declaration of class
class Vehicle {
    private String brand;
    private double speed;
    private String fuelType;

    // constructor
    public Vehicle(String brand, double speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // encapsulation, getter and setter
    public String getBrandName() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // method to display vehicle info
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// car subclass
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, double speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override // overriding display info
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// motorcycle subclass
class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, double speed, String fuelType, boolean hasSideCar) {
        super(brand, speed, fuelType);
        this.hasSideCar = hasSideCar;
    }

    @Override // overriding display info
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Side Car: " + hasSideCar);
    }
}

// main class
class TestVehicle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the type of vehicle (Car or Motorcycle): ");
        String vehicleType = input.nextLine();

        System.out.print("Brand: ");
        String brandName = input.nextLine();

        System.out.print("Speed: ");
        double speedNumber = input.nextDouble();
        input.nextLine();

        System.out.print("Fuel Type: ");
        String fuelName = input.nextLine();

        // creating car and motorcycle objects
        if (vehicleType.equalsIgnoreCase("Car")) {
            System.out.print("Enter the number of doors: ");
            int doorsNum = input.nextInt();

            Car car = new Car(brandName, speedNumber, fuelName, doorsNum);
            car.displayInfo();

        } else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            System.out.print("Has a Sidecar? (true/false): ");
            boolean sideCar = input.nextBoolean();

            Motorcycle motorcycle = new Motorcycle(brandName, speedNumber, fuelName, sideCar);
            motorcycle.displayInfo();

        } else { // if user input is neither
            System.out.println("Invalid. Please input car or motorcycle.");
        }
        
        input.close();
    }
}
