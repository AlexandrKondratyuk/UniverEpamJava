package ua.kondratyuk_olexandr.factory;

/**
 * Created by Sanko on 12.11.17.
 */
public class CCarAmphibija extends CCar implements IMoveAble, ISwimAble {

    private int passengersNumber;
    private String homePort;

    public CCarAmphibija() {
    super();
    super.setName("car-amfiija-" + (byte)(Math.random()*10+1));
    this.setPassengersNumber(((int) (Math.random()*4_000)));
    this.setHomePort("HomePort - " + (byte)(Math.random()*10+1));
    }

    public CCarAmphibija(String name, String coordinate, int price, int speed, short year, int passengersNumber, String homePort) {
        super(name, coordinate, price, speed, year);
        this.passengersNumber = passengersNumber;
        this.homePort = homePort;
    }

    public CCarAmphibija(String name, String coordinate, int price, int speed, short year) {
        super(name, coordinate, price, speed, year);
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
        return "CCarAmphibija " + super.toString()
                + ", passengersNumber=" + passengersNumber +
                ", homePort='" + homePort + '\'' +
                "]";
    }
}
