package Assignment2.Question2;

public class Corporate extends Customer{
    String country;
    String taxID;

    public Corporate(int id, String name, int discountRate, String country, String taxID){
        super(id, name, discountRate);
        this.country = country;
        this.taxID = taxID;
    }

    @Override
    public String generateReport() {
        return "ID: " + String.valueOf(this.getId())
                + "\nName: " + this.name
                + "\nDiscount Rate: " + String.valueOf(this.getDiscountRate())
                + "\nCountry: " + this.country
                + "\nTax ID: " + this.taxID
                + "\nOrder History: " + String.valueOf(this.getOrderHistory());
    }
}
