package operations;

import java.util.Objects;

public class Location {

    private int section;
    private int shelf;
    private int number;
    private final int MAX_SECTIONS =4;
    private final int MAX_SHELFS = 7;
    public final int MAX_NUMBERS = 10;


    public Location(int section, int shelf, int number) throws InvalidException{
        if(section <= 0 && section > 5) throw new InvalidException("Section number can not be less than 0.");
        this.section = section;
        if(shelf <= 0 && shelf > 8) throw new InvalidException("Shelf number can not be less than 0.");
        this.shelf = shelf;
        if(number <= 0 && shelf > 11) throw new InvalidException("Number can not be less than 0.");
        this.number = number;
    }


    public int getSection() {return section;}
    public int getShelf() {return shelf;}
    public int getNumber() {return number;}

    public void setSection(int section) {
        this.section = section;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "секция: " + section + ", рафт: " + shelf + ", номер: " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getSection() == location.getSection() && getShelf() == location.getShelf() && getNumber() == location.getNumber() && MAX_SECTIONS == location.MAX_SECTIONS && MAX_SHELFS == location.MAX_SHELFS && MAX_NUMBERS == location.MAX_NUMBERS;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSection(), getShelf(), getNumber(), MAX_SECTIONS, MAX_SHELFS, MAX_NUMBERS);
    }

    public int returnCapacityNumbers(){
        return MAX_NUMBERS;
    }

    public int getMAX_SECTIONS() {
        return MAX_SECTIONS;
    }

    public int getMAX_SHELFS() {
        return MAX_SHELFS;
    }

    public int getMAX_NUMBERS() {
        return MAX_NUMBERS;
    }
}
