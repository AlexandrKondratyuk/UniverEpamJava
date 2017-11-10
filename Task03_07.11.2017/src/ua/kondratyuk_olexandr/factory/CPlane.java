package ua.kondratyuk_olexandr.factory;

/**
 * Created by Sanko on 08.11.17.
 */
public class CPlane extends CVehicle implements IFlyAble{
    private int height;
    private int passengersNumber;


    public CPlane() {
        super();
        this.setName("plane-" + (byte)(Math.random()*10+1));
        this.setCoordinate("City-" + (int)(Math.random()*10));
        this.setPrice((int)(Math.random()*900_000)+100_000);
        this.setSpeed((int) (Math.random()*1_500)+100);
        this.setYear((short)((Math.random()*17)+2_001));
        this.setHeight(((int) ((Math.random()*15)*100)+100));
        this.setPassengersNumber(((int) (Math.random()*100)));
    }

    public CPlane(int height, int passengersNumber) {
        super();
        this.height = height;
        this.passengersNumber = passengersNumber;
    }

    public CPlane(String name, String coordinate, int price, int speed, short year, int height, int passengersNumber) {
        super(name, coordinate, price, speed, year);
        this.height = height;
        this.passengersNumber = passengersNumber;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    @Override
    public String toString() {
        return "Plane " + super.toString() + ", height=" + getHeight() + ", passengersNumber=" + getPassengersNumber() + "]";
    }
}
