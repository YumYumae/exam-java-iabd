package exo;

import models.Trip;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partie2 {

    public Map<String, Long> countByCity(List<Trip> trips) {
        // coder ici
        return trips.stream()
            .collect(Collectors.groupingBy(Trip::city, Collectors.counting()));
    }

    public Map<String, Double> revenueByDriver(List<Trip> trips) {
        // revenu par chauffeur
        // coder ici
        return trips.stream()
            .collect(Collectors.groupingBy(Trip::driverId, Collectors.summingDouble(Trip::price)));
    }

    public Map<String, Double> avgDurationByCity(List<Trip> trips) {
        // coder ici
        // durée moyenne par ville
        return trips.stream()
            .collect(Collectors.groupingBy(Trip::city, Collectors.averagingDouble(Trip::durationMin)));
    }
}
