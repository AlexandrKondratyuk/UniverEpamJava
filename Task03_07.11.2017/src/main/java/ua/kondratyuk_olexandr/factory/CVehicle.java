package ua.kondratyuk_olexandr.factory;

/**
 * Created by Sanko on 08.11.17.
 */
public class CVehicle {

    private String name;
    private String coordinate;
    private int price;
    private int speed;
    private short year;

    public CVehicle() {
        super();
    }

    public CVehicle(String name, String coordinate, int price, int speed, short year) {
        super();
        this.name = name;
        this.coordinate = coordinate;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return " [name=" + getName() + ", Coordinate=" + getCoordinate() + ", Price="
                + getPrice() + ", speed=" + getSpeed() + ", year of manufacture = " + getYear() + "]";
    }
}
