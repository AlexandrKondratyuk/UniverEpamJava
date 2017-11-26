package ua.sankoniks.patterns.gof_factory_method_2;

/**
 * Created by Sanko on 19.11.17.
 */
public abstract class AbstractOrderFactory {

    public abstract AbstractOrder createOrder();

    public void anOperation() {
        System.out.println("operation");
    }

}
