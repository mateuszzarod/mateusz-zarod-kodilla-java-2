package com.kodilla.testing.shape;

//Celem zadania jest przetestowanie klasy, którą musisz napisać, o nazwie, powiedzmy ShapeCollector przy następujących założeniach:
//
//        Klasa ta przechowuje figury geometryczne w kolekcji ArrayList. Figury są następujące: kwadrat, koło, trójkąt (oczywiście użyj angielskich nazw klas).
//        Wszystkie figury implementują interfejs Shape, który musisz przygotować - zawiera on dwie metody:
//        jedna zwraca nazwę figury ("square", "triangle" oraz "circle"),
//        a druga zwraca obliczone pole powierzchni tej figury.
//        Klasy figur implementują interfejs Shape.
//
// Klasa ShapeCollector ma trzy metody:
//        jedną dodającą figurę do kolekcji,
//        drugą usuwającą figurę z kolekcji,
//        trzecią pobierającą z kolekcji figurę z pozycji n listy.


public interface Shape {
    String getShapeName();
    int getField();

}
