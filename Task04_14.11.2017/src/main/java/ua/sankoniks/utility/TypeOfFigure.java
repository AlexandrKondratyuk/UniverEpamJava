package ua.sankoniks.utility;

import java.util.*;


/**
 * Created by Sanko on 28.11.17.
 */
public enum TypeOfFigure {

    POINT ("Point"), COLORPOINT ("ColorPoint"),
    LINE ("Line"), COLORLINE ("ColorLine"),
    TRIANGLE ("Triangle"), COLORTRIANGLE ("ColorTriangle"),
    POLIGON ("Poligon"), COLORPOLIGON ("ColorPoligon");

    String name;

    TypeOfFigure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static final List<TypeOfFigure> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static TypeOfFigure randomTypeOfFigure() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public static List<TypeOfFigure> getVALUES() {
        return VALUES;
    }
}
