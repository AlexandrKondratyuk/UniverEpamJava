package ua.sankoniks.patterns.gof_factory_method_2;

/**
 * Created by Sanko on 19.11.17.
 */
public class SimpleOrderFactory extends AbstractOrderFactory {

    @Override
    public SimpleOrder createOrder() {
        return new SimpleOrder();
    }

}
