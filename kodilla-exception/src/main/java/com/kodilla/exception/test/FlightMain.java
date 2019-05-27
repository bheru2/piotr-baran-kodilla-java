package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            if (flightFinder.findFlight(new Flight("Rome", "Berlin"))) {
                System.out.println("Arrival airport available");
            } else {
                System.out.println("Arrival airport not available");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("The route can not be found");
        }
    }
}
