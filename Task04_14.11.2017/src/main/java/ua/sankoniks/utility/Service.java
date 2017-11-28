package ua.sankoniks.utility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanko on 29.11.17.
 */
public class Service {

    private List<Figure> figures;
    private Figure[] arrFigures;

    private List<Figure> coloredFigures = new ArrayList<>();
    private List<Figure> notColoredFigures = new ArrayList<>();
    private int numberOfColoredFigures;
    private int numberOfNotColoredFigures;

    public Service(List<Figure> figures) {
        this.figures = figures;
    }

    public List<Figure> divideByColored (List<Figure> figures){
        this.figures = figures;

        for (Figure fig : figures) {
            if (fig instanceof Colored) {
                coloredFigures.add(fig);
                System.out.println("colorrrrr" + fig.toString());
            } else continue;
        }
        return coloredFigures;
    }

    public List<Figure> divideByNotColored (List<Figure> figures){
        this.figures = figures;

        for (Figure fig : figures) {
            if (!(fig instanceof Colored)) {
                notColoredFigures.add(fig);
                System.out.println("NOTcolorrrrr" + fig.toString());
            } else continue;
        }
        return notColoredFigures;
    }
}
