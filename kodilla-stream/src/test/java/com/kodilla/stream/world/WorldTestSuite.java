package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.Assert.*;

public class WorldTestSuite {
    @Test
    public void testGetPopulation() {
        //Given
        Country poland = new Country("Poland", BigDecimal.valueOf(1));
        Country germany = new Country("Germany", BigDecimal.valueOf(2));
        Country spain = new Country("Spain", BigDecimal.valueOf(3));
        Country japan = new Country("Japan", BigDecimal.valueOf(4));
        Country china = new Country("China", BigDecimal.valueOf(5));
        Country nigeria = new Country("Nigeria", BigDecimal.valueOf(6));
        Country egypt = new Country("Egypt", BigDecimal.valueOf(100));


        Continent europe = new Continent(new HashSet<>(Arrays.asList(poland, germany, spain)));
        Continent asia = new Continent(new HashSet<>(Arrays.asList(japan, china)));
        Continent africa = new Continent(new HashSet<>(Arrays.asList(nigeria, egypt)));

        World world = new World(new HashSet<>(Arrays.asList(europe, asia, africa)));
        //When
        BigDecimal actual = world.getWorldPopulation();
        //Then
        assertEquals(BigDecimal.valueOf(121), actual);
    }
}
