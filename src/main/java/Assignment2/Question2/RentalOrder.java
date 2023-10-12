package Assignment2.Question2;

public class RentalOrder {
    private double totalCost;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalLength;

    public RentalOrder(Customer customer, Vehicle vehicle, int rentalLength){
        //this.totalCost = totalCost;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalLength = rentalLength;
    }
    public RentalOrder(Customer customer, Vehicle vehicle) {
        //this.totalCost = totalCost;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalLength = 1;
    }

    public double calculateTotalCost() {
        int cost = this.vehicle.getDaily_rate();
        double discount = this.customer.getDiscountRate() * 0.01;
        this.totalCost =  cost * this.rentalLength * discount;
        return this.totalCost;
    }

    public void completeOrder(){
        this.customer.addOrder(this);
        this.vehicle.setAvailable(false);
    }

    public int getRentalLength() {
        return rentalLength;
    }

    public void setRentalLength(int rentalLength) {
        this.rentalLength = rentalLength;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String toString(){
        return "Total Cost: " + String.valueOf(this.getTotalCost()) + ", "
                + "Customer: " + String.valueOf(this.getCustomer()) + ", "
                + "Vehicle: " + String.valueOf(this.getVehicle()) + ", "
                + "Rental Length: " + String.valueOf(this.getRentalLength()) + ", ";
    }
}
