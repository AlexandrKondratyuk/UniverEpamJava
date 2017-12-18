import java.util.Random;

/**
 * @author Kondratyuk Alexandr
 *
 * FreeSpace - сущность (место на остановке)
 */
public class FreeSpace {

    private int freeSpaceNumber;

    public FreeSpace(int freeSpaceNumber) {
        this.freeSpaceNumber = freeSpaceNumber;
    }

    public int getFreeSpaceNumber() {
        return freeSpaceNumber;
    }

    public void setFreeSpaceNumber(int freeSpaceNumber) {
        this.freeSpaceNumber = freeSpaceNumber;
    }

    //метод для загрузки пасажиров с задержкой до 1 секунды
    public void loadingPassengers(){
        try {
            Thread.sleep(new Random().nextInt(6000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
