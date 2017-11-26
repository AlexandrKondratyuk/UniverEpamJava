package ua.sankoniks.patterns.grasp_expert;

/**
 * Created by Sanko on 16.11.17.
 */
public class Test {
    // информационный эксперт
    private int id_test;
    private String testName;
    private int questNumber;
    private long time;

    public Test() {
    }

    public Test(int id_test, String testName, int questNumber, long time) {
        this.id_test = id_test;
        this.testName = testName;
        this.questNumber = questNumber;
        this.time = time;
    }

    public int getId_test() {
        return id_test;
    }

    public void setId_test(int id_test) {
        this.id_test = id_test;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getQuestNumber() {
        return questNumber;
    }

    public void setQuestNumber(int questNumber) {
        this.questNumber = questNumber;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
