package ua.kondratyuk_olexandr.factory;

import java.util.Scanner;

/**
 * Created by Sanko on 09.11.17.
 */
public class Service {

    public CVehicle[] createMyGarageList(int quantitiesOfVehicles) {
        CGarage myGarrage = new CGarage();
        CVehicle[] myGarageList = new CVehicle[quantitiesOfVehicles];
        for (int i = 0; i < myGarageList.length; i++) {
            myGarageList[i] = myGarrage.randomCVehicle();
        }
        return myGarageList;
    }

    public void typeChoice(){
        System.out.println("\nWhat do you want to select?");
        System.out.println("1 - vehicle with minimal price");
        System.out.println("2 - vehicle with maximal speed");
        System.out.println("3 - vehicle younger then 5 years");
        System.out.println("0 - to EXIT");
    }

     public void consoleLogic(boolean work, Service service, Scanner sc, CVehicle[] myGarageList, int choice) {
        while (work) {
            switch (choice) {
                case 1:
                    int resultIndex = 0;
                    for (int i = 1; i < myGarageList.length; i++) {
                        if (myGarageList[i].getPrice() < myGarageList[resultIndex].getPrice()) {
                            resultIndex = i;
                        }
                    }
                    System.out.println("Vehicle with minimal price is: ");
                    System.out.println(myGarageList[resultIndex].toString());
                    service.typeChoice();
                    choice = sc.nextInt();
                    break;
                case 2:
                    resultIndex = 0;
                    for (int i = 0; i < myGarageList.length-1; i++) {
                        if (!(myGarageList[i] instanceof CPlane)) {
                            if (myGarageList[i + 1].getSpeed() > myGarageList[resultIndex].getSpeed() && !(myGarageList[i + 1] instanceof CPlane)) {
                                resultIndex = i;
                            }
                        } else continue;
                    }
                    System.out.println("Vehicle with maximal speed is: ");
                    System.out.println(myGarageList[resultIndex].toString());
                    service.typeChoice();
                    choice = sc.nextInt();
                    break;
                case 3:break;
                case 0: work = false;
                default: work = false;
            }
        }
    }

}
