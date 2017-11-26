package ua.kondratyuk_olexandr.factory;

/**
 * Created by Sanko on 08.11.17.
 */
public class CShip extends CVehicle implements ISwimAble{

    private int passengersNumber;
    private String homePort;

    public CShip() {
        super();
        this.setName("ship-" + (byte)(Math.random()*10+1));
        this.setCoordinate("City-" + (int)(Math.random()*10));
        this.setPrice((int)(Math.random()*900_000)+100_000);
        this.setSpeed((int) (Math.random()*250)+10);
        this.setYear((short)((Math.random()*17)+2_001));
        this.setPassengersNumber(((int) (Math.random()*4_000)));
        this.setHomePort("HomePort - " + (byte)(Math.random()*10+1));
    }

    public CShip(int passengersNumber, String homePort) {
        super();
        this.passengersNumber = passengersNumber;
        this.homePort = homePort;
    }

    public CShip(String name, String coordinate, int price, int speed, short year, int passengersNumber, String homePort) {
        super(name, coordinate, price, speed, year);
        this.passengersNumber = passengersNumber;
        this.homePort = homePort;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public String getHomePort() {
        return homePort;
    }

    public void setHomePort(String homePort) {
        this.homePort = homePort;
    }


    @Override
    public String toString() {
        return "Ship " + super.toString() +
                ", passengersNumber=" + passengersNumber +
                ", homePort='" + homePort +"]";
    }
}
