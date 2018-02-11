package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    private String country;
    private BigDecimal peopleQuantity;

    public Country(String country, BigDecimal peopleQuantity) {
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country1 = (Country) o;
        return Objects.equals(getCountry(), country1.getCountry()) &&
                Objects.equals(getPeopleQuantity(), country1.getPeopleQuantity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCountry(), getPeopleQuantity());
    }

    @Override
    public String
    toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
