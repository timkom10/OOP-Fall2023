package Assignment2.Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Inventory {
    private int inventoryID;
    private VehicleType type;
    private List<Vehicle> vehicles = new ArrayList<>();

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
        if (Objects.equals(vehicle.getType(), this.type.span)) {
            this.vehicles.add(vehicle);
        } else {
            System.out.println("Incorrect vehicle type");
        }
    }

    public void removeVehicle(Vehicle vehicle){
            Boolean isRemoved = this.vehicles.remove(vehicle);
            System.out.println(isRemoved);
        }
    public String vehiclesToString(){
        String totalstr = "";
        for (Vehicle vehicle: vehicles){
            totalstr += "VehicleID: " +String.valueOf(vehicle.getVehicleID()) + ", "
                    + "Make: " + vehicle.getMake() + ", "
                    + "Model: "+ vehicle.getModel() + ", "
                    + "Year: " + String.valueOf(vehicle.getYear()) + ", "
                    + "Daily Rate: " + String.valueOf(vehicle.getDaily_rate()) + ", "
                    + "Type: " + vehicle.getType() + ", "
                    + "Is Available: " + vehicle.isAvailable();
        }
        return totalstr;
    }
    public String toString() {
        return String.valueOf(this.getInventoryID()) + this.getType().span + this.vehiclesToString();
    }
}
