package com.exmaple.carparts;

import java.io.FileNotFoundException;

public class AutoParts {
    public static void main(String[] args) throws FileNotFoundException {
        AutoPartWarehouse warehouse = new AutoPartWarehouse("C:\\Users\\Moritz\\OneDrive - HTL Braunau\\FSST 3AHELS\\src\\com\\exmaple\\carparts\\Autoparts_update.txt",
                "C:\\Users\\Moritz\\OneDrive - HTL Braunau\\FSST 3AHELS\\src\\com\\exmaple\\carparts\\Orders.txt");
        warehouse.print();
        warehouse.processOrders();
        System.out.println("*** Warehouse after processing orders ***");
        warehouse.print();
    }
}
