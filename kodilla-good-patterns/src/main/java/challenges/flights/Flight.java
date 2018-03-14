package challenges.flights;

import java.util.Objects;
//piszę komentarz, żeby móc wrzucić tę klasę na gita ;)
public class Flight {
        private City departureCity;
        private City arrivalCity;

    public Flight(City departureCity, City arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public City getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getDepartureCity() == flight.getDepartureCity() &&
                getArrivalCity() == flight.getArrivalCity();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDepartureCity(), getArrivalCity());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureCity=" + departureCity +
                ", arrivalCity=" + arrivalCity +
                '}';
    }
}
