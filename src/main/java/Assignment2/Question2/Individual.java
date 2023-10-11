package Assignment2.Question2;

public class Individual extends Customer {
    private int age;
    private String state;
    private String zip;

    public Individual(int id, String name, int discountRate, int age, String state, String zipcode) {
        super(id, name, discountRate);
        this.age = age;
        this.state = state;
        this.zip = zipcode;
    }

    @Override
    public String generateReport() {
        return "ID: " + String.valueOf(this.getId())
                + ",\nName: " + this.name
                + ",\nDiscount Rate: " + String.valueOf(this.getDiscountRate())
                + ",\nAge: " + String.valueOf(this.age)
                + ",\nState: " + this.state
                + ",\nZipcode: " + this.zip
                + ",\nOrder History: " + String.valueOf(this.getOrderHistory());
    }
}
