package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Rome", false);
        airports.put("Dublin", true);
        airports.put("Paris", false);
        airports.put("London", true);

        if (airports.containsKey(flight.getArrivalAirport())) {
            return airports.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("The route can not be found");
        }
    }
}
