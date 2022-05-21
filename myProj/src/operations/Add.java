package operations;

import java.util.*;

public class Add {
    private List<Product> productList = new ArrayList<>();
    private Map<String, List<Product>> productMap = new HashMap<>();

    public void setProductList(List<Product> productList) {
        this.productList = productList;
        fillMap();
    }

    public void addProduct(Product product) throws InvalidException {
        for (Map.Entry<String, List<Product>> entry : productMap.entrySet()) {
            if (entry.getKey().equals(product.getName())) {
                List<Product> products = entry.getValue();
                replaceLocationIfExists(products, product);
                productMap.put(product.getName(), products);
            }
        }
    }

    public void displayMap() {
        int count = 0;
        for (Map.Entry<String, List<Product>> entry : productMap.entrySet()) {
           // count += entry.getValue().getCount();
            System.out.println(entry.getKey() + ": " + Arrays.toString(entry.getValue().toArray()) + " total count: " + returnCount(entry.getKey()));
        }
    }

    private int returnCount(String name){

        int count=0;
        for (Product current : productList) {
            if (current.getName().equals(name)) {
                count += current.getCount();
            }
        }

        return count;
    }


    private void fillMap() {
        for (Product current : productList) {
            productMap.put(current.getName(), getProductByName(current.getName()));
        }
    }

    private List<Product> getProductByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product current : productList) {
            if (current.getName().equals(name)) {
                result.add(current);
            }
        }
        return result;
    }

    private void replaceLocationIfExists(List<Product> list, Product replacement) throws InvalidException {
        for (Product current : list) {
            Location currentLocation = current.getLocation();
            if (current.getExpiryDate() == replacement.getExpiryDate()) {
                replacement.setLocation(changeLocation(currentLocation, replacement.getLocation()));
            }
        }
        list.add(replacement);
    }

    private Location changeLocation(Location current, Location comparedWith) throws InvalidException {
        Location result = new Location(0 , 0,0);
        if (current.equals(comparedWith)) {
            result.setSection(current.getSection());
            result.setShelf(current.getShelf());
            result.setNumber(current.getNumber() + 1);
            return result;
        } else
            // ако локациите са различни, запазваме ги без промяна
            return comparedWith;
    }

}

