package ua.sankoniks.patterns.gof_factory_method;

/**
 * Created by Sanko on 17.11.17.
 */
public abstract class Creator {

    public abstract Product factoryMethod();

    public void anOperation() {
        System.out.println("operation");
    }



}
