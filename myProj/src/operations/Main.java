package operations;

import operations.Add;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidException {
        Parser parser1 = new Parser();
        parser1.readXML();
        Menu menu = new Menu();
        menu.readMenu();

    }
}

