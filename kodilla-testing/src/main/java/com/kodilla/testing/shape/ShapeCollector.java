package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

/**Klasa ShapeCollector ma trzy metody
 * jedną dodającą figurę do kolekcji,
 * drugą usuwającą figurę z kolekcji,
 * trzecią pobierającą z kolekcji figurę z pozycji n listy.*/

public class ShapeCollector {

    //zmemniłem nazwę na taką która nie wskazuje listy
    private List<Shape> figures = new ArrayList<Shape>();

    public ShapeCollector() {
    }

    public List<Shape> getFigures() {
        return  figures;
    }

    public Shape getFigure(int n){
        return figures.get(n);
    }

    public void addFigure(Shape shape){
         figures.add(shape);
    }


    /*public boolean removeFigure(Shape shape){
        boolean result = false;
        if(figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }*/
    public boolean removeFigure(Shape shape){
        return figures.remove(shape);
    }

}
