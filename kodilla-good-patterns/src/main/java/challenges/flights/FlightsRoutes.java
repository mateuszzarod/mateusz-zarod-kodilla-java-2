package challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsRoutes {
    private static Set<Flight> flightSet = new HashSet<>();

    public static Set<Flight> getFlightSet() {
        flightSet.add(new Flight(City.KRAKOW, City.WARSAW));
        flightSet.add(new Flight(City.WARSAW, City.KRAKOW));
        flightSet.add(new Flight(City.WARSAW, City.LUBLIN));
        flightSet.add(new Flight(City.LUBLIN, City.WARSAW));
        flightSet.add(new Flight(City.KRAKOW, City.LUBLIN));
        flightSet.add(new Flight(City.LUBLIN, City.KRAKOW));

        return flightSet;
    }
}
