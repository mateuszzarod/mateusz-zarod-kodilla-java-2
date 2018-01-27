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


    //Kamil nie rozumie, co znaczy że zwracany typ jest mało ogólny?
    // może być mniej ogólny?
    //poprawiłem typ na List zmieniłem nazwę, ale nie wiem jaki typ zwracać bardziej ogólny
    //czy ta metoda ma pokazywać jakie elementy są na liście figure?

    public List<Shape> getFigures() {
        return  figures;
    }

    public Shape getFigure(int n){
        return figures.get(n);
    }

    public void addFigure(Shape shape){
         figures.add(shape);
    }

    //Kamil może trochę przekombinowałem ale chciałem powalczyć z tym boolean
    // :D ale dałoby się zrobić i metodę i test prościej? :)

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }

}
