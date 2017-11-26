package ua.kondratyuk_olexandr.factory;

/**
 * Created by Sanko on 08.11.17.
 */
public class CCar extends CVehicle implements IMoveAble{

    public CCar() {
        super();
        this.setName("car-" + (byte)(Math.random()*10+1));
        this.setCoordinate("City-" + (int)(Math.random()*10));
        this.setPrice((int)(Math.random()*90_000)+10_000);
        this.setSpeed((int) (Math.random()*590)+10);
        this.setYear((short)((Math.random()*17)+2_001));
    }

    public CCar(String name, String coordinate, int price, int speed, short year) {
        super(name, coordinate, price, speed, year);
    }

    @Override
    public String toString() {
        return "Car " + super.toString();
    }
}
