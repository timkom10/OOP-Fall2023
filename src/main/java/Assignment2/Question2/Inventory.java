package Assignment2.Question2;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    int inventoryID;
    VehicleType type;
    List<Vehicle> vehicles = new ArrayList<>();

    public Inventory(int inventoryID, VehicleType type){
        this.inventoryID = inventoryID;
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle.getType() == this.type) {
            this.vehicles.add(vehicle);
        } else {
            System.out.println("Incorrect vehicle type");
        }
    }

    public void removeVehicle(Vehicle vehicle){
            Boolean isRemoved = this.vehicles.remove(vehicle);
            System.out.println(isRemoved);
        }
}
