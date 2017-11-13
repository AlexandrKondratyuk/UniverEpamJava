package ua.kondratyuk_olexandr.factory;

import java.util.Random;

/**
 * Created by Sanko on 09.11.17.
 */
public class CGarage {

    public CVehicle randomCVehicle(){
        Random random = new Random();
//        return nextVehicle(random.nextInt(3));
        return nextVehicle(random.nextInt(5));
    }

    public CVehicle nextVehicle(int key){
        switch (key){
            case 0: return new CCar();
            case 1: return new CPlane();
            case 2: return new CShip();
            case 3: return new CCarAmphibija();
            case 4: return new CCarBetMobil();
            default: return null;
        }
    }

}
