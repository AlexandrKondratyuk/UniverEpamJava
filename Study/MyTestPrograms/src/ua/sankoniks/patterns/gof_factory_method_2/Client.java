package ua.sankoniks.patterns.gof_factory_method_2;

/**
 * Created by Sanko on 19.11.17.
 */
public class Client {

    // поля, методы
    public void someOperation(AbstractOrderFactory factory) {
        AbstractOrder order = factory.createOrder();
        order.perform();

    }

}
