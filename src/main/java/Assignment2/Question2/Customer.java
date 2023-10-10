package Assignment2.Question2;

import java.util.List;

public abstract class Customer implements Reportable {
    int id;
    String name;
    int discountRate;
    List<RentalOrder> orders;

    @Override
    public String generateReport() {
        return null;
    }
    public void addOrder(RentalOrder order){
        this.orders.add(order);
    }

    public void removeOrder(RentalOrder order){
        this.orders.remove(order);
    }
    public List<RentalOrder> getOrderHistory() {
        return this.orders;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
