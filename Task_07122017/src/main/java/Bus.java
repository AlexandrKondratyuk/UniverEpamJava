/**
 * Created by Sanko on 17.12.17.
 */
public class Bus extends Thread {

    private boolean empty = false;
    private FreeSpacePool<FreeSpace> poolFS;

    public Bus (FreeSpacePool<FreeSpace> poolFS){
        this.poolFS = poolFS;
    }

    public void run(){
        FreeSpace freeSpace = null;

        try {
            freeSpace = poolFS.getFreeSpace();
            empty = true;
            System.err.println("Bus #"+ this.getId() + " drove on FreeSpace #" + freeSpace.getFreeSpaceNumber());
            freeSpace.loadingPassengers();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (freeSpace!=null) {
                empty = false;
                System.err.println("Bus #" + this.getId() + " -  " + freeSpace.getFreeSpaceNumber() + " released()");
                poolFS.returnAccess(freeSpace);
            }
        }
    }

}
