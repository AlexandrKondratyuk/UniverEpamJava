package ua.kondratyuk_olexandr.factory;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sanko on 08.11.17.
 */
public class MainTest {
    public static void main(String[] args) {
        int quantitiesOfVehicles;
        boolean work = true;

        Service service = new Service();

        System.out.print("Type number of vehicles in your garage: ");
        Scanner sc = new Scanner(System.in);
        quantitiesOfVehicles = sc.nextInt();

        CVehicle[] myGarageList = service.createMyGarageList(quantitiesOfVehicles);

        service.typeChoice();

        int choice = sc.nextInt();
        service.consoleLogic(work, service, sc, myGarageList, choice);


//        System.out.println(Arrays.toString(myGarageList));


    }
}
