package operations;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Product {

    private String name;
    private int expiryDate;
    private LocalDate dateOfReceipt;
    private String manufacturer;
    private String unit;
    private int count;
    private Location location;
    private String comment;
    // private boolean isLocationFreeOrNot = true; // svobodna


    public Product(String name, int expiryDate, LocalDate dateOfReceipt, String manufacturer, String unit,
                   int count, Location location, String comment) throws InvalidException {
        if(name ==null || name .isEmpty() ) throw new InvalidException("The name of product cannot be null or empty!");
        this.name = name;
        this.expiryDate = expiryDate;
        this.dateOfReceipt = dateOfReceipt;

        if(manufacturer ==null || manufacturer .isEmpty() ) throw new InvalidException("The manufacturer cannot be null or empty!");
        this.manufacturer = manufacturer;
        if(unit ==null || unit .isEmpty() ) throw new InvalidException("The unit cannot be null or empty!");
        this.unit = unit;
        if(count <= 0) throw new InvalidException("Count can not be less than zero.");
        this.count = count;

        this.location = location;
        this.comment = comment;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getExpiryDate() {return expiryDate;}
    public void setExpiryDate(int expiryDate) {this.expiryDate = expiryDate;}
    public LocalDate getDateOfReceipt() {return dateOfReceipt;}
    public void setDateOfReceipt(LocalDate dateOfReceipt) {this.dateOfReceipt = dateOfReceipt;}
    public String getManufacturer() {return manufacturer;}
    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}
    public String getUnit() {return unit;}
    public void setUnit(String unit) {this.unit = unit;}
    public int getCount() {return count;}
    public void setCount(int count) {this.count = count;}
    public Location getLocation() {return location;}
    public void setLocation(Location location) {this.location = location;}
    public String getComment() {return comment;}
    public void setComment(String comment) {this.comment = comment;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getExpiryDate(), product.getExpiryDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExpiryDate());
    }

    @Override
    public String toString() {
        return "срок на годност " + expiryDate +
                " дни, дата на постъпване в склада " + dateOfReceipt +
                ", производител'" + manufacturer + '\'' +
                ", мерна единица: " + unit + '\'' +
                ", брой " + count +
                ", местоположение:" + location +
                ", коментар " + comment + '\'' ;

    }
}
