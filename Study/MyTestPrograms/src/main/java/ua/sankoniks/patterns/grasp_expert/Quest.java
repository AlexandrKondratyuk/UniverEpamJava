package ua.sankoniks.patterns.grasp_expert;

/**
 * Created by Sanko on 16.11.17.
 */
public class Quest {

    // информационный эксперт
    private int idQuest;
    private int idTest;

    public Quest() {
    }

    public Quest(int idQuest, int idTest) {
        this.idQuest = idQuest;
        this.idTest = idTest;
    }

    public int getIdQuest() {
        return idQuest;
    }

    public void setIdQuest(int idQuest) {
        this.idQuest = idQuest;
    }

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }
}
