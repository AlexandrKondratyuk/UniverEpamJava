import com.sun.xml.internal.bind.v2.TODO;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * @author Kondratyuk Alexandr
 */
public class FreeSpacePool<T> {

    // количество свободных мест на автобусной остановке
    private final static int POOL_SIZE = 3;

    // создание экземпляра Семафора с указанием количества потоков POOL_SIZE и параметром TRUE, что обеспечивает принцип FIFO
    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);

    //создание экземпляра очереди автобусов, которые подъезжают на остановку
    private final Queue<T> queueFS = new LinkedList<T>();

    // конструктор класса, парамтром которого есть список автобусов в очереди
    public FreeSpacePool(Queue<T> someQueue) {
        queueFS.addAll(someQueue);
    }

    /**
     * @return свободное место на остановке
     */

    public T getFreeSpace() {
        T currentSpace;
        try {
            semaphore.acquire();
            currentSpace = queueFS.poll();
            return currentSpace;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     *
     * @param currentSpace - возвращает в очередь свободное место на остановке
     */
    public void returnAccess(T currentSpace) {
        queueFS.add(currentSpace);
        semaphore.release();
    }
}