package com.kodilla.spring.intro.shape;

public class Drawer {
    final Shape shape;

    public Drawer(Shape shape) {
        this.shape = shape;
    }

    public String doDrawing(){
        return shape.draw();
    }
}


    /*  Figure figure;
        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Triangle();
        shape.draw();

        //POLIMORFIZM
        //W momencie wywoływania metody
        // draw() uruchamiana jest metoda
        // odpowiednia dla typu przypisanego
        // do zmiennej obiektu (a nie metoda
        // z klasy Figure).

        figure = new Circle();
        figure.draw();
        figure = new Triangle();
        figure.draw();

        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        circle.draw();
        triangle.draw();
*/

