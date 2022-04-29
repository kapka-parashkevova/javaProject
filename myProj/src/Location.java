import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Location {

    private int section;
    private int shelf;
    private int number;
    final int maxSections =4;
    final int maxShelfs = 7;
    final int maxNumbers = 10;

    private Set<Location> locationSet = new HashSet<>();

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
        return "section=" + section + ", shelf=" + shelf + ", number=" + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getSection() == location.getSection() && getShelf() == location.getShelf() && getNumber() == location.getNumber() && Objects.equals(locationSet, location.locationSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSection(), getShelf(), getNumber(), locationSet);
    }
}
