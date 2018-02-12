package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class World {
    List<Continent> continentsOnWorld = new ArrayList<>();

    public World(List<Continent> continentsOnWorld) {
        this.continentsOnWorld = continentsOnWorld;
    }

    public List<Continent> getContinentsOnWorld() {
        return continentsOnWorld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof World)) return false;
        World world = (World) o;
        return Objects.equals(getContinentsOnWorld(), world.getContinentsOnWorld());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getContinentsOnWorld());
    }

    @Override
    public String toString() {
        return "World{" +
                "continentsOnWorld=" + continentsOnWorld +
                '}';
    }

    public BigDecimal getPeopleQuantity(){
        return continentsOnWorld.stream()
                .flatMap(continent -> continent.getCountryOnContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current)-> sum = sum.add(current));

   //czyli zwrócony strumień wszystko co jest od return do samego dołu.
    }
}
