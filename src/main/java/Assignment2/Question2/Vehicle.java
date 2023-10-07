package Assignment2.Question2;

public class Vehicle {
    private int vehicleID;
    private String make;
    private String model;
    private int year;
    private int mileage;
    private VehicleType type;
    private boolean available;
    private int daily_rate;

    public Vehicle(int id, String make, String model,int year, int mileage, VehicleType type,  int daily_rate){
        this.vehicleID = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.type = type;
        this.available = true;
        this.daily_rate = daily_rate;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getVehicleID(){
        return this.vehicleID;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getDaily_rate() {
        return daily_rate;
    }

    public void setDaily_rate(int daily_rate) {
        this.daily_rate = daily_rate;
    }
}
