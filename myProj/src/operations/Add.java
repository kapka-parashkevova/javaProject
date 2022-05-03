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
        List<Product> result = new ArrayList<>();
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
        Location result = new Location(0 , 0,0); // стойност по подразбиране, може да са и 0
        if (current.equals(comparedWith)) {
            // можете да сложите допълнителни проверки за капацитет
            // дадена локация има определен брой рафтове, а всеки от тях - определен брой номера
            // в зависимост от това ще сетвате атрибутите на резултата
            // в конкретната имплементация, продукта се разполага в същата секция, на същия рафт, но на следващо място
            result.setSection(current.getSection());
            result.setShelf(current.getShelf());
            result.setNumber(current.getNumber() + 1);
            return result;
        } else
            // ако локациите са различни, запазваме ги без промяна
            return comparedWith;
    }
}

/*

    public void addProducts(Product product){
        for(Map.Entry<String, List<Product>> current : productMap.entrySet()){
            if(current.getKey().equals(product.getName())){
                List<Product> productsList = current.getValue();
                checkData(productsList, product);
            }
        }
    }
    private void checkData(List<Product> products, Product product){
        for(Product current : products){
            if(current.getExpiryDate() != product.getExpiryDate()){
                checkLocation(products, product);
            }
        }

    }
 */

/*
    private List<Product> productList = new ArrayList<>();

    public void addProducts(Product productToBeAdded) throws InvalidException {
    if(productList.size()==0){
        productList.add(productToBeAdded);
    }
            for (Product current : productList) {
                if (current.getName().equals(productToBeAdded.getName())) {
                    int section = current.getLocation().getSection();
                    int shelf, num;
                    if (!current.getExpiryDate().equals(productToBeAdded.getExpiryDate())) {
                        shelf = current.getLocation().getShelf() + 1;
                        num = current.getLocation().getNumber();
                        Location location = new Location(section, shelf, num);
                        //productToBeAdded.setLocation(location);

                        productList.set(productList.indexOf(current), new Product(current.getName(),
                                current.getExpiryDate(), current.getDateOfReceipt(), current.getManufacturer(),
                        current.getUnit(), current.getCount(), location, current.getComment()));
                      //  productList.rep
                    } else {

                        shelf = current.getLocation().getShelf();
                        num = current.getLocation().getNumber() + 1;
                        //   if(num < maxNumbers)
                        Location location = new Location(section, shelf, num);
                        productToBeAdded.setLocation(location);
                    }
                    productList.add(productToBeAdded);
                    System.out.println("success!");
                }

                }
            }





    public void printProducts(){
        if(productList.size() >  0) {
            for (int i = 0; i <= productList.size(); i++) {
                int totalCount = productList.get(i).getCount();
                if (productList.get(i).getName() == productList.get(i + 1).getName()) {
                    totalCount += productList.get(i + 1).getCount();

                }
                System.out.println("Product: " + productList.get(i).getName()  + " has count: " + totalCount);
            }

        }else
            System.out.println("In the list has no elements!Please first add and then call me!");
    }
 */


    /*
    private Map<String, Product> mapOfProducts = new HashMap<>();


    public void addProduct(Product product) {
        mapOfProducts.put(product.getName(), product);
        //locationSet.add(location);
    }

    public void addProducts(Product productToBeAdded){
        for(Map.Entry<String, Product> current : mapOfProducts.entrySet()){
            if(current.getKey() == productToBeAdded.getName()){
                if(current.getValue().getExpiryDate() != productToBeAdded.getExpiryDate()){
                  //  if( productToBeAdded.getLocation() != current.getValue().getLocation()){
                        mapOfProducts.put(productToBeAdded.getName(), productToBeAdded);

                    }
                }
            }
        }


        public void printProducts(){

            if(mapOfProducts.size() + 1 > 0){
              for(Map.Entry<String, Product> current : mapOfProducts.entrySet()){
               // for(int i = 0; i < mapOfProducts.size(); i++){
                    int count = current.getValue().getCount();
                     for(int j = 1; j < mapOfProducts.size(); j++){
                         if(current.getValue().getName().equals(mapOfProducts.get(j).getName()));
                         count += mapOfProducts.get(j).getCount();
                     }
                    System.out.println("Продуктът " + current.getValue().getName() + " има налично количество "+ count);
              //  }

                 }
            }
        }

*/
