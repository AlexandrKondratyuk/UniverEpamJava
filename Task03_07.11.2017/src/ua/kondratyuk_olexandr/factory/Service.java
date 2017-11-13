package ua.kondratyuk_olexandr.factory;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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

    public void typeChoice() {
        System.out.println("\nWhat do you want to select?");
        System.out.println("1 - vehicle with minimal price");
        System.out.println("2 - vehicle with maximal speed");
        System.out.println("3 - vehicle younger then SOME years");
        System.out.println("4 - planes from SOME year and with flight height more then SOME height");
        System.out.println("5 - vehicle with SOME minimum speed and SOME maximum speed");
        System.out.println("6 - Find and view all vehicle with have MOVABLE Interface");
        System.out.println("7 - Find and view all vehicle with have SWIMABLE Interface");
        System.out.println("8 - Find and view all vehicle with have FLYABLE Interface");
        System.out.println("0 - to EXIT");
    }

    public void consoleLogic(boolean work, Service service, Scanner sc, CVehicle[] myGarageList, int choice) {
        while (work) {

            int resultIndex = 0;
            int counter = 0;
            int currentYear = 2017;
            int wantedYear = 0;
            int heightOfFlight = 0;
            CVehicle[] sortedArray = null;

            switch (choice) {
                case 1:
                    resultIndex = 0;
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
                    for (int i = 0; i < myGarageList.length - 1; i++) {
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
                case 3:
                    counter = 0;

                    System.out.println("Type the number of years, less or equals than which should be the mechanisms");
                    int numbersOfYears = sc.nextInt();

                    System.out.println((currentYear - numbersOfYears));

                    for (int i = 0; i < myGarageList.length; i++) {
                        if (myGarageList[i].getYear() >= (currentYear - numbersOfYears)) {
                            counter++;
                        }
                    }

                    sortedArray = new CVehicle[counter];
                    counter = 0;
                    for (int i = 0; i < myGarageList.length; i++) {
                        if (myGarageList[i].getYear() >= (currentYear - numbersOfYears)) {
                            sortedArray[counter++] = myGarageList[i];
                        }
                    }

                    if (sortedArray.length == 0) {
                        System.out.println("There are no vehicle that less or equal then " + numbersOfYears + " years.");
                    } else {
                        System.out.println("Vehicle that younger then " + numbersOfYears + " years :");
                        for (CVehicle cVehical :
                                sortedArray) {
                            System.out.println(cVehical.toString());
                        }
                    }

                    service.typeChoice();
                    choice = sc.nextInt();
                    break;
                case 4:
                    counter = 0;

                    System.out.println("Type the year, from which you want to search planes");
                    wantedYear = sc.nextInt();

                    System.out.println("Type the height of flight of planes");
                    heightOfFlight = sc.nextInt();

                    for (int i = 0; i < myGarageList.length; i++) {
                        if (myGarageList[i].getYear() >= wantedYear && myGarageList[i] instanceof CPlane) {
                            if (((CPlane) myGarageList[i]).getHeight() >= heightOfFlight) {
                                counter++;
                            }
                        }
                    }

                    CPlane[] planesArr = new CPlane[counter];
                    counter = 0;
                    for (int i = 0; i < myGarageList.length; i++) {
                        if (myGarageList[i].getYear() >= wantedYear && myGarageList[i] instanceof CPlane) {
                            if (((CPlane) myGarageList[i]).getHeight() >= heightOfFlight) {
                                planesArr[counter++] = (CPlane) myGarageList[i];
                            }
                        }
                    }

                    if (planesArr.length == 0) {
                        System.out.println("There are no planes which correspond to conditions.");
                    } else {
                        System.out.println("Planes that not older then " + wantedYear
                                + " year and with height of flight mor then "
                                + heightOfFlight + " meters are : ");
                        for (CPlane plane : planesArr) {
                            System.out.println(plane.toString());
                        }
                    }

                    service.typeChoice();
                    choice = sc.nextInt();
                    break;
                case 5:
                    counter = 0;
                    int minSpeadNotPlane;
                    int maxSpeadNotPlane;

                    System.out.println("Type the minimum speed of vehicle");
                    minSpeadNotPlane = sc.nextInt();

                    System.out.println("Type the maximum speed of vehicle");
                    maxSpeadNotPlane = sc.nextInt();

                    for (int i = 0; i < myGarageList.length; i++) {
                        if (!(myGarageList[i] instanceof CPlane)
                                && myGarageList[i].getSpeed() >= minSpeadNotPlane
                                && myGarageList[i].getSpeed() <= maxSpeadNotPlane) {
                            counter++;
                        } else continue;
                    }

                    sortedArray = new CVehicle[counter];
                    counter = 0;
                    for (int i = 0; i < myGarageList.length; i++) {
                        if (!(myGarageList[i] instanceof CPlane)
                                && myGarageList[i].getSpeed() >= minSpeadNotPlane
                                && myGarageList[i].getSpeed() <= maxSpeadNotPlane) {
                            sortedArray[counter++] = myGarageList[i];
                        }
                    }

                    if (sortedArray.length == 0) {
                        System.out.println("There are no vehicle which correspond to conditions.");
                    } else {
                        System.out.println("Vehicles which correspond to conditions are :");
                        for (CVehicle cVehical :
                                sortedArray) {
                            System.out.println(cVehical.toString());
                        }
                    }

                    service.typeChoice();
                    choice = sc.nextInt();
                    break;

                case 6:
                    counter = 0;
                    for (int i = 0; i < myGarageList.length; i++) {
                        if (myGarageList[i] instanceof IMoveAble) {
                            counter++;
                        } else continue;
                    }

                    sortedArray = new CVehicle[counter];
                    counter = 0;
                    System.out.println("myGarageList.length " + myGarageList.length);
                    System.out.println("sortedArray.length " + sortedArray.length);
                    for (int i = 0; i < myGarageList.length; i++) {
                        if (myGarageList[i] instanceof IMoveAble) {
                            sortedArray[counter++] = myGarageList[i];
                        }
                    }
                    System.out.println("sortedArray.length" + sortedArray.length);

                    if (sortedArray.length == 0) {
                        System.out.println("There are no vehicle which correspond to conditions.");
                    } else {
                        System.out.println("Vehicles which have MOVABLE Interface");
                        for (CVehicle cVehicle :
                                sortedArray) {
                            System.out.println(cVehicle.toString());
                        }
                    }

                    service.typeChoice();
                    choice = sc.nextInt();
                    break;

                case 7:
                    counter = 0;
                    for (int i = 0; i < myGarageList.length; i++) {
                        if (myGarageList[i] instanceof ISwimAble) {
                            counter++;
                        } else continue;
                    }

                    sortedArray = new CVehicle[counter];
                    counter = 0;
                    System.out.println("myGarageList.length " + myGarageList.length);
                    System.out.println("sortedArray.length " + sortedArray.length);
                    for (int i = 0; i < myGarageList.length; i++) {
                        if (myGarageList[i] instanceof ISwimAble) {
                            sortedArray[counter++] = myGarageList[i];
                        }
                    }
                    System.out.println("sortedArray.length" + sortedArray.length);

                    if (sortedArray.length == 0) {
                        System.out.println("There are no vehicle which correspond to conditions.");
                    } else {
                        System.out.println("Vehicles which have SWIMABLE Interface");
                        for (CVehicle cVehicle :
                                sortedArray) {
                            System.out.println(cVehicle.toString());
                        }
                    }

                    service.typeChoice();
                    choice = sc.nextInt();
                    break;

                case 8:
                    counter = 0;
                    for (int i = 0; i < myGarageList.length; i++) {
                        if (myGarageList[i] instanceof IFlyAble) {
                            counter++;
                        } else continue;
                    }

                    sortedArray = new CVehicle[counter];
                    counter = 0;
                    System.out.println("myGarageList.length " + myGarageList.length);
                    System.out.println("sortedArray.length " + sortedArray.length);
                    for (int i = 0; i < myGarageList.length; i++) {
                        if (myGarageList[i] instanceof IFlyAble) {
                            sortedArray[counter++] = myGarageList[i];
                        }
                    }
                    System.out.println("sortedArray.length" + sortedArray.length);

                    if (sortedArray.length == 0) {
                        System.out.println("There are no vehicle which correspond to conditions.");
                    } else {
                        System.out.println("Vehicles which have FLYABLE Interface");
                        for (CVehicle cVehicle :
                                sortedArray) {
                            System.out.println(cVehicle.toString());
                        }
                    }

                    service.typeChoice();
                    choice = sc.nextInt();
                    break;

                case 0:
                    work = false;
                    break;
                default:
//                    System.out.println("Please, type another number");
                    System.out.println("You chose incorrect number");
                    work = false;
            }
        }
    }

}
