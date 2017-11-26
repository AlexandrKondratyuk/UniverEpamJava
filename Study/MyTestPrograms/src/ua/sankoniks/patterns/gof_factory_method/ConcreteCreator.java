package ua.sankoniks.patterns.gof_factory_method;

/**
 * Created by Sanko on 17.11.17.
 */
public class ConcreteCreator extends Creator {

    public Product factoryMethod() {
        // подготовительные действия
        this.anOperation();
        return new ConcreteProduct();
    }

}
