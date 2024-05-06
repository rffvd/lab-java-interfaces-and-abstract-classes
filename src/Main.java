abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public abstract String getInfo();
}

class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "Sedan: VIN - " + getVinNumber() + ", Make - " + getMake() + ", Model - " + getModel() + ", Mileage - " + getMileage();
    }
}

class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean hasFourWheelDrive() {
        return fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return "Utility Vehicle: VIN - " + getVinNumber() + ", Make - " + getMake() + ", Model - " + getModel() + ", Mileage - " + getMileage() + ", Four Wheel Drive - " + (fourWheelDrive ? "Yes" : "No");
    }
}

class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public String getInfo() {
        return "Truck: VIN - " + getVinNumber() + ", Make - " + getMake() + ", Model - " + getModel() + ", Mileage - " + getMileage() + ", Towing Capacity - " + towingCapacity;
    }
}

class IntListInterface {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("123456", "Toyota", "Camry", 50000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("789012", "Ford", "Explorer", 60000, true);
        Truck truck = new Truck("345678", "Chevrolet", "Silverado", 70000, 10000.0);

        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());
    }
}
