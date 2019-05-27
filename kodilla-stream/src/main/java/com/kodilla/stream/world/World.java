package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;

public class World {
    Set<Continent> continents;

    public World(Set<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getWorldPopulation() {
        return this.continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
