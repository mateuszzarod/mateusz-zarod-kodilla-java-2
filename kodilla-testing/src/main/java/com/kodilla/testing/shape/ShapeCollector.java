package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

/**Klasa ShapeCollector ma trzy metody
 * jedną dodającą figurę do kolekcji,
 * drugą usuwającą figurę z kolekcji,
 * trzecią pobierającą z kolekcji figurę z pozycji n listy.*/

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> figureList = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public ArrayList<Shape> getFigureList() {
        return figureList;
    }

    //w jaki sposób stowrzyć metodę pobierającą element n ze stworzeonej listy?
    public Shape getFigureOnList(int n){
        return figureList.get(n);
    }


    //
    public List<Shape> addFigure(Shape shape){
         figureList.add(shape);
         return figureList;
    }

    // tutaj chciałem stworzyć metodę typu boolean która sprawdza czy figureList zawiera dodany kształt
    public boolean removeFigure(Shape shape){
        return true;
    }


    public List<Shape> showFigures(){
        return null;
    }



}
