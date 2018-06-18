package com.kodilla.exception.test;

/*
Stwórz klasę zawierającą logikę imitującą wyszukiwanie lotów:

        a) metoda findFilght(Flight flight)

        b) wewnątrz metody zaimplementuj mapę typu HashMap,
        której kluczem będzie String przechowujący nazwę lotniska,
        a wartością Boolean informujący o tym czy można na dane lotnisko polecieć.
        Przykład: Map<String, Boolean>.

        c) logika powinna wyszukiwać loty w mapie. Jeżeli dane lotnisko nie będzie
        istnieć w mapie, należy rzucić wyjątkiem RouteNotFoundException.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightLogic {

    Map<String, List<String>> flightMap = new HashMap<>();



    public void addNewFlight(Flight flight){
        flightMap.putIfAbsent(flight.getDepartureAirport(), new ArrayList<String>());
        flightMap.get(flight.getDepartureAirport()).add(flight.arrivalAirport);
    }

    public Map<String, List<String>> getFlightMap() {

        for(Map.Entry<String, List<String>> entry: flightMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return flightMap;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Berlin", false);
        flightMap.put("Toronto", true);
        flightMap.put("Tokyo", true);

        String arrivalAirport = flight.getArrivalAirport();
        Boolean checkFlight = flightMap.get(arrivalAirport);
        if (checkFlight != null) {
            return checkFlight;
        } else {
            throw new RouteNotFoundException();
        }

    }
}