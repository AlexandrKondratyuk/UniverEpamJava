import java.util.LinkedList;

/**
 * @author Kondratyuk Alexandr
 *
 * Создаем 3 свободных места на остановке и пул 15 автобусов, которые хотят загрузить пассажиров
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<FreeSpace> spaceList = new LinkedList<FreeSpace>();

        spaceList.add(new FreeSpace(1));
        spaceList.add(new FreeSpace(2));
        spaceList.add(new FreeSpace(3));

        FreeSpacePool<FreeSpace> pollFS = new FreeSpacePool<FreeSpace>(spaceList);

        for (int bus = 1; bus <= 15; bus++){
            new Bus(pollFS).start();
        }
    }
}
