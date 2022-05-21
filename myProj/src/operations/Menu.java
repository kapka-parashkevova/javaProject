package operations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    public void readMenu() throws InvalidException {
        System.out.println("###########MENU###########");
        System.out.println("Choose one of following commands:");
        System.out.println("open <file>");
        System.out.println("close");
        System.out.println("save");
        System.out.println("save as");
        System.out.println("help");
        System.out.println("add");
        System.out.println("print");
        System.out.println("exit");
        System.out.println("##########################");

        Scanner in = new Scanner(System.in);
        String input;

        do {
            input = in.nextLine();
            String[] array = input.split(" ");
            switch (array[0]) {
                case ("open"):
                    Parser parser= new Parser();
                    parser.readXML(array[1]);
                case ("close"):
                    break;
                case ("save"):
                    break;
                case ("save as"):

                    break;
                case ("help"):
                    System.out.println("The following commands are supported:");
                    System.out.println("open <file> opens <file>");
                    System.out.println("close       closes currently opened file");
                    System.out.println("save        saves the currently open file");
                    System.out.println("save        saves the currently open file");
                    System.out.println("help        prints this information");
                    System.out.println("add         product which you want to add");
                    System.out.println("print       ");
                    System.out.println("exit        exists the program ");
                    break;
                case ("add"):
                    Add addProd = new Add();
                    String name = array[1];
                    int expiryDate = Integer.parseInt(array[2]);
                    LocalDate dateOfReceipt = LocalDate.parse(array[3]);
                    String manufacturer = array[4];
                     String unit = array[5];
                     int count = Integer.parseInt(array[6]);
                     Location location = new Location(Integer.parseInt(array[7]), Integer.parseInt(array[8])
                             ,Integer.parseInt(array[9]));
                     String comment = array[10];
                    List<Product> productList = new ArrayList<>();
                    Product pr1 = new Product(name, expiryDate, dateOfReceipt, manufacturer, unit,
                            count, location, comment);

                    productList.add(pr1);
                    addProd.setProductList(productList);
                    System.out.println("Succesfully add");
                  // addProd.displayMap();

                   // break;
                case ("print"):
                    Add addProd1 = new Add();
                    addProd1.displayMap();

            }
        }while(!input.equals("exit"));
    }
}
