package Assignment2.Question2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RentalOffice implements Reportable{
    private int officeID;
    private String locationZip;
    private List<Inventory> inventoryList = new ArrayList<>();
    private List<RentalOrder> orderList = new ArrayList<>();

    public RentalOffice(int id, String zip){
        this.officeID = id;
        this.locationZip = zip;
    }
    @Override
    public String generateReport() {
        return "OfficeID: " + String.valueOf(this.officeID) + ",\n Location Zip Code: " + this.locationZip + ",\n Inventory: " + String.join( ",", (Iterable) this.inventoryList) + ",\n Order History: " + String.join(",", (Iterable) this.orderList);
    }

    public void addInventory(Inventory inv){
        for (Inventory element: this.inventoryList) {
            if (element.getType() == inv.getType()) {
                System.out.println("There is already an inventory of that type: " + inv.getType());
                return;
            }
        }
        this.inventoryList.add(inv);
    }

    public void removeInventory(Inventory inv){
        this.inventoryList.remove(inv);
    }

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public List<RentalOrder> getOrderList() {
        return orderList;
    }

    public String getLocationZip() {
        return locationZip;
    }

    public void setLocationZip(String zip){
        this.locationZip = zip;
    }

    public void addOrder(RentalOrder order){
        this.orderList.add(order);
    }
    public void removeOrder(RentalOrder order){
        this.orderList.remove(order);
    }
}
