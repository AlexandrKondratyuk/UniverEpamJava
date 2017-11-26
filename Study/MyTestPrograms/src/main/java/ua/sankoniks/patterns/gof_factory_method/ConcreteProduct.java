package ua.sankoniks.patterns.gof_factory_method;

/**
 * Created by Sanko on 17.11.17.
 */
public class ConcreteProduct implements Product {

    //поля, конструкторы

    public void check() {
        System.out.println("concrete product");
    }
}
