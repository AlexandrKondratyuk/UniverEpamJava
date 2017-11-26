package ua.sankoniks.patterns.gof_factory_method;

/**
 * Created by Sanko on 17.11.17.
 */
public class FactoryMethodRunner {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.check();
    }

}
