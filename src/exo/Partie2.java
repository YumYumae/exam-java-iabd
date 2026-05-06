package exo;

import models.Trip;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Partie2 {

    Function<Trip, String> byCity = Trip::city;
    Function<Trip, String> byDriver = Trip::driverId;
    ToDoubleFunction<Trip> tripPrice = Trip::price;
    ToDoubleFunction<Trip> tripDuration = Trip::durationMin;

    public Map<String, Long> countByCity(List<Trip> trips) {
        return trips.stream()
                .collect(Collectors.groupingBy(byCity, Collectors.counting()));
    }

    public Map<String, Double> revenueByDriver(List<Trip> trips) {
        return trips.stream()
                .collect(Collectors.groupingBy(byDriver, Collectors.summingDouble(tripPrice)));
    }

    public Map<String, Double> avgDurationByCity(List<Trip> trips) {
        return trips.stream()
                .collect(Collectors.groupingBy(byCity, Collectors.averagingDouble(tripDuration)));
    }
}