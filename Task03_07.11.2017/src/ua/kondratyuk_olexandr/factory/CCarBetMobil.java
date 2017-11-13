package ua.kondratyuk_olexandr.factory;

/**
 * Created by Sanko on 12.11.17.
 */
public class CCarBetMobil extends CCar implements IMoveAble, ISwimAble, IFlyAble {

    private int passengersNumber;
    private String homePort;
    private int height;

    public CCarBetMobil() {
        super();
        super.setName("Betmobil-" + (byte)(Math.random()*10+1));
        this.setPassengersNumber(((int) (Math.random()*4_000)));
        this.setHomePort("HomePort - " + (byte)(Math.random()*10+1));
        this.setHeight(((int) ((Math.random()*15)*1000)+100));
    }

    public CCarBetMobil(String name, String coordinate, int price, int speed, short year, int passengersNumber, String homePort, int height) {
        super(name, coordinate, price, speed, year);
        this.passengersNumber = passengersNumber;
        this.homePort = homePort;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
