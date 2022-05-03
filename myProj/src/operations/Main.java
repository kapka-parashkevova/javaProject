package operations;

import operations.Add;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Add addProd = new Add();
            Location loc1 = new Location(1, 2, 3);
            Location loc2 = new Location(2, 5, 3);
            Location loc3 = new Location(1, 2, 7);
            Location loc4 = new Location(2, 1, 1);
            Location loc5 = new Location(2, 5, 4);

            Product pr1 = new Product("Прясно мляко", 70,
                    LocalDate.of(2022, 02, 28), "Бор-Чвор",
                    "литри", 10,loc1,  "млечен продукт");
            Product pr2 = new Product("Кисело мляко", 17,
                    LocalDate.of(2022, 02, 10), "Бор-Чвор",
                    "грама", 3,loc3, "млечен продукт");
            Product pr3 = new Product("Козунак", 50,
                    LocalDate.of(2022, 04, 10), "Казанлъшки",
                    "грама", 7,loc5, "с парченца шоколад");
            Product pr4 = new Product("Локум", 50,
                   LocalDate.of(2021, 6, 29), "България-ООД",
                    "грама", 11, loc4, "с вкус на нар");
            Product pr5 = new Product("Прясно мляко", 70,
                    LocalDate.of(2022, 05, 10), "Бор-Чвор",
                    "литри", 7, loc1,"млечен продукт");
            Product pr6 = new Product("Пилещко месо", 40,
                    LocalDate.of(2022, 03, 28), "Бистра-ООД",
                   "килограми", 8,loc4, "месо от гърди");


            List<Product> productList = new ArrayList<>();
            productList.add(pr1);
            productList.add(pr2);
            productList.add(pr3);
            productList.add(pr5);
            productList.add(pr6);


            addProd.setProductList(productList);

            //addProd.addProduct(pr5);
          //  addProd.addProduct(pr6);
            addProd.displayMap();

        } catch (InvalidException e) {
            e.printStackTrace();
        }
    }
}
