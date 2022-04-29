import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Add addProd = new Add();
            Product pr1 = new Product("Прясно мляко", LocalDate.of(2022, 9, 01),
                    LocalDate.of(2022, 02, 28), "Бор-Чвор",
                    "литри", 10, "прясно мляко");
            Product pr2 = new Product("Кисело мляко", LocalDate.of(2022, 11, 07),
                    LocalDate.of(2022, 02, 10), "Бор-Чвор",
                    "литри", 3, "прясно мляко");
            Product pr3 = new Product("Козунак", LocalDate.of(2022, 8, 13),
                    LocalDate.of(2022, 04, 10), "Казанлъшки",
                    "грама", 7, "с парченца шоколад");
            Product pr4 = new Product("Локум", LocalDate.of(2022, 9, 12),
                    LocalDate.of(2021, 6, 29), "България-ООД",
                    "грама", 11, "с вкус на нар");
            Product pr5 = new Product("Прясно мляко", LocalDate.of(2022, 9, 01),
                    LocalDate.of(2022, 05, 10), "Бор-Чвор",
                    "литри", 7, "прясно мляко");
            Product pr6 = new Product("Пилечко месо", LocalDate.of(2022, 9, 15),
                    LocalDate.of(2022, 03, 28), "Бистра-ООД",
                    "килограми", 8, "от гърди");


            addProd.addProducts(pr1);
            addProd.addProducts(pr2);
            addProd.addProducts(pr3);
            addProd.addProducts(pr4);
            addProd.addProducts(pr5);
            addProd.addProducts(pr6);

            addProd.printProducts();
        } catch (InvalidException e) {
            e.printStackTrace();
        }
    }
}
