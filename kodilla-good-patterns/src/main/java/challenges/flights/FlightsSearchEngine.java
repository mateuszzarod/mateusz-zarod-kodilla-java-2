package challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearchEngine {

    public static List<Flight> flightsFromCity(City departureCity) {
        return FlightsRoutes.getFlightSet().stream()
                .filter(flight -> flight.getDepartureCity() == departureCity)
                .collect(Collectors.toList());
    }

    public static List<Flight> flightsToCity(City arrivalCity) {
        return FlightsRoutes.getFlightSet().stream()
                .filter(flight -> flight.getArrivalCity() == arrivalCity)
                .collect(Collectors.toList());
    }

    public static List<Flight> flightDirectly(City departureCity, City arrivalCity) {
        return FlightsRoutes.getFlightSet().stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity) && flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());

        public static List<City> flightWithTransfer(City departureCity, City arrivalCity){
            List<Flight> transferFly = FlightsSearchEngine.flightsFromCity(departureCity);
            //dalej pomyślę ;)
            return null;

            //tutaj utknąłem bo nie wiem jak  skonstruować metodę -> tutaj wydaje mi się, że trezba skorzystać z powyższym metod
            //najpierw do zmiennej transferFly przpisałem metodę wyżej - która szuka lotów z podanego miasta

            //i tutaj nie rozumiem polecenia ? to znaczy, czy jeśli nie ma połaczenia z Lublina do Krakowa,
            // to szuka mi czy jest połączenie z Lublina do Warszawy, a następnie z Warszawy do Krakowa?

            //Znalezienie lotów poprzez inne miasto np. lot z Gdańska przez Kraków do Wrocławia i jak to przetłuamczyć metodzie

        }
    }
}
