package ua.sankoniks.patterns.gof_factory_method_2;

/**
 * Created by Sanko on 19.11.17.
 */
public class ExtendedOrderFactory extends AbstractOrderFactory{

    @Override
    public ExtendedOrder createOrder() {
        return new ExtendedOrder();
    }

}
