package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify (String basicText, String textToBeautify, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(basicText, textToBeautify);
        System.out.println(result);
    }
}

/*
https://stackoverflow.com/questions/13604703/how-do-i-define-a-method-which-takes-a-lambda-as-a-parameter-in-java-8
        http://www.baeldung.com/java-8-lambda-expressions-tips
*/

/*
W metodzie main(String[] args) klasy StreamMain, utwórz obiekt klasy PoemBeautifier i wywołaj kilka razy metodę beautify z różnymi tekstami i różnymi upiększaczami tekstu (wyrażenia lambda).\
        Przykładowymi upiększaczami tekstu mogą być na przykład kody dopisujące znaki “ABC” na początku i na końcu otrzymanego tekstu lub kody zmieniające cały otrzymany tekst na duże litery (skorzystaj z metody toUpperCase() klasy String).
        Wymyśl również dwa własne upiększacze.
        Kod zadania prześlij do Github.*/
