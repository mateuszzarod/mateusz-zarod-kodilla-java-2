package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Continent {
    private String continentName;
    private List<Country> countryOnContinent = new ArrayList<>();

    public Continent(String continentName, List<Country> countryOnContinent) {
        this.continentName = continentName;
        this.countryOnContinent = countryOnContinent;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountryOnContinent() {
        return countryOnContinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return Objects.equals(getContinentName(), continent.getContinentName()) &&
                Objects.equals(getCountryOnContinent(), continent.getCountryOnContinent());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getContinentName(), getCountryOnContinent());
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countryOnContinent=" + countryOnContinent +
                '}';
    }
}
