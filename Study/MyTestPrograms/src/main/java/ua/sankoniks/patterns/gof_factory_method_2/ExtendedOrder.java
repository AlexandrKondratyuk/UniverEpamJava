package ua.sankoniks.patterns.gof_factory_method_2;

/**
 * Created by Sanko on 19.11.17.
 */
public class ExtendedOrder extends AbstractOrder {

    // поля и методы
    public void perform() {
        System.out.println("Extended order");
    }

}
