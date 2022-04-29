import java.time.LocalDate;
import java.util.*;

public class Add {

    private List<Product> productList = new LinkedList<>();

    public void addProducts(Product productToBeAdded) throws InvalidException {
       for(Product current : productList){
            if(current.getName() == productToBeAdded.getName()){
                if(current.getExpiryDate() != productToBeAdded.getExpiryDate()){
                    int section = current.getLocation().getSection();
                    int shelf =  current.getLocation().getShelf() + 1;
                    int num = current.getLocation().getNumber();
                   Location location = new Location(section, shelf, num);
                   productToBeAdded.setLocation(location);
                }else {
                    int section = current.getLocation().getSection();
                    int shelf = current.getLocation().getShelf();
                    int num = current.getLocation().getNumber() + 1;
                 //   if(num < maxNumbers)
                    Location location = new Location(section, shelf, num);
                    productToBeAdded.setLocation(location);
                }
            }
           System.out.println("success!");
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

    }


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
