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
        System.out.println("exit");
        System.out.println("##########################");


        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] array = input.split(" ");

        do {
            switch (array[0]) {
                case ("open"):
                    break;
                case ("close"):
                    break;
                case ("save"):
                    break;
                case ("save as"):

                    break;
                case ("help"):
                    System.out.println("The following commands are supported:");
                    System.out.println("open <file> opens <file>");
                    System.out.println("close    closes currently opened file");
                    System.out.println("save      saves the currently open file");
                    System.out.println("save      saves the currently open file");
                    System.out.println("help prints this information");
                    System.out.println("exit exists the program ");
                    break;
                case ("add"):
                    Add addProd = new Add();
                    String name = array[0];
                    int expiryDate = Integer.parseInt(array[1]);
                    LocalDate dateOfReceipt = LocalDate.parse(array[2]);
                    String manufacturer = array[3];
                     String unit = array[4];
                     int count = Integer.parseInt(array[5]);
                     Location location = new Location(Integer.parseInt(array[6]), Integer.parseInt(array[7])
                             ,Integer.parseInt(array[8]));
                     String comment = array[9];
                    List<Product> productList = new ArrayList<>();
                    Product pr1 = new Product(name, expiryDate, dateOfReceipt, manufacturer, unit,
                            count, location, comment);
                    productList.add(pr1);
                    addProd.setProductList(productList);
                    addProd.displayMap();

                    break;
            }
        }while(!array[0].equals("exit"));
    }
}
