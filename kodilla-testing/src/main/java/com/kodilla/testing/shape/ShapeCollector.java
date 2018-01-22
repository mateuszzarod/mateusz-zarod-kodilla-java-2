package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

/**Klasa ShapeCollector ma trzy metody
 * jedną dodającą figurę do kolekcji,
 * drugą usuwającą figurę z kolekcji,
 * trzecią pobierającą z kolekcji figurę z pozycji n listy.*/

public class ShapeCollector {
    ArrayList<Shape> figure = new ArrayList<>();

    //test trzy figury
    //sprawdził getfigure 1,2,3
    //sprawdzić czy zwracają dobre wyniki


    public Shape addFigure(Shape shape){
        return shape;
    }

    public Shape removeFigure(Shape shape){
        return null;
    }

    public Shape getFigure(int n){
        return null;
    }

    public List<Shape> showFigures(){
        return figure;
    }

//czy figura dodana jest ta sama co oczekiwana




}
